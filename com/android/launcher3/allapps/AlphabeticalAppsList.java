package com.android.launcher3.allapps;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import com.android.launcher3.AppInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.compat.AlphabeticIndexCompat;
import com.android.launcher3.model.AppNameComparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
public final class AlphabeticalAppsList {
    public C0640fb mAdapter;
    public final List mAdapterItems = new ArrayList();
    private final AppNameComparator mAppNameComparator;
    public final List mApps = new ArrayList();
    private final HashMap mCachedSectionNames = new HashMap();
    public final HashMap mComponentToAppMap = new HashMap();
    public final List mFastScrollerSections = new ArrayList();
    public final List mFilteredApps = new ArrayList();
    private final AlphabeticIndexCompat mIndexer;
    private final Launcher mLauncher;
    public MergeAlgorithm mMergeAlgorithm;
    public int mNumAppRowsInAdapter;
    public int mNumAppsPerRow;
    public int mNumPredictedAppsPerRow;
    public final List mPredictedAppComponents = new ArrayList();
    private final List mPredictedApps = new ArrayList();
    private ArrayList mSearchResults;
    private final List mSections = new ArrayList();

    /* compiled from: PG */
    public final class AdapterItem {
        public AppInfo appInfo = null;
        public int position;
        public int rowAppIndex;
        public int rowIndex;
        public int sectionAppIndex = -1;
        public SectionInfo sectionInfo;
        public String sectionName = null;
        public int viewType;

        public static AdapterItem asApp$ar$ds(int i, SectionInfo sectionInfo2, String str, int i2, AppInfo appInfo2) {
            AdapterItem adapterItem = new AdapterItem();
            adapterItem.viewType = 1;
            adapterItem.position = i;
            adapterItem.sectionInfo = sectionInfo2;
            adapterItem.sectionName = str;
            adapterItem.sectionAppIndex = i2;
            adapterItem.appInfo = appInfo2;
            return adapterItem;
        }

        public static AdapterItem asSectionBreak(int i, SectionInfo sectionInfo2) {
            AdapterItem adapterItem = new AdapterItem();
            adapterItem.viewType = 0;
            adapterItem.position = i;
            adapterItem.sectionInfo = sectionInfo2;
            sectionInfo2.sectionBreakItem = adapterItem;
            return adapterItem;
        }
    }

    /* compiled from: PG */
    public final class FastScrollSectionInfo {
        public AdapterItem fastScrollToItem;
        public final String sectionName;
        public float touchFraction;

        public FastScrollSectionInfo(String str) {
            this.sectionName = str;
        }
    }

    /* compiled from: PG */
    public interface MergeAlgorithm {
        boolean continueMerging(SectionInfo sectionInfo, SectionInfo sectionInfo2, int i, int i2, int i3);
    }

    /* compiled from: PG */
    public final class SectionInfo {
        public AdapterItem firstAppItem;
        public int numApps;
        public AdapterItem sectionBreakItem;
    }

    public AlphabeticalAppsList(Context context) {
        this.mLauncher = Launcher.getLauncher(context);
        this.mIndexer = new AlphabeticIndexCompat(context);
        this.mAppNameComparator = new AppNameComparator(context);
    }

    private final String getAndUpdateCachedSectionName(CharSequence charSequence) {
        String str = (String) this.mCachedSectionNames.get(charSequence);
        if (str != null) {
            return str;
        }
        String computeSectionName = this.mIndexer.computeSectionName(charSequence);
        this.mCachedSectionNames.put(charSequence, computeSectionName);
        return computeSectionName;
    }

    public final boolean hasFilter() {
        return this.mSearchResults != null;
    }

    public final boolean hasNoFilteredResults() {
        return this.mSearchResults != null && this.mFilteredApps.isEmpty();
    }

