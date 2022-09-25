package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29394er;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.C29662ie;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29100n;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29101o;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29108v;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.d.lv */
/* compiled from: PG */
public final class C29296lv implements C29118ff {

    /* renamed from: a */
    public final Executor f79400a;

    /* renamed from: b */
    private final Context f79401b;

    /* renamed from: c */
    private final C29662ie f79402c;

    /* renamed from: d */
    private final C29658ia f79403d;

    /* renamed from: e */
    private final C58833ax f79404e;

    public C29296lv(Context context, C29662ie ieVar, C29658ia iaVar, C58833ax axVar, Executor executor) {
        this.f79401b = context;
        this.f79402c = ieVar;
        this.f79403d = iaVar;
        this.f79404e = axVar;
        this.f79400a = executor;
    }

    /* renamed from: a */
    public final C60870cx mo34596a(C29334dr drVar) {
        C29045l.m53931c("%s: Adding file group %s", "SharedPreferencesFileGroupsMetadata", drVar.f79501c);
        C29334dr d = C29099m.m54008d(drVar, (this.f79402c.mo34498a() / 1000) + drVar.f79508j);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        return mo34608m(arrayList);
    }

    /* renamed from: b */
    public final C60870cx mo34597b() {
        C29111y.m54038a(this.f79401b, "gms_icing_mdd_groups", this.f79404e).edit().clear().commit();
        C29111y.m54038a(this.f79401b, "gms_icing_mdd_group_key_properties", this.f79404e).edit().clear().commit();
        return mo34606k();
    }

    /* renamed from: c */
    public final C60870cx mo34598c() {
        C60870cx d = mo34599d();
        C29295lu luVar = new C29295lu(this);
        return C60922j.m93045h(d, C47810es.m84966f(luVar), this.f79400a);
    }

