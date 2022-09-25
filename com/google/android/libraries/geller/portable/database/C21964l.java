package com.google.android.libraries.geller.portable.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59315ac;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p4985f.p5030q.p5032b.C65016aa;
import com.google.protos.p4985f.p5030q.p5032b.C65018ac;
import com.google.protos.p4985f.p5030q.p5032b.C65019ad;
import com.google.protos.p4985f.p5030q.p5032b.C65063j;
import com.google.protos.p4985f.p5030q.p5032b.C65066m;
import com.google.protos.p4985f.p5030q.p5032b.C65070q;
import com.google.protos.p4985f.p5030q.p5032b.C65071r;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.geller.portable.database.l */
/* compiled from: PG */
public final class C21964l implements C21957e {

    /* renamed from: a */
    private static final C59071e f60587a = C59071e.m91332i("com.google.android.libraries.geller.portable.database.l");

    /* renamed from: b */
    private final Context f60588b;

    /* renamed from: c */
    private final String f60589c;

    public C21964l(Context context, String str) {
        this.f60588b = context;
        this.f60589c = str;
    }

    /* renamed from: g */
    public static void m41188g(File file) {
        File[] listFiles;
        if (file != null) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File g : listFiles) {
                    m41188g(g);
                }
            }
            try {
                if (file.exists()) {
                    file.delete();
                }
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) f60587a.mo56225c()).mo56382g(e)).mo56372aa(48129)).mo56389s("Failed to delete file: %s", file);
            }
        }
    }

    /* renamed from: h */
    static byte[][] m41189h(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, C58833ax axVar) {
        List<String> b = C21963k.m41183b(sQLiteDatabase, "geller_file_table", "file_path", str, strArr, C58833ax.m90834k("timestamp_micro DESC"), axVar);
        ArrayList arrayList = new ArrayList();
        for (String l : b) {
            C58833ax l2 = m41193l(l);
            if (l2.mo56113h()) {
                arrayList.add((byte[]) l2.mo56107c());
            }
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    /* renamed from: i */
    static long m41190i(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("delete_status", C21955c.m41135a(i));
        return (long) sQLiteDatabase.update("geller_file_table", contentValues, str, strArr);
    }

    /* renamed from: j */
    private static long m41191j(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        long j = 0;
        for (String str2 : C21963k.m41183b(sQLiteDatabase, "geller_file_table", "file_path", str, strArr, C58833ax.m90834k("timestamp_micro DESC"), C58836b.f156633a)) {
            if (m41194m(str2)) {
                j += m41195n(sQLiteDatabase, new String[]{str2});
            }
        }
        return j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0088 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.common.base.C58833ax m41192k(java.lang.String r7, java.lang.String r8, long r9, byte[] r11) {
        /*
            r6 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r6.f60588b
            java.io.File r1 = r1.getFilesDir()
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = "geller"
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = r6.f60589c
            r5 = 1
            r2[r5] = r3
            r3 = 2
            r2[r3] = r7
            java.lang.String r7 = com.google.common.util.C60790c.m92793a(r2)
            r0.<init>(r1, r7)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L_0x003d
            boolean r7 = r0.mkdirs()
            if (r7 == 0) goto L_0x002c
            goto L_0x003d
        L_0x002c:
            com.google.common.f.e r7 = f60587a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r8 = "Unable to create file directory."
            r9 = 48125(0xbbfd, float:6.7437E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            return r7
        L_0x003d:
            java.io.File r7 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r8 = "_"
            r1.append(r8)
            r1.append(r9)
            java.lang.String r8 = r1.toString()
            r7.<init>(r0, r8)
            r7.getAbsolutePath()
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0089 }
            r8.<init>(r7, r4)     // Catch:{ IOException -> 0x0089 }
            r8.write(r11)     // Catch:{ all -> 0x006d }
            r8.close()     // Catch:{ IOException -> 0x0089 }
            java.lang.String r7 = r7.toString()
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)
            return r7
        L_0x006d:
            r9 = move-exception
            r8.close()     // Catch:{ all -> 0x0072 }
            goto L_0x0088
        L_0x0072:
            r8 = move-exception
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0088 }
            java.lang.Class<java.lang.Throwable> r11 = java.lang.Throwable.class
            r10[r4] = r11     // Catch:{ Exception -> 0x0088 }
            java.lang.Class<java.lang.Throwable> r11 = java.lang.Throwable.class
            java.lang.String r0 = "addSuppressed"
            java.lang.reflect.Method r10 = r11.getDeclaredMethod(r0, r10)     // Catch:{ Exception -> 0x0088 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0088 }
            r11[r4] = r8     // Catch:{ Exception -> 0x0088 }
            r10.invoke(r9, r11)     // Catch:{ Exception -> 0x0088 }
        L_0x0088:
            throw r9     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            r8 = move-exception
            com.google.common.f.e r9 = f60587a
            com.google.common.f.x r9 = r9.mo56225c()
            java.lang.String r10 = "Filed to write file: %s"
            r11 = 48127(0xbbff, float:6.744E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56382g(r8)).mo56372aa(r11)).mo56389s(r10, r7)
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.database.C21964l.m41192k(java.lang.String, java.lang.String, long, byte[]):com.google.common.base.ax");
    }

    /* renamed from: l */
    private static C58833ax m41193l(String str) {
        File file = new File(str);
        file.getAbsolutePath();
        try {
            if (file.exists()) {
                return C58833ax.m90834k(new C59315ac(file).mo56803a());
            }
            return C58836b.f156633a;
        } catch (IOException | IllegalArgumentException | OutOfMemoryError | SecurityException e) {
            throw new GellerException(C62722b.ABORTED, e.getMessage());
        }
    }

    /* renamed from: m */
    private static boolean m41194m(String str) {
        File file = new File(str);
        try {
            if (!file.exists()) {
                return true;
            }
            file.delete();
            return true;
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f60587a.mo56225c()).mo56382g(e)).mo56372aa(48131)).mo56389s("Failed to remove file: %s", str);
            return false;
        }
    }

    /* renamed from: n */
    private static long m41195n(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            long delete = (long) sQLiteDatabase.delete("geller_file_table", "file_path = ?", strArr);
            sQLiteDatabase.setTransactionSuccessful();
            return delete;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: a */
    public final long mo27281a(C58833ax axVar, String str, C65071r rVar) {
        if ((rVar.f176210a & 1) != 0) {
            String str2 = rVar.f176213d;
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((C58847bk) axVar).f156646a;
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                int i = rVar.f176211b;
                long j = 0;
                if (i == 1) {
                    for (String str3 : C21963k.m41186e(((C65066m) rVar.f176212c).f176199a)) {
                        if (!str3.isEmpty()) {
                            j += m41191j(sQLiteDatabase, "data_type = ? AND ".concat(String.valueOf(str3)), new String[]{str2});
                        }
                    }
                } else {
                    String str4 = "data_type = ?";
                    if (i == 2) {
                        C65070q qVar = (C65070q) rVar.f176212c;
                        if (!(qVar.f176206a.size() == 0 && qVar.f176207b.size() == 0)) {
                            str4 = "data_type = ? AND " + C21963k.m41184c(qVar);
                        }
                        j = m41191j(sQLiteDatabase, str4, new String[]{str2});
                    } else if (i == 4 && ((Boolean) rVar.f176212c).booleanValue()) {
                        j = m41191j((SQLiteDatabase) ((C58847bk) axVar).f156646a, str4, new String[]{str2});
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
                return j;
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } else {
            throw new IllegalArgumentException("The `dataType` field is required in GellerDeleteParams.");
        }
    }

    /* renamed from: b */
    public final /* synthetic */ C65063j mo27282b(C58833ax axVar, Set set) {
        return C65063j.f176192d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[][] mo27283c(com.google.common.base.C58833ax r6, com.google.protos.p4985f.p5030q.p5032b.C65031ap r7) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "timestamp_micro >= 0"
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r7.f176102a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = " AND data_type = ?"
            r0.append(r2)
            java.lang.String r2 = r7.f176107f
            r1.add(r2)
        L_0x001c:
            int r2 = r7.f176103b
            java.lang.String r3 = ""
            r4 = 1
            if (r2 != r4) goto L_0x0035
            java.lang.String r2 = " AND key = ?"
            r0.append(r2)
            int r2 = r7.f176103b
            if (r2 != r4) goto L_0x0031
            java.lang.Object r2 = r7.f176104c
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        L_0x0031:
            r1.add(r3)
            goto L_0x0054
        L_0x0035:
            r4 = 9
            if (r2 != r4) goto L_0x0054
            java.lang.String r2 = "AND key like ?"
            r0.append(r2)
            int r2 = r7.f176103b
            if (r2 != r4) goto L_0x0047
            java.lang.Object r2 = r7.f176104c
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        L_0x0047:
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "%"
            java.lang.String r2 = r2.concat(r3)
            r1.add(r2)
        L_0x0054:
            int r2 = r7.f176102a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x007d
            java.lang.String r2 = " AND timestamp_micro >= ? AND timestamp_micro <= ?"
            r0.append(r2)
            com.google.protos.f.q.b.ao r2 = r7.f176106e
            if (r2 != 0) goto L_0x0065
            com.google.protos.f.q.b.ao r2 = com.google.protos.p4985f.p5030q.p5032b.C65030ao.f176095d
        L_0x0065:
            long r2 = r2.f176098b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.add(r2)
            com.google.protos.f.q.b.ao r2 = r7.f176106e
            if (r2 != 0) goto L_0x0074
            com.google.protos.f.q.b.ao r2 = com.google.protos.p4985f.p5030q.p5032b.C65030ao.f176095d
        L_0x0074:
            long r2 = r2.f176099c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.add(r2)
        L_0x007d:
            int r2 = r7.f176102a
            r2 = r2 & 32
            if (r2 == 0) goto L_0x0097
            boolean r2 = r7.f176108g
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = " AND sync_status = ? "
            r0.append(r2)
            java.lang.String r2 = "SYNCED"
            r1.add(r2)
            goto L_0x0097
        L_0x0092:
            java.lang.String r2 = " AND sync_status IS NULL "
            r0.append(r2)
        L_0x0097:
            int r2 = r7.f176102a
            r2 = r2 & 64
            if (r2 == 0) goto L_0x00ac
            boolean r2 = r7.f176109h
            if (r2 == 0) goto L_0x00a7
            java.lang.String r2 = " AND delete_status IS NOT NULL"
            r0.append(r2)
            goto L_0x00ac
        L_0x00a7:
            java.lang.String r2 = " AND delete_status IS NULL"
            r0.append(r2)
        L_0x00ac:
            int r2 = r7.f176102a
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00c6
            boolean r2 = r7.f176110i
            if (r2 == 0) goto L_0x00c1
            java.lang.String r2 = " AND deletion_sync_status = ?"
            r0.append(r2)
            java.lang.String r2 = "DELETION_SYNCED"
            r1.add(r2)
            goto L_0x00c6
        L_0x00c1:
            java.lang.String r2 = " AND deletion_sync_status IS NULL"
            r0.append(r2)
        L_0x00c6:
            int r2 = r7.f176102a
            r2 = r2 & 4
            if (r2 == 0) goto L_0x00d7
            int r7 = r7.f176105d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)
            goto L_0x00d9
        L_0x00d7:
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
        L_0x00d9:
            com.google.common.base.bk r6 = (com.google.common.base.C58847bk) r6
            java.lang.Object r6 = r6.f156646a
            android.database.sqlite.SQLiteDatabase r6 = (android.database.sqlite.SQLiteDatabase) r6
            java.lang.String r0 = r0.toString()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            byte[][] r6 = m41189h(r6, r0, r1, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.database.C21964l.mo27283c(com.google.common.base.ax, com.google.protos.f.q.b.ap):byte[][]");
    }

    /* renamed from: d */
    public final String[] mo27284d(C58833ax axVar, String str) {
        String[] strArr = {str};
        C58836b bVar = C58836b.f156633a;
        return (String[]) C21963k.m41183b((SQLiteDatabase) ((C58847bk) axVar).f156646a, "geller_file_table", "key", "data_type = ? AND timestamp_micro >= 0 AND delete_status IS NULL", strArr, bVar, bVar).toArray(new String[0]);
    }

    /* renamed from: f */
    public final boolean mo27286f(C58833ax axVar, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        String str2;
        String str3;
        String str4;
        int i;
        char c;
        String str5;
        String str6;
        String str7;
        boolean z2;
        String str8 = str;
        String[] strArr2 = strArr;
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) ((C58847bk) axVar).f156646a;
        sQLiteDatabase2.beginTransactionNonExclusive();
        try {
            String str9 = "data_type = ? AND " + C21963k.m41182a("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?";
            String[] strArr3 = {str8, String.valueOf(j)};
            List<String> b = C21963k.m41183b(sQLiteDatabase2, "geller_file_table", "file_path", str9, strArr3, C58833ax.m90834k("timestamp_micro DESC"), C58836b.f156633a);
            if (b.size() == 1) {
                str7 = "sync_status";
                str2 = "key";
                str6 = "num_times_used";
                String str10 = "file_path";
                String str11 = "geller_file_table";
                String str12 = "SYNCED";
                if (new HashSet(C21963k.m41183b(sQLiteDatabase2, "geller_file_table", "key", "file_path = ?", new String[]{(String) b.get(0)}, C58833ax.m90834k("timestamp_micro DESC"), C58836b.f156633a)).equals(new HashSet(Arrays.asList(strArr)))) {
                    boolean z3 = false;
                    if (!m41194m((String) b.get(0))) {
                        sQLiteDatabase = sQLiteDatabase2;
                    } else {
                        String str13 = str12;
                        String str14 = str;
                        String[] strArr4 = strArr3;
                        String str15 = strArr2[0];
                        String str16 = str9;
                        sQLiteDatabase = sQLiteDatabase2;
                        try {
                            C58833ax k = m41192k(str14, str15, j, bArr);
                            if (k.mo56113h()) {
                                String str17 = (String) k.mo56107c();
                                ContentValues contentValues = new ContentValues();
                                if (z) {
                                    contentValues.put(str7, str13);
                                } else {
                                    contentValues.putNull(str7);
                                }
                                contentValues.putNull("delete_status");
                                contentValues.put(str6, 0L);
                                contentValues.put(str10, str17);
                                if (((long) sQLiteDatabase.update(str11, contentValues, str16, strArr4)) > 0) {
                                    z3 = true;
                                }
                            }
                            z3 = false;
                        } catch (IllegalStateException e) {
                            e = e;
                            try {
                                ((C59052c) ((C59052c) ((C59052c) f60587a.mo56225c()).mo56382g(e)).mo56372aa(48132)).mo56386p("Failed to write file.");
                                sQLiteDatabase.endTransaction();
                                return false;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteDatabase.endTransaction();
                                throw th;
                            }
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    return z3;
                }
                str5 = str12;
                sQLiteDatabase = sQLiteDatabase2;
                str4 = str10;
                str3 = str11;
                c = 0;
                i = 1;
            } else {
                str2 = "key";
                str7 = "sync_status";
                str6 = "num_times_used";
                str5 = "SYNCED";
                c = 0;
                i = 1;
                str3 = "geller_file_table";
                str4 = "file_path";
                sQLiteDatabase = sQLiteDatabase2;
            }
            boolean z4 = true;
            for (String str18 : b) {
                if (!m41194m(str18)) {
                    z4 = false;
                } else {
                    String[] strArr5 = new String[i];
                    strArr5[c] = str18;
                    z4 &= m41195n(sQLiteDatabase, strArr5) > 0;
                }
            }
            if (z4) {
                C58833ax k2 = m41192k(str, strArr2[c], j, bArr);
                if (k2.mo56113h()) {
                    int length = strArr2.length;
                    boolean z5 = true;
                    int i2 = 0;
                    while (i2 < length) {
                        String str19 = strArr2[i2];
                        String str20 = (String) k2.mo56107c();
                        ContentValues contentValues2 = new ContentValues();
                        String str21 = str2;
                        contentValues2.put(str21, str19);
                        contentValues2.put("data_type", str);
                        contentValues2.put("timestamp_micro", Long.valueOf(j));
                        contentValues2.put(str6, 0);
                        String str22 = str7;
                        if (z) {
                            contentValues2.put(str22, str5);
                        }
                        contentValues2.put(str4, str20);
                        z5 &= sQLiteDatabase.insert(str3, (String) null, contentValues2) > 0;
                        i2++;
                        str7 = str22;
                        str2 = str21;
                    }
                    z2 = z5;
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    return z2;
                }
            }
            z2 = false;
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            return z2;
        } catch (IllegalStateException e2) {
            e = e2;
            sQLiteDatabase = sQLiteDatabase2;
            ((C59052c) ((C59052c) ((C59052c) f60587a.mo56225c()).mo56382g(e)).mo56372aa(48132)).mo56386p("Failed to write file.");
            sQLiteDatabase.endTransaction();
            return false;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabase2;
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: e */
    public final long mo27285e(C58833ax axVar, String str, C65019ad adVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        String str2;
        C65016aa aaVar;
        int i = adVar.f176074a;
        if (i == 1) {
            ArrayList arrayList = new ArrayList();
            if (adVar.f176074a == 1) {
                aaVar = (C65016aa) adVar.f176075b;
            } else {
                aaVar = C65016aa.f176065b;
            }
            arrayList.addAll(aaVar.f176067a);
            str2 = "data_type = ? AND ".concat(String.valueOf(C21963k.m41185d(arrayList)));
        } else if (i == 2) {
            C65018ac acVar = (C65018ac) adVar.f176075b;
            if (acVar.f176070a.size() == 0 && acVar.f176071b.size() == 0) {
                str2 = "data_type = ?";
            } else {
                str2 = "data_type = ? AND ".concat(C21963k.m41187f(acVar.f176070a, acVar.f176071b));
            }
        } else {
            ((C59052c) ((C59052c) f60587a.mo56225c()).mo56372aa(48124)).mo56386p("Unexpected element_filtering in GellerElementSelectionParams.");
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        if (axVar2.mo56113h()) {
            if (((Boolean) axVar2.mo56107c()).booleanValue()) {
                contentValues.put("sync_status", "SYNCED");
            } else {
                contentValues.putNull("sync_status");
            }
        }
        if (axVar3.mo56113h()) {
            if (((Boolean) axVar3.mo56107c()).booleanValue()) {
                contentValues.put("deletion_sync_status", "DELETION_SYNCED");
            } else {
                contentValues.putNull("deletion_sync_status");
            }
        }
        if (axVar4.mo56113h()) {
            if (((C21956d) axVar4.mo56107c()).mo27276a().booleanValue()) {
                contentValues.putNull("delete_status");
            } else {
                int b = ((C21956d) axVar4.mo56107c()).mo27277b();
                String a = C21955c.m41135a(b);
                if (b != 0) {
                    contentValues.put("delete_status", a);
                } else {
                    throw null;
                }
            }
        }
        return (long) ((SQLiteDatabase) ((C58847bk) axVar).f156646a).update("geller_file_table", contentValues, str2, new String[]{str});
    }
}