    public final void onAppsUpdated() {
        this.mApps.clear();
        this.mApps.addAll(this.mComponentToAppMap.values());
        Collections.sort(this.mApps, this.mAppNameComparator.mAppInfoComparator);
        if (this.mLauncher.getResources().getConfiguration().locale.equals(Locale.SIMPLIFIED_CHINESE)) {
            TreeMap treeMap = new TreeMap(this.mAppNameComparator.mSectionNameComparator);
            for (AppInfo appInfo : this.mApps) {
                String andUpdateCachedSectionName = getAndUpdateCachedSectionName(appInfo.title);
                ArrayList arrayList = (ArrayList) treeMap.get(andUpdateCachedSectionName);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    treeMap.put(andUpdateCachedSectionName, arrayList);
                }
                arrayList.add(appInfo);
            }
            ArrayList arrayList2 = new ArrayList(this.mApps.size());
            for (Map.Entry value : treeMap.entrySet()) {
                arrayList2.addAll((Collection) value.getValue());
            }
            this.mApps.clear();
            this.mApps.addAll(arrayList2);
        } else {
            for (AppInfo appInfo2 : this.mApps) {
                getAndUpdateCachedSectionName(appInfo2.title);
            }
        }
        updateAdapterItems();
    }

    public final boolean setOrderedFilter(ArrayList arrayList) {
        ArrayList arrayList2 = this.mSearchResults;
        if (arrayList2 != arrayList) {
            boolean z = arrayList2 != null && arrayList2.equals(arrayList);
            this.mSearchResults = arrayList;
            updateAdapterItems();
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0236  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateAdapterItems() {
        /*
            r15 = this;
            java.util.List r0 = r15.mFilteredApps
            r0.clear()
            java.util.List r0 = r15.mFastScrollerSections
            r0.clear()
            java.util.List r0 = r15.mAdapterItems
            r0.clear()
            java.util.List r0 = r15.mSections
            r0.clear()
            java.util.List r0 = r15.mPredictedApps
            r0.clear()
            java.util.List r0 = r15.mPredictedAppComponents
            boolean r0 = r0.isEmpty()
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x00b2
            boolean r0 = r15.hasFilter()
            if (r0 != 0) goto L_0x00b2
            java.util.List r0 = r15.mPredictedAppComponents
            java.util.Iterator r0 = r0.iterator()
        L_0x0031:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0056
            java.lang.Object r5 = r0.next()
            com.android.launcher3.util.ComponentKey r5 = (com.android.launcher3.util.ComponentKey) r5
            java.util.HashMap r6 = r15.mComponentToAppMap
            java.lang.Object r5 = r6.get(r5)
            com.android.launcher3.AppInfo r5 = (com.android.launcher3.AppInfo) r5
            if (r5 == 0) goto L_0x004c
            java.util.List r6 = r15.mPredictedApps
            r6.add(r5)
        L_0x004c:
            java.util.List r5 = r15.mPredictedApps
            int r5 = r5.size()
            int r6 = r15.mNumPredictedAppsPerRow
            if (r5 != r6) goto L_0x0031
        L_0x0056:
            java.util.List r0 = r15.mPredictedApps
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            com.android.launcher3.allapps.AlphabeticalAppsList$SectionInfo r0 = new com.android.launcher3.allapps.AlphabeticalAppsList$SectionInfo
            r0.<init>()
            com.android.launcher3.allapps.AlphabeticalAppsList$FastScrollSectionInfo r5 = new com.android.launcher3.allapps.AlphabeticalAppsList$FastScrollSectionInfo
            java.lang.String r6 = ""
            r5.<init>(r6)
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r7 = com.android.launcher3.allapps.AlphabeticalAppsList.AdapterItem.asSectionBreak(r3, r0)
            java.util.List r8 = r15.mSections
            r8.add(r0)
            java.util.List r8 = r15.mFastScrollerSections
            r8.add(r5)
            java.util.List r8 = r15.mAdapterItems
            r8.add(r7)
            java.util.List r7 = r15.mPredictedApps
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L_0x0084:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00b5
            java.lang.Object r9 = r7.next()
            com.android.launcher3.AppInfo r9 = (com.android.launcher3.AppInfo) r9
            int r10 = r8 + 1
            int r11 = r0.numApps
            int r12 = r11 + 1
            r0.numApps = r12
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r8 = com.android.launcher3.allapps.AlphabeticalAppsList.AdapterItem.asApp$ar$ds(r8, r0, r6, r11, r9)
            r8.viewType = r1
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r11 = r0.firstAppItem
            if (r11 != 0) goto L_0x00a6
            r0.firstAppItem = r8
            r5.fastScrollToItem = r8
        L_0x00a6:
            java.util.List r11 = r15.mAdapterItems
            r11.add(r8)
            java.util.List r8 = r15.mFilteredApps
            r8.add(r9)
            r8 = r10
            goto L_0x0084
        L_0x00b2:
            r0 = r2
            r5 = r0
            r8 = 0
        L_0x00b5:
            java.util.ArrayList r6 = r15.mSearchResults
            if (r6 != 0) goto L_0x00bc
            java.util.List r6 = r15.mApps
            goto L_0x00e0
        L_0x00bc:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = r15.mSearchResults
            int r9 = r7.size()
            r10 = 0
        L_0x00c8:
            if (r10 >= r9) goto L_0x00e0
            java.lang.Object r11 = r7.get(r10)
            com.android.launcher3.util.ComponentKey r11 = (com.android.launcher3.util.ComponentKey) r11
            java.util.HashMap r12 = r15.mComponentToAppMap
            java.lang.Object r11 = r12.get(r11)
            com.android.launcher3.AppInfo r11 = (com.android.launcher3.AppInfo) r11
            if (r11 == 0) goto L_0x00dd
            r6.add(r11)
        L_0x00dd:
            int r10 = r10 + 1
            goto L_0x00c8
        L_0x00e0:
            java.util.Iterator r6 = r6.iterator()
        L_0x00e4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0146
            java.lang.Object r7 = r6.next()
            com.android.launcher3.AppInfo r7 = (com.android.launcher3.AppInfo) r7
            java.lang.CharSequence r9 = r7.title
            java.lang.String r9 = r15.getAndUpdateCachedSectionName(r9)
            if (r0 == 0) goto L_0x00fe
            boolean r10 = r9.equals(r2)
            if (r10 != 0) goto L_0x0126
        L_0x00fe:
            com.android.launcher3.allapps.AlphabeticalAppsList$SectionInfo r0 = new com.android.launcher3.allapps.AlphabeticalAppsList$SectionInfo
            r0.<init>()
            com.android.launcher3.allapps.AlphabeticalAppsList$FastScrollSectionInfo r2 = new com.android.launcher3.allapps.AlphabeticalAppsList$FastScrollSectionInfo
            r2.<init>(r9)
            java.util.List r5 = r15.mSections
            r5.add(r0)
            java.util.List r5 = r15.mFastScrollerSections
            r5.add(r2)
            boolean r5 = r15.hasFilter()
            if (r5 != 0) goto L_0x0124
            int r5 = r8 + 1
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r8 = com.android.launcher3.allapps.AlphabeticalAppsList.AdapterItem.asSectionBreak(r8, r0)
            java.util.List r10 = r15.mAdapterItems
            r10.add(r8)
            r8 = r5
        L_0x0124:
            r5 = r2
            r2 = r9
        L_0x0126:
            int r10 = r8 + 1
            int r11 = r0.numApps
            int r12 = r11 + 1
            r0.numApps = r12
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r8 = com.android.launcher3.allapps.AlphabeticalAppsList.AdapterItem.asApp$ar$ds(r8, r0, r9, r11, r7)
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r9 = r0.firstAppItem
            if (r9 != 0) goto L_0x013a
            r0.firstAppItem = r8
            r5.fastScrollToItem = r8
        L_0x013a:
            java.util.List r9 = r15.mAdapterItems
            r9.add(r8)
            java.util.List r8 = r15.mFilteredApps
            r8.add(r7)
            r8 = r10
            goto L_0x00e4
        L_0x0146:
            boolean r0 = r15.hasFilter()
            if (r0 == 0) goto L_0x0184
            boolean r0 = r15.hasNoFilteredResults()
            if (r0 == 0) goto L_0x0164
            java.util.List r0 = r15.mAdapterItems
            int r2 = r8 + 1
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r5 = new com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem
            r5.<init>()
            r6 = 3
            r5.viewType = r6
            r5.position = r8
            r0.add(r5)
            goto L_0x0175
        L_0x0164:
            java.util.List r0 = r15.mAdapterItems
            int r2 = r8 + 1
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r5 = new com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem
            r5.<init>()
            r6 = 4
            r5.viewType = r6
            r5.position = r8
            r0.add(r5)
        L_0x0175:
            java.util.List r0 = r15.mAdapterItems
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r5 = new com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem
            r5.<init>()
            r6 = 5
            r5.viewType = r6
            r5.position = r2
            r0.add(r5)
        L_0x0184:
            com.android.launcher3.allapps.AlphabeticalAppsList$MergeAlgorithm r0 = r15.mMergeAlgorithm
            r2 = -1
            if (r0 == 0) goto L_0x0232
            int r0 = r15.mNumAppsPerRow
            if (r0 != 0) goto L_0x018f
            goto L_0x0232
        L_0x018f:
            boolean r0 = r15.hasFilter()
            if (r0 != 0) goto L_0x0232
            r0 = 0
        L_0x0196:
            java.util.List r5 = r15.mSections
            int r5 = r5.size()
            int r5 = r5 + r2
            if (r0 >= r5) goto L_0x0232
            java.util.List r5 = r15.mSections
            java.lang.Object r5 = r5.get(r0)
            com.android.launcher3.allapps.AlphabeticalAppsList$SectionInfo r5 = (com.android.launcher3.allapps.AlphabeticalAppsList.SectionInfo) r5
            int r6 = r5.numApps
            r12 = r6
            r13 = 1
        L_0x01ab:
            java.util.List r6 = r15.mSections
            int r6 = r6.size()
            int r6 = r6 + r2
            if (r0 >= r6) goto L_0x022e
            int r14 = r0 + 1
            com.android.launcher3.allapps.AlphabeticalAppsList$MergeAlgorithm r6 = r15.mMergeAlgorithm
            java.util.List r7 = r15.mSections
            java.lang.Object r7 = r7.get(r14)
            r8 = r7
            com.android.launcher3.allapps.AlphabeticalAppsList$SectionInfo r8 = (com.android.launcher3.allapps.AlphabeticalAppsList.SectionInfo) r8
            int r10 = r15.mNumAppsPerRow
            r7 = r5
            r9 = r12
            r11 = r13
            boolean r6 = r6.continueMerging(r7, r8, r9, r10, r11)
            if (r6 == 0) goto L_0x022e
            java.util.List r6 = r15.mSections
            java.lang.Object r6 = r6.remove(r14)
            com.android.launcher3.allapps.AlphabeticalAppsList$SectionInfo r6 = (com.android.launcher3.allapps.AlphabeticalAppsList.SectionInfo) r6
            java.util.List r7 = r15.mAdapterItems
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r8 = r6.sectionBreakItem
            r7.remove(r8)
            java.util.List r7 = r15.mAdapterItems
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r8 = r5.firstAppItem
            int r7 = r7.indexOf(r8)
            int r8 = r5.numApps
            int r7 = r7 + r8
            r8 = r7
        L_0x01e7:
            int r9 = r6.numApps
            int r9 = r9 + r7
            if (r8 >= r9) goto L_0x0200
            java.util.List r9 = r15.mAdapterItems
            java.lang.Object r9 = r9.get(r8)
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r9 = (com.android.launcher3.allapps.AlphabeticalAppsList.AdapterItem) r9
            r9.sectionInfo = r5
            int r10 = r9.sectionAppIndex
            int r11 = r5.numApps
            int r10 = r10 + r11
            r9.sectionAppIndex = r10
            int r8 = r8 + 1
            goto L_0x01e7
        L_0x0200:
            java.util.List r7 = r15.mAdapterItems
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r8 = r6.firstAppItem
            int r7 = r7.indexOf(r8)
        L_0x0208:
            java.util.List r8 = r15.mAdapterItems
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0220
            java.util.List r8 = r15.mAdapterItems
            java.lang.Object r8 = r8.get(r7)
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r8 = (com.android.launcher3.allapps.AlphabeticalAppsList.AdapterItem) r8
            int r9 = r8.position
            int r9 = r9 + r2
            r8.position = r9
            int r7 = r7 + 1
            goto L_0x0208
        L_0x0220:
            int r7 = r5.numApps
            int r8 = r6.numApps
            int r7 = r7 + r8
            r5.numApps = r7
            int r6 = r6.numApps
            int r12 = r12 + r6
            int r13 = r13 + 1
            goto L_0x01ab
        L_0x022e:
            int r0 = r0 + 1
            goto L_0x0196
        L_0x0232:
            int r0 = r15.mNumAppsPerRow
            if (r0 == 0) goto L_0x0296
            java.util.List r0 = r15.mAdapterItems
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L_0x023d:
            r6 = 0
        L_0x023e:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0266
            java.lang.Object r7 = r0.next()
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r7 = (com.android.launcher3.allapps.AlphabeticalAppsList.AdapterItem) r7
            r7.rowIndex = r3
            int r8 = r7.viewType
            if (r8 != 0) goto L_0x0251
            goto L_0x023d
        L_0x0251:
            if (r8 == r4) goto L_0x0255
            if (r8 != r1) goto L_0x023e
        L_0x0255:
            int r8 = r15.mNumAppsPerRow
            int r8 = r6 % r8
            if (r8 != 0) goto L_0x025e
            int r2 = r2 + 1
            r5 = 0
        L_0x025e:
            r7.rowIndex = r2
            r7.rowAppIndex = r5
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L_0x023e
        L_0x0266:
            int r2 = r2 + r4
            r15.mNumAppRowsInAdapter = r2
            java.util.List r0 = r15.mFastScrollerSections
            int r0 = r0.size()
            float r0 = (float) r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r0
            java.util.List r0 = r15.mFastScrollerSections
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r5 = 0
        L_0x027b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0296
            java.lang.Object r6 = r0.next()
            com.android.launcher3.allapps.AlphabeticalAppsList$FastScrollSectionInfo r6 = (com.android.launcher3.allapps.AlphabeticalAppsList.FastScrollSectionInfo) r6
            com.android.launcher3.allapps.AlphabeticalAppsList$AdapterItem r7 = r6.fastScrollToItem
            int r7 = r7.viewType
            if (r7 == r4) goto L_0x0292
            if (r7 == r1) goto L_0x0292
            r6.touchFraction = r3
            goto L_0x027b
        L_0x0292:
            r6.touchFraction = r5
            float r5 = r5 + r2
            goto L_0x027b
        L_0x0296:
            android.support.v7.widget.fb r0 = r15.mAdapter
            if (r0 == 0) goto L_0x029f
            android.support.v7.widget.fc r0 = r0.mObservable
            r0.mo2879a()
        L_0x029f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.allapps.AlphabeticalAppsList.updateAdapterItems():void");
    }

    public final void updateApps(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AppInfo appInfo = (AppInfo) it.next();
            this.mComponentToAppMap.put(appInfo.toComponentKey(), appInfo);
        }
        onAppsUpdated();
    }
}