    /* renamed from: d */
    public final C60870cx mo34599d() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences a = C29111y.m54038a(this.f79401b, "gms_icing_mdd_groups", this.f79404e);
        SharedPreferences.Editor editor = null;
        for (String next : a.getAll().keySet()) {
            try {
                arrayList.add(C29101o.m54017a(next));
            } catch (C29100n e) {
                C29045l.m53947s(e, "Failed to deserialize groupKey:".concat(String.valueOf(next)));
                this.f79403d.mo34497a(e, "Failed to deserialize groupKey", new Object[0]);
                if (editor == null) {
                    editor = a.edit();
                }
                editor.remove(next);
                C29045l.m53930b("%s: Deleting null file group ", "SharedPreferencesFileGroupsMetadata");
            }
        }
        if (editor != null) {
            editor.commit();
        }
        return C60856cj.m92900i(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo34600e() {
        /*
            r7 = this;
            java.lang.String r0 = "FileGroupsMetadataUtil"
            android.content.Context r1 = r7.f79401b
            com.google.common.base.ax r2 = r7.f79404e
            java.io.File r1 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29101o.m54018b(r1, r2)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0058 }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0058 }
            r3 = 0
            r4 = 1
            long r5 = r1.length()     // Catch:{ IllegalArgumentException -> 0x0049 }
            int r1 = (int) r5     // Catch:{ IllegalArgumentException -> 0x0049 }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ IllegalArgumentException -> 0x0049 }
            java.nio.channels.FileChannel r5 = p3186j$.wrapper.java.p3189io.FileInputStreamWrapper.getChannel(r2)     // Catch:{ IOException -> 0x0036 }
            r5.read(r1)     // Catch:{ IOException -> 0x0036 }
            r1.rewind()     // Catch:{ IOException -> 0x0036 }
            java.lang.Class<com.google.android.libraries.mdi.download.dr> r5 = com.google.android.libraries.mdi.download.C29334dr.class
            com.google.android.libraries.mdi.download.dr r6 = com.google.android.libraries.mdi.download.C29334dr.f79497w     // Catch:{ IOException -> 0x0036 }
            com.google.protobuf.eb r6 = r6.getParserForType()     // Catch:{ IOException -> 0x0036 }
            java.util.List r1 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29108v.m54031b(r1, r5, r6)     // Catch:{ IOException -> 0x0036 }
            r2.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0042
        L_0x0034:
            r2 = move-exception
            goto L_0x0039
        L_0x0036:
            r1 = move-exception
            r2 = r1
            r1 = 0
        L_0x0039:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            java.lang.String r0 = "%s: IOException occurred while reading file groups."
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53938j(r2, r0, r4)
        L_0x0042:
            if (r1 != 0) goto L_0x0065
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x0065
        L_0x0049:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            java.lang.String r0 = "%s: Exception while reading from stale groups into buffer."
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53938j(r1, r0, r2)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x0065
        L_0x0058:
            java.lang.String r0 = "File %s not found while reading."
            java.lang.String r1 = r1.getAbsolutePath()
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53930b(r0, r1)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0065:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.mdi.download.p2236d.C29296lv.mo34600e():com.google.common.util.concurrent.cx");
    }

    /* renamed from: f */
    public final C60870cx mo34601f() {
        return C60866ct.f164955a;
    }

    /* renamed from: g */
    public final C60870cx mo34602g(C29392ep epVar) {
        return C60856cj.m92900i((C29334dr) C29111y.m54040c(C29111y.m54038a(this.f79401b, "gms_icing_mdd_groups", this.f79404e), C29101o.m54019c(epVar), C29334dr.f79497w.getParserForType()));
    }

    /* renamed from: h */
    public final C60870cx mo34603h(C29392ep epVar) {
        return C60856cj.m92900i((C29394er) C29111y.m54040c(C29111y.m54038a(this.f79401b, "gms_icing_mdd_group_key_properties", this.f79404e), C29101o.m54019c(epVar), C29394er.f79687b.getParserForType()));
    }

    /* renamed from: i */
    public final C60870cx mo34604i(C29392ep epVar) {
        return C60856cj.m92900i(Boolean.valueOf(C29111y.m54044g(C29111y.m54038a(this.f79401b, "gms_icing_mdd_groups", this.f79404e), C29101o.m54019c(epVar))));
    }

    /* renamed from: j */
    public final C60870cx mo34605j(List list) {
        SharedPreferences.Editor edit = C29111y.m54038a(this.f79401b, "gms_icing_mdd_groups", this.f79404e).edit();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29392ep epVar = (C29392ep) it.next();
            C29045l.m53932d("%s: Removing group %s %s", "SharedPreferencesFileGroupsMetadata", epVar.f79682b, epVar.f79683c);
            edit.remove(C29111y.m54042e(epVar));
        }
        return C60856cj.m92900i(Boolean.valueOf(edit.commit()));
    }

    /* renamed from: k */
    public final C60870cx mo34606k() {
        mo34647n().delete();
        return C60866ct.f164955a;
    }

    /* renamed from: l */
    public final C60870cx mo34607l(C29392ep epVar, C29334dr drVar) {
        return C60856cj.m92900i(Boolean.valueOf(C29111y.m54045h(C29111y.m54038a(this.f79401b, "gms_icing_mdd_groups", this.f79404e), C29101o.m54019c(epVar), drVar)));
    }

    /* renamed from: m */
    public final C60870cx mo34608m(List list) {
        File n = mo34647n();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(n, true);
            try {
                ByteBuffer a = C29108v.m54030a(list);
                if (a != null) {
                    fileOutputStream.getChannel().write(a);
                }
                fileOutputStream.close();
                return C60856cj.m92900i(true);
            } catch (IOException unused) {
                C29045l.m53934f("IOException occurred while writing file groups.");
                return C60856cj.m92900i(false);
            }
        } catch (FileNotFoundException unused2) {
            C29045l.m53935g("File %s not found while writing.", n.getAbsolutePath());
            return C60856cj.m92900i(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final File mo34647n() {
        return C29101o.m54018b(this.f79401b, this.f79404e);
    }
}
