package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29109w;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29110x;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58869cf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.mdi.download.d.lx */
/* compiled from: PG */
public final class C29298lx implements C29293ls {

    /* renamed from: a */
    private final Context f79410a;

    /* renamed from: b */
    private final C29658ia f79411b;

    /* renamed from: c */
    private final C58833ax f79412c;

    /* renamed from: d */
    private final C28787cb f79413d;

    public C29298lx(Context context, C29658ia iaVar, C58833ax axVar, C28787cb cbVar) {
        this.f79410a = context;
        this.f79411b = iaVar;
        this.f79412c = axVar;
        this.f79413d = cbVar;
    }

    /* renamed from: a */
    public final C60870cx mo34616a() {
        C29111y.m54038a(this.f79410a, "gms_icing_mdd_shared_files", this.f79412c).edit().clear().commit();
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo34618c() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences a = C29111y.m54038a(this.f79410a, "gms_icing_mdd_shared_files", this.f79412c);
        SharedPreferences.Editor editor = null;
        for (String next : a.getAll().keySet()) {
            try {
                arrayList.add(C29110x.m54033a(next, this.f79410a, this.f79411b));
            } catch (C29109w e) {
                C29045l.m53947s(e, "Failed to deserialize newFileKey:".concat(String.valueOf(next)));
                this.f79411b.mo34497a(e, "Failed to deserialize newFileKey, unexpected key size: %d", Integer.valueOf(C58869cf.m90938d("|").mo56155i(next).size()));
                if (editor == null) {
                    editor = a.edit();
                }
                editor.remove(next);
            }
        }
        if (editor != null) {
            editor.commit();
        }
        return C60856cj.m92900i(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x01d0 A[Catch:{ w -> 0x00e9, all -> 0x011f, all -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e4 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo34619d() {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "Failed to commit migration version to disk."
            java.lang.String r3 = "Fail to set target version "
            java.lang.String r4 = "Failed to commit migration version to disk. Fail to set target version to "
            android.content.Context r0 = r1.f79410a
            boolean r0 = com.google.android.libraries.mdi.download.p2236d.C29173hg.m54129c(r0)
            java.lang.String r5 = "SharedFilesMetadata"
            r6 = 0
            if (r0 == 0) goto L_0x02e5
            com.google.android.libraries.mdi.download.cb r0 = r1.f79413d
            int r0 = r0.mo34427g()
            com.google.android.libraries.mdi.download.d.hf r7 = com.google.android.libraries.mdi.download.p2236d.C29172hf.m54126a(r0)
            android.content.Context r0 = r1.f79410a
            com.google.android.libraries.mdi.download.ia r8 = r1.f79411b
            com.google.android.libraries.mdi.download.d.hf r0 = com.google.android.libraries.mdi.download.p2236d.C29173hg.m54127a(r0, r8)
            int r8 = r7.f79119d
            int r9 = r0.f79119d
            r10 = 1
            if (r8 != r9) goto L_0x002f
        L_0x002c:
            r6 = 1
            goto L_0x028c
        L_0x002f:
            r11 = 2
            java.lang.String r12 = "."
            if (r8 >= r9) goto L_0x0078
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r6] = r5
            r2[r10] = r0
            r2[r11] = r7
            java.lang.String r3 = "%s Cannot migrate back from value %s to %s. Clear everything!"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53937i(r3, r2)
            com.google.android.libraries.mdi.download.ia r2 = r1.f79411b
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "Downgraded file key from "
            r5.<init>(r8)
            r5.append(r0)
            java.lang.String r0 = " to "
            r5.append(r0)
            r5.append(r4)
            r5.append(r12)
            java.lang.String r0 = r5.toString()
            r3.<init>(r0)
            java.lang.String r0 = "FileKey migrations unexpected downgrade."
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r2.mo34497a(r3, r0, r4)
            android.content.Context r0 = r1.f79410a
            com.google.android.libraries.mdi.download.p2236d.C29173hg.m54130d(r0, r7)
            goto L_0x028c
        L_0x0078:
            int r9 = r9 + r10
        L_0x0079:
            int r0 = r7.f79119d     // Catch:{ all -> 0x0295 }
            if (r9 > r0) goto L_0x023c
            com.google.android.libraries.mdi.download.d.hf r0 = com.google.android.libraries.mdi.download.p2236d.C29172hf.m54126a(r9)     // Catch:{ all -> 0x0295 }
            int r8 = r0.ordinal()     // Catch:{ all -> 0x0295 }
            java.lang.String r13 = "%s: Unable to read sharedFile from shared preferences."
            java.lang.String r14 = "Failed to deserialize file key, remove and continue."
            java.lang.String r15 = "Failed to commit migration metadata to disk."
            java.lang.String r6 = "%s Failed to deserialize file key %s, remove and continue."
            java.lang.String r16 = "Failed to commit migration metadata to disk"
            r17 = r2
            java.lang.String r2 = "gms_icing_mdd_shared_files"
            if (r8 == r10) goto L_0x0147
            if (r8 != r11) goto L_0x0125
            java.lang.String r0 = "%s: Starting migration to dedup on checksum only"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53930b(r0, r5)     // Catch:{ all -> 0x011f }
            android.content.Context r0 = r1.f79410a     // Catch:{ all -> 0x011f }
            com.google.common.base.ax r8 = r1.f79412c     // Catch:{ all -> 0x011f }
            android.content.SharedPreferences r2 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y.m54038a(r0, r2, r8)     // Catch:{ all -> 0x011f }
            android.content.SharedPreferences$Editor r8 = r2.edit()     // Catch:{ all -> 0x011f }
            java.util.Map r0 = r2.getAll()     // Catch:{ all -> 0x011f }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x011f }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ all -> 0x011f }
        L_0x00b4:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r18.next()     // Catch:{ all -> 0x011f }
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x011f }
            android.content.Context r0 = r1.f79410a     // Catch:{ w -> 0x00e9 }
            com.google.android.libraries.mdi.download.ia r11 = r1.f79411b     // Catch:{ w -> 0x00e9 }
            com.google.android.libraries.mdi.download.ev r0 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29110x.m54033a(r10, r0, r11)     // Catch:{ w -> 0x00e9 }
            com.google.android.libraries.mdi.download.ez r11 = com.google.android.libraries.mdi.download.C29402ez.f79711h     // Catch:{ all -> 0x011f }
            com.google.protobuf.eb r11 = r11.getParserForType()     // Catch:{ all -> 0x011f }
            com.google.protobuf.MessageLite r11 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y.m54040c(r2, r10, r11)     // Catch:{ all -> 0x011f }
            com.google.android.libraries.mdi.download.ez r11 = (com.google.android.libraries.mdi.download.C29402ez) r11     // Catch:{ all -> 0x011f }
            if (r11 != 0) goto L_0x00de
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53935g(r13, r5)     // Catch:{ all -> 0x011f }
            r8.remove(r10)     // Catch:{ all -> 0x011f }
            goto L_0x0100
        L_0x00de:
            r8.remove(r10)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29110x.m54036d(r0)     // Catch:{ all -> 0x011f }
            com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y.m54043f(r8, r0, r11)     // Catch:{ all -> 0x011f }
            goto L_0x0100
        L_0x00e9:
            r0 = move-exception
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53936h(r6, r5, r10)     // Catch:{ all -> 0x011f }
            com.google.android.libraries.mdi.download.ia r11 = r1.f79411b     // Catch:{ all -> 0x011f }
            r19 = r2
            r20 = r3
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0236 }
            r11.mo34497a(r0, r14, r3)     // Catch:{ all -> 0x0236 }
            r8.remove(r10)     // Catch:{ all -> 0x0236 }
            r2 = r19
            r3 = r20
        L_0x0100:
            r10 = 1
            r11 = 2
            goto L_0x00b4
        L_0x0103:
            r20 = r3
            boolean r0 = r8.commit()     // Catch:{ all -> 0x0236 }
            if (r0 != 0) goto L_0x01cd
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53934f(r16)     // Catch:{ all -> 0x0236 }
            com.google.android.libraries.mdi.download.ia r0 = r1.f79411b     // Catch:{ all -> 0x0236 }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ all -> 0x0236 }
            java.lang.String r3 = "Migrate to ChecksumOnly failed."
            r2.<init>(r3)     // Catch:{ all -> 0x0236 }
            r3 = 0
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0236 }
            r0.mo34497a(r2, r15, r6)     // Catch:{ all -> 0x0236 }
            goto L_0x01cb
        L_0x011f:
            r0 = move-exception
            r5 = r3
            r3 = r17
            goto L_0x0298
        L_0x0125:
            r20 = r3
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0236 }
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x0236 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0236 }
            r3.<init>()     // Catch:{ all -> 0x0236 }
            java.lang.String r5 = "Upgrade to version "
            r3.append(r5)     // Catch:{ all -> 0x0236 }
            r3.append(r0)     // Catch:{ all -> 0x0236 }
            java.lang.String r0 = "not supported!"
            r3.append(r0)     // Catch:{ all -> 0x0236 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0236 }
            r2.<init>(r0)     // Catch:{ all -> 0x0236 }
            throw r2     // Catch:{ all -> 0x0236 }
        L_0x0147:
            r20 = r3
            java.lang.String r0 = "%s: Starting migration to add download transform"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53930b(r0, r5)     // Catch:{ all -> 0x0236 }
            android.content.Context r0 = r1.f79410a     // Catch:{ all -> 0x0236 }
            com.google.common.base.ax r3 = r1.f79412c     // Catch:{ all -> 0x0236 }
            android.content.SharedPreferences r2 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y.m54038a(r0, r2, r3)     // Catch:{ all -> 0x0236 }
            android.content.SharedPreferences$Editor r3 = r2.edit()     // Catch:{ all -> 0x0236 }
            java.util.Map r0 = r2.getAll()     // Catch:{ all -> 0x0236 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0236 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0236 }
        L_0x0166:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0236 }
            if (r0 == 0) goto L_0x01b3
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0236 }
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0236 }
            android.content.Context r0 = r1.f79410a     // Catch:{ w -> 0x019b }
            com.google.android.libraries.mdi.download.ia r11 = r1.f79411b     // Catch:{ w -> 0x019b }
            com.google.android.libraries.mdi.download.ev r0 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29110x.m54033a(r10, r0, r11)     // Catch:{ w -> 0x019b }
            com.google.android.libraries.mdi.download.ez r11 = com.google.android.libraries.mdi.download.C29402ez.f79711h     // Catch:{ all -> 0x0236 }
            com.google.protobuf.eb r11 = r11.getParserForType()     // Catch:{ all -> 0x0236 }
            com.google.protobuf.MessageLite r11 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y.m54040c(r2, r10, r11)     // Catch:{ all -> 0x0236 }
            com.google.android.libraries.mdi.download.ez r11 = (com.google.android.libraries.mdi.download.C29402ez) r11     // Catch:{ all -> 0x0236 }
            if (r11 != 0) goto L_0x0190
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53935g(r13, r5)     // Catch:{ all -> 0x0236 }
            r3.remove(r10)     // Catch:{ all -> 0x0236 }
            goto L_0x0166
        L_0x0190:
            r3.remove(r10)     // Catch:{ all -> 0x0236 }
            java.lang.String r0 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29110x.m54037e(r0)     // Catch:{ all -> 0x0236 }
            com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y.m54043f(r3, r0, r11)     // Catch:{ all -> 0x0236 }
            goto L_0x0166
        L_0x019b:
            r0 = move-exception
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53936h(r6, r5, r10)     // Catch:{ all -> 0x0236 }
            com.google.android.libraries.mdi.download.ia r11 = r1.f79411b     // Catch:{ all -> 0x0236 }
            r18 = r2
            r19 = r6
            r2 = 0
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0236 }
            r11.mo34497a(r0, r14, r6)     // Catch:{ all -> 0x0236 }
            r3.remove(r10)     // Catch:{ all -> 0x0236 }
            r2 = r18
            r6 = r19
            goto L_0x0166
        L_0x01b3:
            boolean r0 = r3.commit()     // Catch:{ all -> 0x0236 }
            if (r0 != 0) goto L_0x01cd
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53934f(r16)     // Catch:{ all -> 0x0236 }
            com.google.android.libraries.mdi.download.ia r0 = r1.f79411b     // Catch:{ all -> 0x0236 }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ all -> 0x0236 }
            java.lang.String r3 = "Migrate to DownloadTransform failed."
            r2.<init>(r3)     // Catch:{ all -> 0x0236 }
            r3 = 0
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0236 }
            r0.mo34497a(r2, r15, r6)     // Catch:{ all -> 0x0236 }
        L_0x01cb:
            r0 = 0
            goto L_0x01ce
        L_0x01cd:
            r0 = 1
        L_0x01ce:
            if (r0 == 0) goto L_0x01e4
            android.content.Context r0 = r1.f79410a     // Catch:{ all -> 0x0236 }
            com.google.android.libraries.mdi.download.d.hf r2 = com.google.android.libraries.mdi.download.p2236d.C29172hf.m54126a(r9)     // Catch:{ all -> 0x0236 }
            com.google.android.libraries.mdi.download.p2236d.C29173hg.m54130d(r0, r2)     // Catch:{ all -> 0x0236 }
            int r9 = r9 + 1
            r2 = r17
            r3 = r20
            r6 = 0
            r10 = 1
            r11 = 2
            goto L_0x0079
        L_0x01e4:
            android.content.Context r0 = r1.f79410a
            com.google.android.libraries.mdi.download.ia r2 = r1.f79411b
            com.google.android.libraries.mdi.download.d.hf r0 = com.google.android.libraries.mdi.download.p2236d.C29173hg.m54127a(r0, r2)
            int r0 = r0.f79119d
            int r2 = r7.f79119d
            if (r0 == r2) goto L_0x0234
            android.content.Context r0 = r1.f79410a
            boolean r0 = com.google.android.libraries.mdi.download.p2236d.C29173hg.m54130d(r0, r7)
            if (r0 != 0) goto L_0x0234
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53934f(r0)
            com.google.android.libraries.mdi.download.ia r0 = r1.f79411b
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = java.lang.String.valueOf(r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = r20
            r4.<init>(r5)
            r4.append(r3)
            r4.append(r12)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r3 = r17
            r0.mo34497a(r2, r3, r4)
        L_0x0234:
            r6 = 0
            goto L_0x028c
        L_0x0236:
            r0 = move-exception
            r3 = r17
            r5 = r20
            goto L_0x0298
        L_0x023c:
            r5 = r3
            r3 = r2
            android.content.Context r0 = r1.f79410a
            com.google.android.libraries.mdi.download.ia r2 = r1.f79411b
            com.google.android.libraries.mdi.download.d.hf r0 = com.google.android.libraries.mdi.download.p2236d.C29173hg.m54127a(r0, r2)
            int r0 = r0.f79119d
            int r2 = r7.f79119d
            if (r0 == r2) goto L_0x002c
            android.content.Context r0 = r1.f79410a
            boolean r0 = com.google.android.libraries.mdi.download.p2236d.C29173hg.m54130d(r0, r7)
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53934f(r0)
            com.google.android.libraries.mdi.download.ia r0 = r1.f79411b
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r4)
            r6.append(r12)
            java.lang.String r4 = r6.toString()
            r2.<init>(r4)
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0.mo34497a(r2, r3, r4)
            goto L_0x002c
        L_0x028c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x0295:
            r0 = move-exception
            r5 = r3
            r3 = r2
        L_0x0298:
            android.content.Context r2 = r1.f79410a
            com.google.android.libraries.mdi.download.ia r6 = r1.f79411b
            com.google.android.libraries.mdi.download.d.hf r2 = com.google.android.libraries.mdi.download.p2236d.C29173hg.m54127a(r2, r6)
            int r2 = r2.f79119d
            int r6 = r7.f79119d
            if (r2 == r6) goto L_0x02e4
            android.content.Context r2 = r1.f79410a
            boolean r2 = com.google.android.libraries.mdi.download.p2236d.C29173hg.m54130d(r2, r7)
            if (r2 != 0) goto L_0x02e4
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            r6.append(r2)
            r6.append(r12)
            java.lang.String r2 = r6.toString()
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53934f(r2)
            com.google.android.libraries.mdi.download.ia r2 = r1.f79411b
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r6 = java.lang.String.valueOf(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
            r7.append(r6)
            r7.append(r12)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r2.mo34497a(r4, r3, r5)
        L_0x02e4:
            throw r0
        L_0x02e5:
            java.lang.String r0 = "%s Device isn't migrated to new file key, clear and set migration."
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53930b(r0, r5)
            android.content.Context r0 = r1.f79410a
            com.google.android.libraries.mdi.download.p2236d.C29173hg.m54131e(r0)
            android.content.Context r0 = r1.f79410a
            com.google.android.libraries.mdi.download.cb r2 = r1.f79413d
            int r2 = r2.mo34427g()
            com.google.android.libraries.mdi.download.d.hf r2 = com.google.android.libraries.mdi.download.p2236d.C29172hf.m54126a(r2)
            com.google.android.libraries.mdi.download.p2236d.C29173hg.m54130d(r0, r2)
            r2 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.mdi.download.p2236d.C29298lx.mo34619d():com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final C60870cx mo34620e(C29398ev evVar) {
        return C60856cj.m92900i((C29402ez) C29111y.m54040c(C29111y.m54038a(this.f79410a, "gms_icing_mdd_shared_files", this.f79412c), C29110x.m54034b(evVar, this.f79410a, this.f79411b), C29402ez.f79711h.getParserForType()));
    }

    /* renamed from: f */
    public final C60870cx mo34621f(C29398ev evVar) {
        return C60856cj.m92900i(Boolean.valueOf(C29111y.m54044g(C29111y.m54038a(this.f79410a, "gms_icing_mdd_shared_files", this.f79412c), C29110x.m54034b(evVar, this.f79410a, this.f79411b))));
    }

    /* renamed from: g */
    public final C60870cx mo34622g(C29398ev evVar, C29402ez ezVar) {
        return C60856cj.m92900i(Boolean.valueOf(C29111y.m54045h(C29111y.m54038a(this.f79410a, "gms_icing_mdd_shared_files", this.f79412c), C29110x.m54034b(evVar, this.f79410a, this.f79411b), ezVar)));
    }
}
