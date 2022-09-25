package com.android.launcher3.model;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Point;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Log;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.LauncherSettings$Favorites;
import com.android.launcher3.Utilities;
import com.android.launcher3.backup.BackupProtos$DeviceProfieData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
public final class GridSizeMigrationTask {
    public static final boolean ENABLED = Utilities.ATLEAST_NOUGAT;
    private final ArrayList mCarryOver;
    private final Context mContext;
    private final int mDestAllAppsRank;
    private final int mDestHotseatSize;
    private final ArrayList mEntryToRemove;
    private final boolean mShouldRemoveX;
    private final boolean mShouldRemoveY;
    private final int mSrcHotseatSize;
    private final int mSrcX;
    private final int mSrcY;
    private final ContentValues mTempValues;
    public final int mTrgX;
    public final int mTrgY;
    private final ArrayList mUpdateOperations;
    private final HashSet mValidPackages;
    private final HashMap mWidgetMinSize;

    /* compiled from: PG */
    final class DbEntry extends ItemInfo implements Comparable {
        public float weight;

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            DbEntry dbEntry = (DbEntry) obj;
            if (this.itemType == 4) {
                if (dbEntry.itemType != 4) {
                    return -1;
                }
                return (dbEntry.spanY * dbEntry.spanX) - (this.spanX * this.spanY);
            } else if (dbEntry.itemType == 4) {
                return 1;
            } else {
                return Float.compare(dbEntry.weight, this.weight);
            }
        }
    }

    /* compiled from: PG */
    final class OptimalPlacementSolution {
        ArrayList finalPlacedItems;
        private final boolean ignoreMove;
        private final ArrayList itemsToPlace;
        float lowestMoveCost = Float.MAX_VALUE;
        float lowestWeightLoss = Float.MAX_VALUE;
        private final boolean[][] occupied;

        public OptimalPlacementSolution(boolean[][] zArr, ArrayList arrayList, boolean z) {
            this.occupied = zArr;
            this.itemsToPlace = arrayList;
            this.ignoreMove = z;
            Collections.sort(arrayList);
        }

        public final void find() {
            find(0, 0.0f, 0.0f, new ArrayList());
        }

        public final void find(int i, float f, float f2, ArrayList arrayList) {
            float f3;
            float f4;
            int i2;
            GridSizeMigrationTask gridSizeMigrationTask;
            int i3;
            float f5;
            int i4;
            int i5 = i;
            float f6 = f;
            float f7 = f2;
            ArrayList arrayList2 = arrayList;
            float f8 = this.lowestWeightLoss;
            if (f6 >= f8) {
                return;
            }
            if (f6 == f8 && f7 >= this.lowestMoveCost) {
                return;
            }
            if (i5 >= this.itemsToPlace.size()) {
                this.lowestWeightLoss = f6;
                this.lowestMoveCost = f7;
                this.finalPlacedItems = GridSizeMigrationTask.deepCopy(arrayList);
                return;
            }
            DbEntry dbEntry = (DbEntry) this.itemsToPlace.get(i5);
            int i6 = dbEntry.cellX;
            int i7 = dbEntry.cellY;
            ArrayList arrayList3 = new ArrayList(arrayList.size() + 1);
            arrayList3.addAll(arrayList2);
            arrayList3.add(dbEntry);
            int i8 = dbEntry.spanX;
            if (i8 > 1 || dbEntry.spanY > 1) {
                int i9 = dbEntry.spanY;
                int i10 = 0;
                while (i10 < GridSizeMigrationTask.this.mTrgY) {
                    int i11 = 0;
                    while (true) {
                        GridSizeMigrationTask gridSizeMigrationTask2 = GridSizeMigrationTask.this;
                        if (i11 >= gridSizeMigrationTask2.mTrgX) {
                            break;
                        }
                        if (i11 != i6) {
                            dbEntry.cellX = i11;
                            f3 = f7 + 1.0f;
                        } else {
                            f3 = f7;
                        }
                        if (i10 != i7) {
                            dbEntry.cellY = i10;
                            f3 += 1.0f;
                        }
                        float f9 = true == this.ignoreMove ? f7 : f3;
                        int i12 = i11;
                        int i13 = i10;
                        int i14 = i9;
                        if (gridSizeMigrationTask2.isVacant(this.occupied, i11, i10, i8, i14)) {
                            GridSizeMigrationTask.markCells$ar$ds(this.occupied, dbEntry, true);
                            find(i5 + 1, f6, f9, arrayList3);
                            GridSizeMigrationTask.markCells$ar$ds(this.occupied, dbEntry, false);
                        }
                        if (i8 > dbEntry.minSpanX) {
                            f4 = f9;
                            if (GridSizeMigrationTask.this.isVacant(this.occupied, i12, i13, i8 - 1, i14)) {
                                dbEntry.spanX--;
                                GridSizeMigrationTask.markCells$ar$ds(this.occupied, dbEntry, true);
                                find(i5 + 1, f6, f4 + 1.0f, arrayList3);
                                GridSizeMigrationTask.markCells$ar$ds(this.occupied, dbEntry, false);
                                dbEntry.spanX++;
                            }
                        } else {
                            f4 = f9;
                        }
                        int i15 = i14;
                        if (i15 > dbEntry.minSpanY) {
                            i2 = i15;
                            if (GridSizeMigrationTask.this.isVacant(this.occupied, i12, i13, i8, i15 - 1)) {
                                dbEntry.spanY--;
                                GridSizeMigrationTask.markCells$ar$ds(this.occupied, dbEntry, true);
                                find(i5 + 1, f6, f4 + 1.0f, arrayList3);
                                GridSizeMigrationTask.markCells$ar$ds(this.occupied, dbEntry, false);
                                dbEntry.spanY++;
                            }
                        } else {
                            i2 = i15;
                        }
                        if (i2 > dbEntry.minSpanY && i8 > dbEntry.minSpanX) {
                            if (GridSizeMigrationTask.this.isVacant(this.occupied, i12, i13, i8 - 1, i2 - 1)) {
                                dbEntry.spanX--;
                                dbEntry.spanY--;
                                GridSizeMigrationTask.markCells$ar$ds(this.occupied, dbEntry, true);
                                find(i5 + 1, f6, f4 + 2.0f, arrayList3);
                                GridSizeMigrationTask.markCells$ar$ds(this.occupied, dbEntry, false);
                                dbEntry.spanX++;
                                dbEntry.spanY++;
                            }
                        }
                        dbEntry.cellX = i6;
                        dbEntry.cellY = i7;
                        i11 = i12 + 1;
                        f7 = f2;
                        i9 = i2;
                        i10 = i13;
                    }
                    int i16 = i9;
                    i10++;
                    f7 = f2;
                }
                try {
                    find(i5 + 1, f6 + dbEntry.weight, f2, arrayList2);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                int i17 = Integer.MAX_VALUE;
                int i18 = Integer.MAX_VALUE;
                int i19 = Integer.MAX_VALUE;
                int i20 = 0;
                while (true) {
                    gridSizeMigrationTask = GridSizeMigrationTask.this;
                    i3 = gridSizeMigrationTask.mTrgY;
                    if (i20 >= i3) {
                        break;
                    }
                    for (int i21 = 0; i21 < GridSizeMigrationTask.this.mTrgX; i21++) {
                        if (!this.occupied[i21][i20]) {
                            if (this.ignoreMove) {
                                i4 = 0;
                            } else {
                                int i22 = dbEntry.cellX - i21;
                                int i23 = dbEntry.cellY - i20;
                                i4 = (i22 * i22) + (i23 * i23);
                            }
                            if (i4 < i19) {
                                i18 = i20;
                                i17 = i21;
                                i19 = i4;
                            }
                        }
                    }
                    i20++;
                }
                if (i17 >= gridSizeMigrationTask.mTrgX || i18 >= i3) {
                    for (int i24 = i5 + 1; i24 < this.itemsToPlace.size(); i24++) {
                        f6 += ((DbEntry) this.itemsToPlace.get(i24)).weight;
                    }
                    find(this.itemsToPlace.size(), f6 + dbEntry.weight, f7, arrayList2);
                    return;
                }
                if (i17 != i6) {
                    dbEntry.cellX = i17;
                    f5 = f7 + 1.0f;
                } else {
                    f5 = f7;
                }
                if (i18 != i7) {
                    dbEntry.cellY = i18;
                    f5 += 1.0f;
                }
                if (true == this.ignoreMove) {
                    f5 = f7;
                }
                GridSizeMigrationTask.markCells$ar$ds(this.occupied, dbEntry, true);
                int i25 = i5 + 1;
                find(i25, f6, f5, arrayList3);
                GridSizeMigrationTask.markCells$ar$ds(this.occupied, dbEntry, false);
                dbEntry.cellX = i6;
                dbEntry.cellY = i7;
                if (i25 < this.itemsToPlace.size()) {
                    float f10 = ((DbEntry) this.itemsToPlace.get(i25)).weight;
                    float f11 = dbEntry.weight;
                    if (f10 >= f11 && !this.ignoreMove) {
                        find(i25, f6 + f11, f7, arrayList2);
                    }
                }
            }
        }
    }

    protected GridSizeMigrationTask(Context context, HashSet hashSet, int i, int i2, int i3) {
        this.mWidgetMinSize = new HashMap();
        this.mTempValues = new ContentValues();
        this.mEntryToRemove = new ArrayList();
        this.mUpdateOperations = new ArrayList();
        this.mCarryOver = new ArrayList();
        this.mContext = context;
        this.mValidPackages = hashSet;
        this.mSrcHotseatSize = i;
        this.mDestHotseatSize = i2;
        this.mDestAllAppsRank = i3;
        this.mTrgY = -1;
        this.mTrgX = -1;
        this.mSrcY = -1;
        this.mSrcX = -1;
        this.mShouldRemoveY = false;
        this.mShouldRemoveX = false;
    }

    private final boolean applyOperations() {
        if (!this.mUpdateOperations.isEmpty()) {
            this.mContext.getContentResolver().applyBatch("com.google.android.launcher.settings", this.mUpdateOperations);
        }
        if (!this.mEntryToRemove.isEmpty()) {
            Log.d("GridSizeMigrationTask", "Removing items: ".concat(String.valueOf(TextUtils.join(", ", this.mEntryToRemove))));
            this.mContext.getContentResolver().delete(LauncherSettings$Favorites.CONTENT_URI, Utilities.createDbSelectionQuery("_id", this.mEntryToRemove), (String[]) null);
        }
        return !this.mUpdateOperations.isEmpty() || !this.mEntryToRemove.isEmpty();
    }

    public static ArrayList deepCopy(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            DbEntry dbEntry = (DbEntry) arrayList.get(i);
            DbEntry dbEntry2 = new DbEntry();
            dbEntry2.copyFrom(dbEntry);
            dbEntry2.weight = dbEntry.weight;
            dbEntry2.minSpanX = dbEntry.minSpanX;
            dbEntry2.minSpanY = dbEntry.minSpanY;
            arrayList2.add(dbEntry2);
        }
        return arrayList2;
    }

    private final int getFolderItemsCount(long j) {
        Cursor query = this.mContext.getContentResolver().query(LauncherSettings$Favorites.CONTENT_URI, new String[]{"_id", "intent"}, "container = " + j, (String[]) null, (String) null, (CancellationSignal) null);
        int i = 0;
        while (query.moveToNext()) {
            try {
                verifyIntent(query.getString(1));
                i++;
            } catch (Exception unused) {
                this.mEntryToRemove.add(Long.valueOf(query.getLong(0)));
            }
        }
        query.close();
        return i;
    }

    private static String getPointString(int i, int i2) {
        return String.format(Locale.ENGLISH, "%d,%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
    }

    public static final void markCells$ar$ds(boolean[][] zArr, DbEntry dbEntry, boolean z) {
        for (int i = dbEntry.cellX; i < dbEntry.cellX + dbEntry.spanX; i++) {
            for (int i2 = dbEntry.cellY; i2 < dbEntry.cellY + dbEntry.spanY; i2++) {
                zArr[i][i2] = z;
            }
        }
    }

    public static void markForMigration(Context context, HashSet hashSet, BackupProtos$DeviceProfieData backupProtos$DeviceProfieData) {
        Utilities.getPrefs(context).edit().putString("migration_src_workspace_size", getPointString((int) backupProtos$DeviceProfieData.desktopCols_, (int) backupProtos$DeviceProfieData.desktopRows_)).putString("migration_src_hotseat_size", getPointString((int) backupProtos$DeviceProfieData.hotseatCount_, backupProtos$DeviceProfieData.allappsRank_)).putStringSet("migration_widget_min_size", hashSet).apply();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v16, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v20, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v13, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v31, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v41, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v42, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v63, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v64, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v65, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v66, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v67, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v45, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v49, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v68, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v69, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v70, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v71, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v74, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v75, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v78, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v79, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v82, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v83, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v77, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v78, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v79, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v58, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v90, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v91, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v92, resolved type: android.content.SharedPreferences} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v93, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v26 */
    /* JADX WARNING: type inference failed for: r48v0 */
    /* JADX WARNING: type inference failed for: r48v1, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v37, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r48v2 */
    /* JADX WARNING: type inference failed for: r48v3 */
    /* JADX WARNING: type inference failed for: r48v4 */
    /* JADX WARNING: type inference failed for: r4v47 */
    /* JADX WARNING: type inference failed for: r4v74 */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04e8, code lost:
        r11 = r1;
        r47 = r2;
        r10 = r46;
        r46 = r3;
        r3 = r45;
        r45 = r5;
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0576, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0578, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x057a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x057b, code lost:
        r47 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x057d, code lost:
        r46 = r3;
        r3 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0581, code lost:
        r45 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05b3, code lost:
        r5 = r0;
        r11 = r1;
        r4 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05db, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05dc, code lost:
        r4 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05df, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05e0, code lost:
        r47 = r2;
        r2 = r4;
        r4 = r44;
        r10 = r46;
        r46 = r3;
        r3 = r45;
        r45 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05ed, code lost:
        r5 = r0;
        r11 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x05ef, code lost:
        r44 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x062d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x062e, code lost:
        r1 = r0;
        r6 = r21;
        r7 = r22;
        r5 = r25;
        r3 = r31;
        r2 = r35;
        r4 = r41;
        r36 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x063d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x063e, code lost:
        r1 = r0;
        r6 = r21;
        r7 = r22;
        r5 = r25;
        r3 = r31;
        r2 = r35;
        r4 = r41;
        r36 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06df, code lost:
        if ((r7.spanY + r10) > r14) goto L_0x06e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0272, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0273, code lost:
        r1 = r0;
        r3 = r9;
        r6 = r21;
        r7 = r22;
        r5 = r25;
        r8 = r26;
        r36 = r34;
        r2 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0283, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0284, code lost:
        r1 = r0;
        r3 = r9;
        r6 = r21;
        r7 = r22;
        r5 = r25;
        r8 = r26;
        r36 = r34;
        r2 = r35;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e2 A[SYNTHETIC, Splitter:B:113:0x02e2] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x062d A[ExcHandler: all (r0v32 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:154:0x0495] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x075a A[Catch:{ Exception -> 0x079d, all -> 0x078b }, LOOP:10: B:254:0x066e->B:314:0x075a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0ae9 A[Catch:{ Exception -> 0x0b25, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0af5 A[Catch:{ Exception -> 0x0b25, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x0759 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0272 A[ExcHandler: all (r0v52 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r34 r35 
      PHI: (r34v6 android.content.SharedPreferences) = (r34v4 android.content.SharedPreferences), (r34v4 android.content.SharedPreferences), (r34v7 android.content.SharedPreferences), (r34v7 android.content.SharedPreferences), (r34v7 android.content.SharedPreferences), (r34v7 android.content.SharedPreferences) binds: [B:98:0x029c, B:82:0x023e, B:46:0x0197, B:68:0x01d6, B:43:0x017f, B:44:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r35v18 java.lang.String) = (r35v55 java.lang.String), (r35v57 java.lang.String), (r35v58 java.lang.String), (r35v61 java.lang.String), (r35v63 java.lang.String), (r35v65 java.lang.String) binds: [B:98:0x029c, B:82:0x023e, B:46:0x0197, B:68:0x01d6, B:43:0x017f, B:44:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:43:0x017f] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean migrateGridIfNeeded(android.content.Context r56) {
        /*
            java.lang.String r1 = "screen"
            java.lang.String r2 = "Workspace migration completed in "
            java.lang.String r3 = "migration_widget_min_size"
            java.lang.String r4 = "GridSizeMigrationTask"
            android.content.SharedPreferences r5 = com.android.launcher3.Utilities.getPrefs(r56)
            com.android.launcher3.LauncherAppState r6 = com.android.launcher3.LauncherAppState.getInstance()
            com.android.launcher3.InvariantDeviceProfile r6 = r6.mInvariantDeviceProfile
            int r7 = r6.numColumns
            int r8 = r6.numRows
            java.lang.String r7 = getPointString(r7, r8)
            int r8 = r6.numHotseatIcons
            int r9 = r6.hotseatAllAppsRank
            java.lang.String r8 = getPointString(r8, r9)
            java.lang.String r9 = "migration_src_workspace_size"
            java.lang.String r10 = ""
            java.lang.String r11 = r5.getString(r9, r10)
            boolean r11 = r7.equals(r11)
            java.lang.String r12 = "migration_src_hotseat_size"
            r13 = 1
            if (r11 == 0) goto L_0x003f
            java.lang.String r10 = r5.getString(r12, r10)
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return r13
        L_0x003f:
            long r10 = java.lang.System.currentTimeMillis()
            r14 = 0
            java.util.HashSet r15 = new java.util.HashSet     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
            r15.<init>()     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
            android.content.pm.PackageManager r13 = r56.getPackageManager()     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
            java.util.List r13 = r13.getInstalledPackages(r14)     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
        L_0x0055:
            boolean r16 = r13.hasNext()     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
            if (r16 == 0) goto L_0x0086
            java.lang.Object r16 = r13.next()     // Catch:{ Exception -> 0x0078, all -> 0x006a }
            r14 = r16
            android.content.pm.PackageInfo r14 = (android.content.pm.PackageInfo) r14     // Catch:{ Exception -> 0x0078, all -> 0x006a }
            java.lang.String r14 = r14.packageName     // Catch:{ Exception -> 0x0078, all -> 0x006a }
            r15.add(r14)     // Catch:{ Exception -> 0x0078, all -> 0x006a }
            r14 = 0
            goto L_0x0055
        L_0x006a:
            r0 = move-exception
            r1 = r0
            r36 = r5
            r6 = r8
            r23 = r10
            r5 = r2
            r8 = r3
            r2 = r7
            r3 = r9
            r7 = r12
            goto L_0x0bf9
        L_0x0078:
            r0 = move-exception
            r1 = r0
            r36 = r5
            r6 = r8
            r23 = r10
            r5 = r2
            r8 = r3
            r2 = r7
            r3 = r9
            r7 = r12
            goto L_0x0bc8
        L_0x0086:
            com.android.launcher3.compat.PackageInstallerCompat r13 = com.android.launcher3.compat.PackageInstallerCompat.getInstance(r56)     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
            java.util.HashMap r13 = r13.updateAndGetActiveSessionCache()     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
            java.util.Set r13 = r13.keySet()     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
            r15.addAll(r13)     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
            java.lang.String r13 = r5.getString(r12, r8)     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
            android.graphics.Point r13 = parsePoint(r13)     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
            int r14 = r13.x     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
            r16 = r15
            int r15 = r6.numHotseatIcons     // Catch:{ Exception -> 0x0bbc, all -> 0x0baf }
            r21 = r8
            java.lang.String r8 = "Removing item "
            r22 = r12
            java.lang.String r12 = "Invalid item type"
            r23 = r10
            java.lang.String r10 = "intent"
            java.lang.String r11 = "itemType"
            r25 = r2
            java.lang.String r2 = "_id"
            r26 = r3
            if (r14 != r15) goto L_0x00f1
            int r14 = r13.y     // Catch:{ Exception -> 0x00e1, all -> 0x00d1 }
            int r15 = r6.hotseatAllAppsRank     // Catch:{ Exception -> 0x00e1, all -> 0x00d1 }
            if (r14 == r15) goto L_0x00c0
            goto L_0x00f1
        L_0x00c0:
            r33 = r2
            r34 = r5
            r35 = r7
            r32 = r10
            r31 = r11
            r30 = r16
            r3 = 0
            r16 = r6
            goto L_0x02c5
        L_0x00d1:
            r0 = move-exception
            r1 = r0
            r36 = r5
            r2 = r7
        L_0x00d6:
            r3 = r9
            r6 = r21
            r7 = r22
            r5 = r25
            r8 = r26
            goto L_0x0bf9
        L_0x00e1:
            r0 = move-exception
            r1 = r0
            r36 = r5
            r2 = r7
        L_0x00e6:
            r3 = r9
            r6 = r21
            r7 = r22
            r5 = r25
            r8 = r26
            goto L_0x0bc8
        L_0x00f1:
            com.android.launcher3.model.GridSizeMigrationTask r14 = new com.android.launcher3.model.GridSizeMigrationTask     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            com.android.launcher3.LauncherAppState r15 = com.android.launcher3.LauncherAppState.getInstance()     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            com.android.launcher3.InvariantDeviceProfile r15 = r15.mInvariantDeviceProfile     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            int r15 = r13.x     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            int r13 = r13.y     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            int r13 = r6.numHotseatIcons     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            int r3 = r6.hotseatAllAppsRank     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            r18 = r15
            r30 = r16
            r15 = r14
            r16 = r56
            r17 = r30
            r19 = r13
            r20 = r3
            r15.<init>((android.content.Context) r16, (java.util.HashSet) r17, (int) r18, (int) r19, (int) r20)     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            android.content.Context r3 = r14.mContext     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            android.content.ContentResolver r31 = r3.getContentResolver()     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            android.net.Uri r32 = com.android.launcher3.LauncherSettings$Favorites.CONTENT_URI     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            r3 = 4
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            r3 = 0
            r13[r3] = r2     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            r3 = 1
            r13[r3] = r11     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            r3 = 2
            r13[r3] = r10     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            r3 = 3
            r13[r3] = r1     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            java.lang.String r34 = "container = -101"
            r35 = 0
            r36 = 0
            r37 = 0
            r33 = r13
            android.database.Cursor r3 = r31.query(r32, r33, r34, r35, r36, r37)     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            int r13 = r3.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            int r15 = r3.getColumnIndexOrThrow(r11)     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            r31 = r11
            int r11 = r3.getColumnIndexOrThrow(r10)     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            int r1 = r3.getColumnIndexOrThrow(r1)     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            r32 = r10
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            r10.<init>()     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
        L_0x014f:
            boolean r16 = r3.moveToNext()     // Catch:{ Exception -> 0x0ba1, all -> 0x0b93 }
            if (r16 == 0) goto L_0x0229
            r33 = r2
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r2 = new com.android.launcher3.model.GridSizeMigrationTask$DbEntry     // Catch:{ Exception -> 0x00e1, all -> 0x00d1 }
            r2.<init>()     // Catch:{ Exception -> 0x00e1, all -> 0x00d1 }
            r34 = r5
            r16 = r6
            long r5 = r3.getLong(r13)     // Catch:{ Exception -> 0x0219, all -> 0x0209 }
            r2.f16556id = r5     // Catch:{ Exception -> 0x0219, all -> 0x0209 }
            int r5 = r3.getInt(r15)     // Catch:{ Exception -> 0x0219, all -> 0x0209 }
            r2.itemType = r5     // Catch:{ Exception -> 0x0219, all -> 0x0209 }
            long r5 = r3.getLong(r1)     // Catch:{ Exception -> 0x0219, all -> 0x0209 }
            r2.screenId = r5     // Catch:{ Exception -> 0x0219, all -> 0x0209 }
            r17 = r1
            int r1 = r14.mSrcHotseatSize     // Catch:{ Exception -> 0x0219, all -> 0x0209 }
            r35 = r7
            r36 = r8
            long r7 = (long) r1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x0197
            java.util.ArrayList r1 = r14.mEntryToRemove     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            long r5 = r2.f16556id     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r1.add(r2)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
        L_0x018a:
            r6 = r16
            r1 = r17
            r2 = r33
            r5 = r34
            r7 = r35
            r8 = r36
            goto L_0x014f
        L_0x0197:
            int r1 = r2.itemType     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
            if (r1 == 0) goto L_0x01c3
            r5 = 1
            if (r1 == r5) goto L_0x01c3
            r5 = 2
            if (r1 == r5) goto L_0x01ab
            r5 = 6
            if (r1 != r5) goto L_0x01a5
            goto L_0x01c3
        L_0x01a5:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
            r1.<init>(r12)     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
            throw r1     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
        L_0x01ab:
            long r5 = r2.f16556id     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
            int r1 = r14.getFolderItemsCount(r5)     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
            if (r1 == 0) goto L_0x01bb
            float r1 = (float) r1     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
            r5 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r5
            r2.weight = r1     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
            goto L_0x01d6
        L_0x01bb:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
            java.lang.String r5 = "Folder is empty"
            r1.<init>(r5)     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
            throw r1     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
        L_0x01c3:
            java.lang.String r1 = r3.getString(r11)     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
            r14.verifyIntent(r1)     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
            int r1 = r2.itemType     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
            if (r1 != 0) goto L_0x01d2
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            goto L_0x01d4
        L_0x01d2:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x01d4:
            r2.weight = r1     // Catch:{ Exception -> 0x01da, all -> 0x0272 }
        L_0x01d6:
            r10.add(r2)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            goto L_0x018a
        L_0x01da:
            r0 = move-exception
            r1 = r0
            long r5 = r2.f16556id     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r7.<init>()     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r8 = r36
            r7.append(r8)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r7.append(r5)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            android.util.Log.d(r4, r5, r1)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            java.util.ArrayList r1 = r14.mEntryToRemove     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            long r5 = r2.f16556id     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r1.add(r2)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r6 = r16
            r1 = r17
            r2 = r33
            r5 = r34
            r7 = r35
            goto L_0x014f
        L_0x0209:
            r0 = move-exception
            r1 = r0
            r2 = r7
            r3 = r9
            r6 = r21
            r7 = r22
            r5 = r25
            r8 = r26
            r36 = r34
            goto L_0x0bf9
        L_0x0219:
            r0 = move-exception
            r1 = r0
            r2 = r7
            r3 = r9
            r6 = r21
            r7 = r22
            r5 = r25
            r8 = r26
            r36 = r34
            goto L_0x0bc8
        L_0x0229:
            r33 = r2
            r34 = r5
            r16 = r6
            r35 = r7
            r3.close()     // Catch:{ Exception -> 0x0b84, all -> 0x0b75 }
            int r1 = r14.mDestHotseatSize     // Catch:{ Exception -> 0x0b84, all -> 0x0b75 }
            int r1 = r1 + -1
        L_0x0238:
            int r2 = r10.size()     // Catch:{ Exception -> 0x0b84, all -> 0x0b75 }
            if (r2 <= r1) goto L_0x0294
            int r2 = r10.size()     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r3 = 2
            int r2 = r2 / r3
            java.lang.Object r2 = r10.get(r2)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r2 = (com.android.launcher3.model.GridSizeMigrationTask.DbEntry) r2     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            int r3 = r10.size()     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r5 = 0
        L_0x024f:
            if (r5 >= r3) goto L_0x0263
            java.lang.Object r6 = r10.get(r5)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r6 = (com.android.launcher3.model.GridSizeMigrationTask.DbEntry) r6     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            float r7 = r6.weight     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            float r11 = r2.weight     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x0260
            r2 = r6
        L_0x0260:
            int r5 = r5 + 1
            goto L_0x024f
        L_0x0263:
            java.util.ArrayList r3 = r14.mEntryToRemove     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            long r5 = r2.f16556id     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r3.add(r5)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r10.remove(r2)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            goto L_0x0238
        L_0x0272:
            r0 = move-exception
            r1 = r0
            r3 = r9
            r6 = r21
            r7 = r22
            r5 = r25
            r8 = r26
            r36 = r34
            r2 = r35
            goto L_0x0bf9
        L_0x0283:
            r0 = move-exception
            r1 = r0
            r3 = r9
            r6 = r21
            r7 = r22
            r5 = r25
            r8 = r26
            r36 = r34
            r2 = r35
            goto L_0x0bc8
        L_0x0294:
            int r1 = r10.size()     // Catch:{ Exception -> 0x0b84, all -> 0x0b75 }
            r2 = 0
            r3 = 0
        L_0x029a:
            if (r2 >= r1) goto L_0x02c0
            java.lang.Object r5 = r10.get(r2)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r5 = (com.android.launcher3.model.GridSizeMigrationTask.DbEntry) r5     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            long r6 = r5.screenId     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r13 = r10
            long r10 = (long) r3     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            int r15 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x02b4
            r5.screenId = r10     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r5.cellX = r3     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r6 = 0
            r5.cellY = r6     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            r14.update(r5)     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
        L_0x02b4:
            int r3 = r3 + 1
            int r5 = r14.mDestAllAppsRank     // Catch:{ Exception -> 0x0283, all -> 0x0272 }
            if (r3 != r5) goto L_0x02bc
            int r3 = r3 + 1
        L_0x02bc:
            int r2 = r2 + 1
            r10 = r13
            goto L_0x029a
        L_0x02c0:
            boolean r1 = r14.applyOperations()     // Catch:{ Exception -> 0x0b84, all -> 0x0b75 }
            r3 = r1
        L_0x02c5:
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ Exception -> 0x0b84, all -> 0x0b75 }
            r2 = r16
            int r5 = r2.numColumns     // Catch:{ Exception -> 0x0b84, all -> 0x0b75 }
            int r2 = r2.numRows     // Catch:{ Exception -> 0x0b84, all -> 0x0b75 }
            r1.<init>(r5, r2)     // Catch:{ Exception -> 0x0b84, all -> 0x0b75 }
            r2 = r34
            r5 = r35
            java.lang.String r6 = r2.getString(r9, r5)     // Catch:{ Exception -> 0x0b70, all -> 0x0b6b }
            android.graphics.Point r6 = parsePoint(r6)     // Catch:{ Exception -> 0x0b70, all -> 0x0b6b }
            boolean r7 = r1.equals(r6)     // Catch:{ Exception -> 0x0b70, all -> 0x0b6b }
            if (r7 != 0) goto L_0x0ae9
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r7.<init>()     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r11 = 3
            r13 = 2
            r10.<init>(r11, r13)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r7.add(r10)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r10.<init>(r11, r11)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r7.add(r10)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r13 = 4
            r10.<init>(r13, r11)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r7.add(r10)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r10.<init>(r13, r13)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r7.add(r10)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r11 = 5
            r10.<init>(r11, r11)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r7.add(r10)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r13 = 6
            r10.<init>(r13, r11)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r7.add(r10)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r10.<init>(r13, r13)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r7.add(r10)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r13 = 7
            r10.<init>(r13, r13)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r7.add(r10)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            int r10 = r7.indexOf(r6)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            int r14 = r7.indexOf(r1)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            if (r10 < 0) goto L_0x0aac
            if (r14 < 0) goto L_0x0aac
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r1.<init>()     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            android.content.SharedPreferences r6 = com.android.launcher3.Utilities.getPrefs(r56)     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            java.util.Set r15 = java.util.Collections.emptySet()     // Catch:{ Exception -> 0x0ae2, all -> 0x0adb }
            r13 = r26
            java.util.Set r6 = r6.getStringSet(r13, r15)     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
        L_0x0350:
            boolean r15 = r6.hasNext()     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            if (r15 == 0) goto L_0x0381
            java.lang.Object r15 = r6.next()     // Catch:{ Exception -> 0x037b, all -> 0x0375 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x037b, all -> 0x0375 }
            java.lang.String r11 = "#"
            java.lang.String[] r11 = r15.split(r11)     // Catch:{ Exception -> 0x037b, all -> 0x0375 }
            r16 = r3
            r15 = 0
            r3 = r11[r15]     // Catch:{ Exception -> 0x037b, all -> 0x0375 }
            r15 = 1
            r11 = r11[r15]     // Catch:{ Exception -> 0x037b, all -> 0x0375 }
            android.graphics.Point r11 = parsePoint(r11)     // Catch:{ Exception -> 0x037b, all -> 0x0375 }
            r1.put(r3, r11)     // Catch:{ Exception -> 0x037b, all -> 0x0375 }
            r3 = r16
            r11 = 5
            goto L_0x0350
        L_0x0375:
            r0 = move-exception
            r1 = r0
            r36 = r2
            goto L_0x0a92
        L_0x037b:
            r0 = move-exception
            r1 = r0
            r36 = r2
            goto L_0x0aa1
        L_0x0381:
            r16 = r3
        L_0x0383:
            if (r14 >= r10) goto L_0x0a82
            int r6 = r10 + -1
            java.lang.Object r11 = r7.get(r6)     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r20 = r11
            android.graphics.Point r20 = (android.graphics.Point) r20     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            java.lang.Object r10 = r7.get(r10)     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r19 = r10
            android.graphics.Point r19 = (android.graphics.Point) r19     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            com.android.launcher3.model.GridSizeMigrationTask r10 = new com.android.launcher3.model.GridSizeMigrationTask     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            com.android.launcher3.LauncherAppState r11 = com.android.launcher3.LauncherAppState.getInstance()     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            com.android.launcher3.InvariantDeviceProfile r11 = r11.mInvariantDeviceProfile     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r15 = r10
            r16 = r56
            r17 = r30
            r18 = r1
            r15.<init>((android.content.Context) r16, (java.util.HashSet) r17, (java.util.HashMap) r18, (android.graphics.Point) r19, (android.graphics.Point) r20)     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            android.content.Context r11 = r10.mContext     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            java.util.ArrayList r11 = com.android.launcher3.LauncherModel.loadWorkspaceScreensDb(r11)     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            boolean r15 = r11.isEmpty()     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            if (r15 != 0) goto L_0x0a72
            int r15 = r11.size()     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r17 = r1
            r1 = 0
        L_0x03bc:
            if (r1 >= r15) goto L_0x092d
            java.lang.Object r16 = r11.get(r1)     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            java.lang.Long r16 = (java.lang.Long) r16     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r19 = r6
            r18 = r7
            long r6 = r16.longValue()     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r20 = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r14.<init>()     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r16 = r15
            java.lang.String r15 = "Migrating "
            r14.append(r15)     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r14.append(r6)     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            android.util.Log.d(r4, r14)     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            android.content.Context r14 = r10.mContext     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            android.content.ContentResolver r35 = r14.getContentResolver()     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            android.net.Uri r36 = com.android.launcher3.LauncherSettings$Favorites.CONTENT_URI     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r14 = 9
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r15 = 0
            r14[r15] = r33     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r15 = 1
            r14[r15] = r31     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            java.lang.String r15 = "cellX"
            r29 = 2
            r14[r29] = r15     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            java.lang.String r15 = "cellY"
            r28 = 3
            r14[r28] = r15     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            java.lang.String r15 = "spanX"
            r27 = 4
            r14[r27] = r15     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            java.lang.String r15 = "spanY"
            r26 = 5
            r14[r26] = r15     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r15 = 6
            r14[r15] = r32     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            java.lang.String r15 = "appWidgetProvider"
            r34 = 7
            r14[r34] = r15     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            java.lang.String r15 = "appWidgetId"
            r37 = 8
            r14[r37] = r15     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r15.<init>()     // Catch:{ Exception -> 0x0a9d, all -> 0x0a8e }
            r42 = r13
            java.lang.String r13 = "container = -100 AND screen = "
            r15.append(r13)     // Catch:{ Exception -> 0x091f, all -> 0x0911 }
            r15.append(r6)     // Catch:{ Exception -> 0x091f, all -> 0x0911 }
            java.lang.String r38 = r15.toString()     // Catch:{ Exception -> 0x091f, all -> 0x0911 }
            r39 = 0
            r40 = 0
            r41 = 0
            r37 = r14
            android.database.Cursor r13 = r35.query(r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x091f, all -> 0x0911 }
            r14 = r33
            int r15 = r13.getColumnIndexOrThrow(r14)     // Catch:{ Exception -> 0x091f, all -> 0x0911 }
            r35 = r5
            r5 = r31
            r31 = r9
            int r9 = r13.getColumnIndexOrThrow(r5)     // Catch:{ Exception -> 0x090c, all -> 0x0907 }
            r33 = r5
            java.lang.String r5 = "cellX"
            int r5 = r13.getColumnIndexOrThrow(r5)     // Catch:{ Exception -> 0x090c, all -> 0x0907 }
            r36 = r2
            java.lang.String r2 = "cellY"
            int r2 = r13.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r37 = r3
            java.lang.String r3 = "spanX"
            int r3 = r13.getColumnIndexOrThrow(r3)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r38 = r14
            java.lang.String r14 = "spanY"
            int r14 = r13.getColumnIndexOrThrow(r14)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r39 = r11
            r11 = r32
            r32 = r1
            int r1 = r13.getColumnIndexOrThrow(r11)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r40 = r11
            java.lang.String r11 = "appWidgetProvider"
            int r11 = r13.getColumnIndexOrThrow(r11)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r41 = r4
            java.lang.String r4 = "appWidgetId"
            int r4 = r13.getColumnIndexOrThrow(r4)     // Catch:{ Exception -> 0x0902, all -> 0x08fd }
            r43 = r8
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x0902, all -> 0x08fd }
            r8.<init>()     // Catch:{ Exception -> 0x0902, all -> 0x08fd }
        L_0x048d:
            boolean r44 = r13.moveToNext()     // Catch:{ Exception -> 0x0902, all -> 0x08fd }
            if (r44 == 0) goto L_0x064d
            r44 = r8
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r8 = new com.android.launcher3.model.GridSizeMigrationTask$DbEntry     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r8.<init>()     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r45 = r10
            r46 = r11
            long r10 = r13.getLong(r15)     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r8.f16556id = r10     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            int r10 = r13.getInt(r9)     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r8.itemType = r10     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            int r10 = r13.getInt(r5)     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r8.cellX = r10     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            int r10 = r13.getInt(r2)     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r8.cellY = r10     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            int r10 = r13.getInt(r3)     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r8.spanX = r10     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            int r10 = r13.getInt(r14)     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r8.spanY = r10     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r8.screenId = r6     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            int r10 = r8.itemType     // Catch:{ Exception -> 0x05df, all -> 0x062d }
            if (r10 == 0) goto L_0x04d4
            r11 = 1
            if (r10 == r11) goto L_0x04d4
            r11 = 2
            if (r10 == r11) goto L_0x058d
            r11 = 4
            if (r10 == r11) goto L_0x04f6
            r11 = 6
            if (r10 != r11) goto L_0x04e1
        L_0x04d4:
            r47 = r2
            r2 = r4
            r10 = r46
            r46 = r3
            r3 = r45
            r45 = r5
            goto L_0x05b8
        L_0x04e1:
            java.lang.Exception r10 = new java.lang.Exception     // Catch:{ Exception -> 0x04e7, all -> 0x062d }
            r10.<init>(r12)     // Catch:{ Exception -> 0x04e7, all -> 0x062d }
            throw r10     // Catch:{ Exception -> 0x04e7, all -> 0x062d }
        L_0x04e7:
            r0 = move-exception
            r11 = r1
            r47 = r2
            r10 = r46
            r46 = r3
            r3 = r45
            r45 = r5
            r5 = r0
            goto L_0x0585
        L_0x04f6:
            r10 = r46
            java.lang.String r11 = r13.getString(r10)     // Catch:{ Exception -> 0x057a, all -> 0x062d }
            android.content.ComponentName r46 = android.content.ComponentName.unflattenFromString(r11)     // Catch:{ Exception -> 0x057a, all -> 0x062d }
            r47 = r2
            java.lang.String r2 = r46.getPackageName()     // Catch:{ Exception -> 0x0578, all -> 0x062d }
            r46 = r3
            r3 = r45
            r3.verifyPackage(r2)     // Catch:{ Exception -> 0x0576, all -> 0x062d }
            int r2 = r8.spanX     // Catch:{ Exception -> 0x0576, all -> 0x062d }
            float r2 = (float) r2
            r45 = 1058642330(0x3f19999a, float:0.6)
            float r2 = r2 * r45
            r45 = r5
            int r5 = r8.spanY     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            float r5 = (float) r5     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            float r2 = r2 * r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = java.lang.Math.max(r5, r2)     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            r8.weight = r2     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            int r2 = r13.getInt(r4)     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            android.content.Context r5 = r3.mContext     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            com.android.launcher3.compat.AppWidgetManagerCompat r5 = com.android.launcher3.compat.AppWidgetManagerCompat.getInstance(r5)     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            com.android.launcher3.LauncherAppWidgetProviderInfo r2 = r5.getLauncherAppWidgetInfo(r2)     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            if (r2 != 0) goto L_0x053d
            java.util.HashMap r2 = r3.mWidgetMinSize     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            java.lang.Object r2 = r2.get(r11)     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            android.graphics.Point r2 = (android.graphics.Point) r2     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            goto L_0x0541
        L_0x053d:
            android.graphics.Point r2 = r2.getMinSpans$ar$ds()     // Catch:{ Exception -> 0x0574, all -> 0x062d }
        L_0x0541:
            if (r2 == 0) goto L_0x055a
            int r5 = r2.x     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            if (r5 <= 0) goto L_0x054a
            int r5 = r2.x     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            goto L_0x054c
        L_0x054a:
            int r5 = r8.spanX     // Catch:{ Exception -> 0x0574, all -> 0x062d }
        L_0x054c:
            r8.minSpanX = r5     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            int r5 = r2.y     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            if (r5 <= 0) goto L_0x0555
            int r2 = r2.y     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            goto L_0x0557
        L_0x0555:
            int r2 = r8.spanY     // Catch:{ Exception -> 0x0574, all -> 0x062d }
        L_0x0557:
            r8.minSpanY = r2     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            goto L_0x0560
        L_0x055a:
            r2 = 2
            r8.minSpanY = r2     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            r8.minSpanX = r2     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            r2 = 2
        L_0x0560:
            int r5 = r8.minSpanX     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            int r11 = r3.mTrgX     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            if (r5 > r11) goto L_0x056c
            int r5 = r3.mTrgY     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            if (r2 > r5) goto L_0x056c
            r2 = r4
            goto L_0x05a7
        L_0x056c:
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            java.lang.String r5 = "Widget can't be resized down to fit the grid"
            r2.<init>(r5)     // Catch:{ Exception -> 0x0574, all -> 0x062d }
            throw r2     // Catch:{ Exception -> 0x0574, all -> 0x062d }
        L_0x0574:
            r0 = move-exception
            goto L_0x0583
        L_0x0576:
            r0 = move-exception
            goto L_0x0581
        L_0x0578:
            r0 = move-exception
            goto L_0x057d
        L_0x057a:
            r0 = move-exception
            r47 = r2
        L_0x057d:
            r46 = r3
            r3 = r45
        L_0x0581:
            r45 = r5
        L_0x0583:
            r5 = r0
            r11 = r1
        L_0x0585:
            r55 = r44
            r44 = r4
            r4 = r55
            goto L_0x05f1
        L_0x058d:
            r47 = r2
            r2 = r4
            r10 = r46
            r46 = r3
            r3 = r45
            r45 = r5
            long r4 = r8.f16556id     // Catch:{ Exception -> 0x05b2, all -> 0x062d }
            int r4 = r3.getFolderItemsCount(r4)     // Catch:{ Exception -> 0x05b2, all -> 0x062d }
            if (r4 == 0) goto L_0x05aa
            float r4 = (float) r4     // Catch:{ Exception -> 0x05b2, all -> 0x062d }
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r5
            r8.weight = r4     // Catch:{ Exception -> 0x05b2, all -> 0x062d }
        L_0x05a7:
            r4 = r44
            goto L_0x05cc
        L_0x05aa:
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ Exception -> 0x05b2, all -> 0x062d }
            java.lang.String r5 = "Folder is empty"
            r4.<init>(r5)     // Catch:{ Exception -> 0x05b2, all -> 0x062d }
            throw r4     // Catch:{ Exception -> 0x05b2, all -> 0x062d }
        L_0x05b2:
            r0 = move-exception
            r5 = r0
            r11 = r1
            r4 = r44
            goto L_0x05ef
        L_0x05b8:
            java.lang.String r4 = r13.getString(r1)     // Catch:{ Exception -> 0x05db, all -> 0x062d }
            r3.verifyIntent(r4)     // Catch:{ Exception -> 0x05db, all -> 0x062d }
            int r4 = r8.itemType     // Catch:{ Exception -> 0x05db, all -> 0x062d }
            if (r4 != 0) goto L_0x05c7
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            goto L_0x05c9
        L_0x05c7:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x05c9:
            r8.weight = r4     // Catch:{ Exception -> 0x05db, all -> 0x062d }
            goto L_0x05a7
        L_0x05cc:
            r4.add(r8)     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r8 = r4
            r11 = r10
            r5 = r45
            r4 = r2
            r10 = r3
            r3 = r46
            r2 = r47
            goto L_0x048d
        L_0x05db:
            r0 = move-exception
            r4 = r44
            goto L_0x05ed
        L_0x05df:
            r0 = move-exception
            r47 = r2
            r2 = r4
            r4 = r44
            r10 = r46
            r46 = r3
            r3 = r45
            r45 = r5
        L_0x05ed:
            r5 = r0
            r11 = r1
        L_0x05ef:
            r44 = r2
        L_0x05f1:
            long r1 = r8.f16556id     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r48 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r9.<init>()     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r49 = r10
            r10 = r43
            r9.append(r10)     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r9.append(r1)     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            java.lang.String r1 = r9.toString()     // Catch:{ Exception -> 0x063d, all -> 0x062d }
            r2 = r41
            android.util.Log.d(r2, r1, r5)     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            java.util.ArrayList r1 = r3.mEntryToRemove     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            long r8 = r8.f16556id     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            r1.add(r5)     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            r41 = r2
            r8 = r4
            r43 = r10
            r1 = r11
            r4 = r44
            r5 = r45
            r2 = r47
            r9 = r48
            r11 = r49
            r10 = r3
            r3 = r46
            goto L_0x048d
        L_0x062d:
            r0 = move-exception
            r1 = r0
            r6 = r21
            r7 = r22
            r5 = r25
            r3 = r31
            r2 = r35
            r4 = r41
            goto L_0x0b21
        L_0x063d:
            r0 = move-exception
            r1 = r0
            r6 = r21
            r7 = r22
            r5 = r25
            r3 = r31
            r2 = r35
            r4 = r41
            goto L_0x0b31
        L_0x064d:
            r4 = r8
            r3 = r10
            r2 = r41
            r10 = r43
            r13.close()     // Catch:{ Exception -> 0x08f9, all -> 0x08f5 }
            r1 = 2
            float[] r5 = new float[r1]     // Catch:{ Exception -> 0x08f9, all -> 0x08f5 }
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r11 = 0
            r13 = 0
            r14 = 2147483647(0x7fffffff, float:NaN)
            r15 = 2147483647(0x7fffffff, float:NaN)
        L_0x0667:
            int r1 = r3.mSrcX     // Catch:{ Exception -> 0x08f9, all -> 0x08f5 }
            if (r13 >= r1) goto L_0x07b9
            r43 = r10
            r1 = 0
        L_0x066e:
            int r10 = r3.mSrcY     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            if (r1 >= r10) goto L_0x0768
            java.util.ArrayList r10 = deepCopy(r4)     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            r44 = r11
            int r11 = r3.mTrgX     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            r45 = r12
            int r12 = r3.mTrgY     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            r46 = r14
            r47 = r15
            r14 = 2
            int[] r15 = new int[r14]     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            r14 = 1
            r15[r14] = r12     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            r12 = 0
            r15[r12] = r11     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            java.lang.Class r11 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r11, r15)     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            boolean[][] r11 = (boolean[][]) r11     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            boolean r12 = r3.mShouldRemoveX     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            r14 = 1
            if (r14 == r12) goto L_0x069c
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x069d
        L_0x069c:
            r12 = r13
        L_0x069d:
            boolean r15 = r3.mShouldRemoveY     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            if (r14 == r15) goto L_0x06a5
            r14 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x06a6
        L_0x06a5:
            r14 = r1
        L_0x06a6:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            r15.<init>()     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            r48 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            r4.<init>()     // Catch:{ Exception -> 0x07b4, all -> 0x07af }
            r49 = r2
            int r2 = r10.size()     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            r50 = r6
            r6 = 0
        L_0x06bb:
            if (r6 >= r2) goto L_0x0713
            java.lang.Object r7 = r10.get(r6)     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r7 = (com.android.launcher3.model.GridSizeMigrationTask.DbEntry) r7     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            r52 = r2
            int r2 = r7.cellX     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            if (r2 > r12) goto L_0x06d4
            r53 = r10
            int r10 = r7.spanX     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            int r10 = r10 + r2
            if (r10 > r12) goto L_0x06d1
            goto L_0x06d6
        L_0x06d1:
            r54 = r13
            goto L_0x06e1
        L_0x06d4:
            r53 = r10
        L_0x06d6:
            int r10 = r7.cellY     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            if (r10 > r14) goto L_0x06f5
            r54 = r13
            int r13 = r7.spanY     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            int r13 = r13 + r10
            if (r13 <= r14) goto L_0x06f7
        L_0x06e1:
            r4.add(r7)     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            int r2 = r7.cellX     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            if (r2 < r12) goto L_0x06ec
            int r2 = r2 + -1
            r7.cellX = r2     // Catch:{ Exception -> 0x079d, all -> 0x078b }
        L_0x06ec:
            int r2 = r7.cellY     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            if (r2 < r14) goto L_0x070a
            int r2 = r2 + -1
            r7.cellY = r2     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            goto L_0x070a
        L_0x06f5:
            r54 = r13
        L_0x06f7:
            if (r2 <= r12) goto L_0x06fd
            int r2 = r2 + -1
            r7.cellX = r2     // Catch:{ Exception -> 0x079d, all -> 0x078b }
        L_0x06fd:
            if (r10 <= r14) goto L_0x0703
            int r10 = r10 + -1
            r7.cellY = r10     // Catch:{ Exception -> 0x079d, all -> 0x078b }
        L_0x0703:
            r15.add(r7)     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            r2 = 1
            markCells$ar$ds(r11, r7, r2)     // Catch:{ Exception -> 0x079d, all -> 0x078b }
        L_0x070a:
            int r6 = r6 + 1
            r2 = r52
            r10 = r53
            r13 = r54
            goto L_0x06bb
        L_0x0713:
            r54 = r13
            com.android.launcher3.model.GridSizeMigrationTask$OptimalPlacementSolution r2 = new com.android.launcher3.model.GridSizeMigrationTask$OptimalPlacementSolution     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            r6 = 0
            r2.<init>(r11, r4, r6)     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            r2.find()     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            java.util.ArrayList r4 = r2.finalPlacedItems     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            r15.addAll(r4)     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            float r4 = r2.lowestWeightLoss     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            r5[r6] = r4     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            float r2 = r2.lowestMoveCost     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            r4 = 1
            r5[r4] = r2     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            r4 = r5[r6]     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0742
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x073b
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x073b
            goto L_0x0742
        L_0x073b:
            r11 = r44
            r14 = r46
        L_0x073f:
            r15 = r47
            goto L_0x0755
        L_0x0742:
            boolean r6 = r3.mShouldRemoveX     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            r7 = 1
            if (r7 != r6) goto L_0x0749
            r47 = r54
        L_0x0749:
            boolean r6 = r3.mShouldRemoveY     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            if (r7 == r6) goto L_0x0750
            r14 = r46
            goto L_0x0751
        L_0x0750:
            r14 = r1
        L_0x0751:
            r9 = r2
            r8 = r4
            r11 = r15
            goto L_0x073f
        L_0x0755:
            boolean r2 = r3.mShouldRemoveY     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            if (r2 != 0) goto L_0x075a
            goto L_0x0778
        L_0x075a:
            int r1 = r1 + 1
            r12 = r45
            r4 = r48
            r2 = r49
            r6 = r50
            r13 = r54
            goto L_0x066e
        L_0x0768:
            r49 = r2
            r48 = r4
            r50 = r6
            r44 = r11
            r45 = r12
            r54 = r13
            r46 = r14
            r47 = r15
        L_0x0778:
            boolean r1 = r3.mShouldRemoveX     // Catch:{ Exception -> 0x079d, all -> 0x078b }
            if (r1 != 0) goto L_0x077d
            goto L_0x07c3
        L_0x077d:
            int r13 = r54 + 1
            r10 = r43
            r12 = r45
            r4 = r48
            r2 = r49
            r6 = r50
            goto L_0x0667
        L_0x078b:
            r0 = move-exception
            r1 = r0
            r6 = r21
            r7 = r22
            r5 = r25
            r3 = r31
            r2 = r35
            r8 = r42
            r4 = r49
            goto L_0x0bf9
        L_0x079d:
            r0 = move-exception
            r1 = r0
            r6 = r21
            r7 = r22
            r5 = r25
            r3 = r31
            r2 = r35
            r8 = r42
            r4 = r49
            goto L_0x0bc8
        L_0x07af:
            r0 = move-exception
            r1 = r0
            r4 = r2
            goto L_0x0b17
        L_0x07b4:
            r0 = move-exception
            r1 = r0
            r4 = r2
            goto L_0x0b27
        L_0x07b9:
            r49 = r2
            r48 = r4
            r50 = r6
            r43 = r10
            r45 = r12
        L_0x07c3:
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x08f0, all -> 0x08eb }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x08f0, all -> 0x08eb }
            r5 = 0
            r2[r5] = r4     // Catch:{ Exception -> 0x08f0, all -> 0x08eb }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x08f0, all -> 0x08eb }
            r5 = 1
            r2[r5] = r4     // Catch:{ Exception -> 0x08f0, all -> 0x08eb }
            java.lang.Long r4 = java.lang.Long.valueOf(r50)     // Catch:{ Exception -> 0x08f0, all -> 0x08eb }
            r5 = 2
            r2[r5] = r4     // Catch:{ Exception -> 0x08f0, all -> 0x08eb }
            java.lang.String r4 = "Removing row %d, column %d on screen %d"
            java.lang.String r2 = java.lang.String.format(r4, r2)     // Catch:{ Exception -> 0x08f0, all -> 0x08eb }
            r4 = r49
            android.util.Log.d(r4, r2)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            com.android.launcher3.util.LongArrayMap r2 = new com.android.launcher3.util.LongArrayMap     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r2.<init>()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.util.ArrayList r5 = deepCopy(r48)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r6 = r5.size()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r7 = 0
        L_0x07f4:
            if (r7 >= r6) goto L_0x0804
            java.lang.Object r9 = r5.get(r7)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r9 = (com.android.launcher3.model.GridSizeMigrationTask.DbEntry) r9     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            long r12 = r9.f16556id     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r2.put(r12, r9)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r7 = r7 + 1
            goto L_0x07f4
        L_0x0804:
            int r5 = r11.size()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r6 = 0
        L_0x0809:
            if (r6 >= r5) goto L_0x0844
            java.lang.Object r7 = r11.get(r6)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r7 = (com.android.launcher3.model.GridSizeMigrationTask.DbEntry) r7     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            long r9 = r7.f16556id     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.Object r9 = r2.get(r9)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r9 = (com.android.launcher3.model.GridSizeMigrationTask.DbEntry) r9     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            long r12 = r7.f16556id     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r2.remove(r12)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r10 = r9.cellX     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r12 = r7.cellX     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            if (r10 != r12) goto L_0x083e
            int r10 = r9.cellY     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r12 = r7.cellY     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            if (r10 != r12) goto L_0x083e
            int r10 = r9.spanX     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r12 = r7.spanX     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            if (r10 != r12) goto L_0x083e
            int r10 = r9.spanY     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r12 = r7.spanY     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            if (r10 != r12) goto L_0x083e
            long r9 = r9.screenId     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            long r12 = r7.screenId     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0841
        L_0x083e:
            r3.update(r7)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
        L_0x0841:
            int r6 = r6 + 1
            goto L_0x0809
        L_0x0844:
            com.android.launcher3.util.LongArrayMap$ValueIterator r5 = new com.android.launcher3.util.LongArrayMap$ValueIterator     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r5.<init>()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
        L_0x0849:
            boolean r2 = r5.hasNext()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            if (r2 == 0) goto L_0x085b
            java.lang.Object r2 = r5.next()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r2 = (com.android.launcher3.model.GridSizeMigrationTask.DbEntry) r2     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.util.ArrayList r6 = r3.mCarryOver     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r6.add(r2)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            goto L_0x0849
        L_0x085b:
            java.util.ArrayList r2 = r3.mCarryOver     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            if (r2 != 0) goto L_0x08c7
            r2 = 0
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x08c7
            int r2 = r3.mTrgX     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r5 = r3.mTrgY     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r6 = 2
            int[] r7 = new int[r6]     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r6 = 1
            r7[r6] = r5     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r5 = 0
            r7[r5] = r2     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r7)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            boolean[][] r2 = (boolean[][]) r2     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r5 = r11.size()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r6 = 0
        L_0x0882:
            if (r6 >= r5) goto L_0x0891
            java.lang.Object r7 = r11.get(r6)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r7 = (com.android.launcher3.model.GridSizeMigrationTask.DbEntry) r7     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r8 = 1
            markCells$ar$ds(r2, r7, r8)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r6 = r6 + 1
            goto L_0x0882
        L_0x0891:
            com.android.launcher3.model.GridSizeMigrationTask$OptimalPlacementSolution r5 = new com.android.launcher3.model.GridSizeMigrationTask$OptimalPlacementSolution     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.util.ArrayList r6 = r3.mCarryOver     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.util.ArrayList r6 = deepCopy(r6)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r7 = 1
            r5.<init>(r2, r6, r7)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r5.find()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            float r2 = r5.lowestWeightLoss     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x08c7
            java.util.ArrayList r2 = r5.finalPlacedItems     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r5 = r2.size()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r6 = 0
        L_0x08ae:
            if (r6 >= r5) goto L_0x08c2
            java.lang.Object r7 = r2.get(r6)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r7 = (com.android.launcher3.model.GridSizeMigrationTask.DbEntry) r7     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r8 = r50
            r7.screenId = r8     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r3.update(r7)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r6 = r6 + 1
            r50 = r8
            goto L_0x08ae
        L_0x08c2:
            java.util.ArrayList r2 = r3.mCarryOver     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r2.clear()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
        L_0x08c7:
            int r2 = r32 + 1
            r1 = r2
            r10 = r3
            r15 = r16
            r7 = r18
            r6 = r19
            r14 = r20
            r9 = r31
            r31 = r33
            r5 = r35
            r2 = r36
            r3 = r37
            r33 = r38
            r11 = r39
            r32 = r40
            r13 = r42
            r8 = r43
            r12 = r45
            goto L_0x03bc
        L_0x08eb:
            r0 = move-exception
            r4 = r49
            goto L_0x0b16
        L_0x08f0:
            r0 = move-exception
            r4 = r49
            goto L_0x0b26
        L_0x08f5:
            r0 = move-exception
            r4 = r2
            goto L_0x0b16
        L_0x08f9:
            r0 = move-exception
            r4 = r2
            goto L_0x0b26
        L_0x08fd:
            r0 = move-exception
            r4 = r41
            goto L_0x0b16
        L_0x0902:
            r0 = move-exception
            r4 = r41
            goto L_0x0b26
        L_0x0907:
            r0 = move-exception
            r36 = r2
            goto L_0x0b16
        L_0x090c:
            r0 = move-exception
            r36 = r2
            goto L_0x0b26
        L_0x0911:
            r0 = move-exception
            r36 = r2
            r1 = r0
            r2 = r5
            r3 = r9
            r6 = r21
            r7 = r22
            r5 = r25
            goto L_0x0b21
        L_0x091f:
            r0 = move-exception
            r36 = r2
            r1 = r0
            r2 = r5
            r3 = r9
            r6 = r21
            r7 = r22
            r5 = r25
            goto L_0x0b31
        L_0x092d:
            r36 = r2
            r37 = r3
            r35 = r5
            r19 = r6
            r18 = r7
            r43 = r8
            r3 = r10
            r39 = r11
            r45 = r12
            r42 = r13
            r20 = r14
            r40 = r32
            r38 = r33
            r1 = 3
            r26 = 5
            r34 = 7
            r33 = r31
            r31 = r9
            java.util.ArrayList r2 = r3.mCarryOver     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            if (r2 != 0) goto L_0x0a4d
            com.android.launcher3.util.LongArrayMap r2 = new com.android.launcher3.util.LongArrayMap     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r2.<init>()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.util.ArrayList r5 = r3.mCarryOver     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r6 = r5.size()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r7 = 0
        L_0x0963:
            if (r7 < r6) goto L_0x0a35
        L_0x0965:
            com.android.launcher3.model.GridSizeMigrationTask$OptimalPlacementSolution r5 = new com.android.launcher3.model.GridSizeMigrationTask$OptimalPlacementSolution     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r6 = r3.mTrgX     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r7 = r3.mTrgY     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r8 = 2
            int[] r9 = new int[r8]     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r10 = 1
            r9[r10] = r7     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r7 = 0
            r9[r7] = r6     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r9)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            boolean[][] r6 = (boolean[][]) r6     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.util.ArrayList r7 = r3.mCarryOver     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.util.ArrayList r7 = deepCopy(r7)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r9 = 1
            r5.<init>(r6, r7, r9)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r5.find()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.util.ArrayList r6 = r5.finalPlacedItems     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r6 = r6.size()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            if (r6 <= 0) goto L_0x0a2d
            com.android.launcher3.LauncherProvider r6 = com.android.launcher3.LauncherAppState.getLauncherProvider()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            com.android.launcher3.LauncherProvider$DatabaseHelper r6 = r6.mOpenHelper     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            long r6 = r6.generateNewScreenId()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r10 = r39
            r10.add(r9)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.util.ArrayList r5 = r5.finalPlacedItems     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r9 = r5.size()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r11 = 0
        L_0x09ab:
            if (r11 >= r9) goto L_0x09d1
            java.lang.Object r12 = r5.get(r11)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r12 = (com.android.launcher3.model.GridSizeMigrationTask.DbEntry) r12     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.util.ArrayList r13 = r3.mCarryOver     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            long r14 = r12.f16556id     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.Object r14 = r2.get(r14)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            boolean r13 = r13.remove(r14)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            if (r13 == 0) goto L_0x09c9
            r12.screenId = r6     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r3.update(r12)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r11 = r11 + 1
            goto L_0x09ab
        L_0x09c9:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.String r2 = "Unable to find matching items"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            throw r1     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
        L_0x09d1:
            java.util.ArrayList r5 = r3.mCarryOver     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            if (r5 == 0) goto L_0x0a29
            android.net.Uri r2 = com.android.launcher3.LauncherSettings$WorkspaceScreens.CONTENT_URI     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.util.ArrayList r5 = r3.mUpdateOperations     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            android.content.ContentProviderOperation$Builder r6 = android.content.ContentProviderOperation.newDelete(r2)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            android.content.ContentProviderOperation r6 = r6.build()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r5.add(r6)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r5 = r10.size()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r6 = 0
        L_0x09ed:
            if (r6 >= r5) goto L_0x0a26
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r7.<init>()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.Object r9 = r10.get(r6)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            long r11 = r9.longValue()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r11 = r38
            r7.put(r11, r9)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.String r9 = "screenRank"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r7.put(r9, r12)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.util.ArrayList r9 = r3.mUpdateOperations     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            android.content.ContentProviderOperation$Builder r12 = android.content.ContentProviderOperation.newInsert(r2)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            android.content.ContentProviderOperation$Builder r7 = r12.withValues(r7)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            android.content.ContentProviderOperation r7 = r7.build()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r9.add(r7)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r6 = r6 + 1
            r38 = r11
            goto L_0x09ed
        L_0x0a26:
            r11 = r38
            goto L_0x0a50
        L_0x0a29:
            r39 = r10
            goto L_0x0965
        L_0x0a2d:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.String r2 = "None of the items can be placed on an empty screen"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            throw r1     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
        L_0x0a35:
            r11 = r38
            r10 = r39
            r8 = 2
            java.lang.Object r9 = r5.get(r7)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            com.android.launcher3.model.GridSizeMigrationTask$DbEntry r9 = (com.android.launcher3.model.GridSizeMigrationTask.DbEntry) r9     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            long r12 = r9.f16556id     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r2.put(r12, r9)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            int r7 = r7 + 1
            r39 = r10
            r38 = r11
            goto L_0x0963
        L_0x0a4d:
            r11 = r38
            r8 = 2
        L_0x0a50:
            boolean r2 = r3.applyOperations()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r3 = r2 | r37
            r1 = r17
            r7 = r18
            r10 = r19
            r14 = r20
            r9 = r31
            r31 = r33
            r5 = r35
            r2 = r36
            r32 = r40
            r13 = r42
            r8 = r43
            r12 = r45
            r33 = r11
            goto L_0x0383
        L_0x0a72:
            r36 = r2
            r35 = r5
            r31 = r9
            r42 = r13
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.String r2 = "Unable to get workspace screens"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            throw r1     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
        L_0x0a82:
            r36 = r2
            r37 = r3
            r35 = r5
            r31 = r9
            r42 = r13
            goto L_0x0af3
        L_0x0a8e:
            r0 = move-exception
            r36 = r2
            r1 = r0
        L_0x0a92:
            r2 = r5
            r3 = r9
            r8 = r13
            r6 = r21
            r7 = r22
            r5 = r25
            goto L_0x0bf9
        L_0x0a9d:
            r0 = move-exception
            r36 = r2
            r1 = r0
        L_0x0aa1:
            r2 = r5
            r3 = r9
            r8 = r13
            r6 = r21
            r7 = r22
            r5 = r25
            goto L_0x0bc8
        L_0x0aac:
            r36 = r2
            r35 = r5
            r31 = r9
            r42 = r26
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r5.<init>()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.String r6 = "Unable to migrate grid size from "
            r5.append(r6)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r5.append(r3)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.String r3 = " to "
            r5.append(r3)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r5.append(r1)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            throw r2     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
        L_0x0adb:
            r0 = move-exception
            r36 = r2
            r1 = r0
            r2 = r5
            goto L_0x00d6
        L_0x0ae2:
            r0 = move-exception
            r36 = r2
            r1 = r0
            r2 = r5
            goto L_0x00e6
        L_0x0ae9:
            r36 = r2
            r16 = r3
            r35 = r5
            r31 = r9
            r42 = r26
        L_0x0af3:
            if (r3 == 0) goto L_0x0b35
            android.content.ContentResolver r5 = r56.getContentResolver()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            android.net.Uri r6 = com.android.launcher3.LauncherSettings$Favorites.CONTENT_URI     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r1 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            boolean r2 = r1.moveToNext()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            r1.close()     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            if (r2 == 0) goto L_0x0b0d
            goto L_0x0b35
        L_0x0b0d:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            java.lang.String r2 = "Removed every thing during grid resize"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
            throw r1     // Catch:{ Exception -> 0x0b25, all -> 0x0b15 }
        L_0x0b15:
            r0 = move-exception
        L_0x0b16:
            r1 = r0
        L_0x0b17:
            r6 = r21
            r7 = r22
            r5 = r25
            r3 = r31
            r2 = r35
        L_0x0b21:
            r8 = r42
            goto L_0x0bf9
        L_0x0b25:
            r0 = move-exception
        L_0x0b26:
            r1 = r0
        L_0x0b27:
            r6 = r21
            r7 = r22
            r5 = r25
            r3 = r31
            r2 = r35
        L_0x0b31:
            r8 = r42
            goto L_0x0bc8
        L_0x0b35:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r5 = r25
            r3.<init>(r5)
            long r1 = r1 - r23
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.v(r4, r1)
            android.content.SharedPreferences$Editor r1 = r36.edit()
            r3 = r31
            r2 = r35
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r2)
            r6 = r21
            r7 = r22
            android.content.SharedPreferences$Editor r1 = r1.putString(r7, r6)
            r8 = r42
            android.content.SharedPreferences$Editor r1 = r1.remove(r8)
            r1.apply()
            r1 = 1
            return r1
        L_0x0b6b:
            r0 = move-exception
            r36 = r2
            r2 = r5
            goto L_0x0b97
        L_0x0b70:
            r0 = move-exception
            r36 = r2
            r2 = r5
            goto L_0x0ba5
        L_0x0b75:
            r0 = move-exception
            r3 = r9
            r6 = r21
            r7 = r22
            r5 = r25
            r8 = r26
            r36 = r34
            r2 = r35
            goto L_0x0bba
        L_0x0b84:
            r0 = move-exception
            r3 = r9
            r6 = r21
            r7 = r22
            r5 = r25
            r8 = r26
            r36 = r34
            r2 = r35
            goto L_0x0bc7
        L_0x0b93:
            r0 = move-exception
            r36 = r5
            r2 = r7
        L_0x0b97:
            r3 = r9
            r6 = r21
            r7 = r22
            r5 = r25
            r8 = r26
            goto L_0x0bba
        L_0x0ba1:
            r0 = move-exception
            r36 = r5
            r2 = r7
        L_0x0ba5:
            r3 = r9
            r6 = r21
            r7 = r22
            r5 = r25
            r8 = r26
            goto L_0x0bc7
        L_0x0baf:
            r0 = move-exception
            r36 = r5
            r6 = r8
            r23 = r10
            r5 = r2
            r8 = r3
            r2 = r7
            r3 = r9
            r7 = r12
        L_0x0bba:
            r1 = r0
            goto L_0x0bf9
        L_0x0bbc:
            r0 = move-exception
            r36 = r5
            r6 = r8
            r23 = r10
            r5 = r2
            r8 = r3
            r2 = r7
            r3 = r9
            r7 = r12
        L_0x0bc7:
            r1 = r0
        L_0x0bc8:
            java.lang.String r9 = "Error during grid migration"
            android.util.Log.e(r4, r9, r1)     // Catch:{ all -> 0x0bf7 }
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            long r9 = r9 - r23
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r4, r1)
            android.content.SharedPreferences$Editor r1 = r36.edit()
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r2)
            android.content.SharedPreferences$Editor r1 = r1.putString(r7, r6)
            android.content.SharedPreferences$Editor r1 = r1.remove(r8)
            r1.apply()
            r1 = 0
            return r1
        L_0x0bf7:
            r0 = move-exception
            goto L_0x0bba
        L_0x0bf9:
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r5)
            long r9 = r9 - r23
            r11.append(r9)
            java.lang.String r5 = r11.toString()
            android.util.Log.v(r4, r5)
            android.content.SharedPreferences$Editor r4 = r36.edit()
            android.content.SharedPreferences$Editor r2 = r4.putString(r3, r2)
            android.content.SharedPreferences$Editor r2 = r2.putString(r7, r6)
            android.content.SharedPreferences$Editor r2 = r2.remove(r8)
            r2.apply()
            goto L_0x0c23
        L_0x0c22:
            throw r1
        L_0x0c23:
            goto L_0x0c22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.model.GridSizeMigrationTask.migrateGridIfNeeded(android.content.Context):boolean");
    }

    private static Point parsePoint(String str) {
        String[] split = str.split(",");
        return new Point(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }

    private final void update(DbEntry dbEntry) {
        this.mTempValues.clear();
        ContentValues contentValues = this.mTempValues;
        contentValues.put("screen", Long.valueOf(dbEntry.screenId));
        contentValues.put("cellX", Integer.valueOf(dbEntry.cellX));
        contentValues.put("cellY", Integer.valueOf(dbEntry.cellY));
        contentValues.put("spanX", Integer.valueOf(dbEntry.spanX));
        contentValues.put("spanY", Integer.valueOf(dbEntry.spanY));
        this.mUpdateOperations.add(ContentProviderOperation.newUpdate(LauncherSettings$Favorites.getContentUri(dbEntry.f16556id)).withValues(this.mTempValues).build());
    }

    private final void verifyIntent(String str) {
        Intent parseUri = Intent.parseUri(str, 0);
        if (parseUri.getComponent() != null) {
            verifyPackage(parseUri.getComponent().getPackageName());
        } else if (parseUri.getPackage() != null) {
            verifyPackage(parseUri.getPackage());
        }
    }

    private final void verifyPackage(String str) {
        if (!this.mValidPackages.contains(str)) {
            throw new Exception("Package not available");
        }
    }

    public final boolean isVacant(boolean[][] zArr, int i, int i2, int i3, int i4) {
        if (i + i3 > this.mTrgX || i2 + i4 > this.mTrgY) {
            return false;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            for (int i6 = 0; i6 < i4; i6++) {
                if (zArr[i5 + i][i6 + i2]) {
                    return false;
                }
            }
        }
        return true;
    }

    protected GridSizeMigrationTask(Context context, HashSet hashSet, HashMap hashMap, Point point, Point point2) {
        HashMap hashMap2 = new HashMap();
        this.mWidgetMinSize = hashMap2;
        this.mTempValues = new ContentValues();
        this.mEntryToRemove = new ArrayList();
        this.mUpdateOperations = new ArrayList();
        this.mCarryOver = new ArrayList();
        this.mContext = context;
        this.mValidPackages = hashSet;
        hashMap2.putAll(hashMap);
        int i = point.x;
        this.mSrcX = i;
        int i2 = point.y;
        this.mSrcY = i2;
        int i3 = point2.x;
        this.mTrgX = i3;
        int i4 = point2.y;
        this.mTrgY = i4;
        boolean z = true;
        this.mShouldRemoveX = i3 < i;
        this.mShouldRemoveY = i4 >= i2 ? false : z;
        this.mDestAllAppsRank = -1;
        this.mDestHotseatSize = -1;
        this.mSrcHotseatSize = -1;
    }
}
