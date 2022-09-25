package com.android.launcher3.allapps;

import com.android.launcher3.allapps.AlphabeticalAppsList;

/* compiled from: PG */
final class FullMergeAlgorithm implements AlphabeticalAppsList.MergeAlgorithm {
    public final boolean continueMerging(AlphabeticalAppsList.SectionInfo sectionInfo, AlphabeticalAppsList.SectionInfo sectionInfo2, int i, int i2, int i3) {
        return sectionInfo.firstAppItem.viewType == 1;
    }
}
