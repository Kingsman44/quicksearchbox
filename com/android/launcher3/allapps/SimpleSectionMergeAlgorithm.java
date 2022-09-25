package com.android.launcher3.allapps;

import com.android.launcher3.allapps.AlphabeticalAppsList;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* compiled from: PG */
final class SimpleSectionMergeAlgorithm implements AlphabeticalAppsList.MergeAlgorithm {
    private final CharsetEncoder mAsciiEncoder = Charset.forName("US-ASCII").newEncoder();
    private final int mMinAppsPerRow;

    public SimpleSectionMergeAlgorithm(int i) {
        this.mMinAppsPerRow = i;
    }

    public final boolean continueMerging(AlphabeticalAppsList.SectionInfo sectionInfo, AlphabeticalAppsList.SectionInfo sectionInfo2, int i, int i2, int i3) {
        AlphabeticalAppsList.AdapterItem adapterItem = sectionInfo.firstAppItem;
        if (adapterItem.viewType != 1) {
            return false;
        }
        int i4 = i / i2;
        int i5 = i % i2;
        return i5 > 0 && i5 < this.mMinAppsPerRow && i4 < 3 && i3 < 2 && !(adapterItem != null && sectionInfo2.firstAppItem != null && this.mAsciiEncoder.canEncode(adapterItem.sectionName) != this.mAsciiEncoder.canEncode(sectionInfo2.firstAppItem.sectionName));
    }
}
