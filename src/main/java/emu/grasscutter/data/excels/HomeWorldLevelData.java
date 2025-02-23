package emu.grasscutter.data.excels;

import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = {"HomeworldLevelExcelConfigData.json"})
public class HomeWorldLevelData extends GameResource {

    int level;
    int exp;
    int homeCoinStoreLimit;
    int homeFetterExpStoreLimit;
    int rewardId;
    int furnitureMakeSlotCount;
    int outdoorUnlockBlockCount;
    int freeUnlockModuleCount;
    int deployNpcCount;
    int limitShopGoodsCount;
    List<String> levelFuncs;

    @Override
    public int getId() {
        return level;
    }
}
