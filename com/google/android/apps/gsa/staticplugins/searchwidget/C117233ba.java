package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.eventlogger.j;
import com.google.android.apps.gsa.search.core.logging.C86176d;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6995aq.C89256a;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60462qy;
import com.google.common.p4552o.C60509sn;
import com.google.common.p4552o.C60511sp;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import com.google.p4500cm.p4518d.C58191h;
import com.google.p4500cm.p4518d.C58192i;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.ba */
/* compiled from: PG */
public final class C117233ba {

    /* renamed from: a */
    public static final C59071e f325424a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchwidget.ba");

    /* renamed from: b */
    public final C89256a f325425b;

    /* renamed from: c */
    public final SharedPreferences f325426c;

    /* renamed from: d */
    public final C86124t f325427d;

    /* renamed from: e */
    public final AppWidgetManager f325428e;

    /* renamed from: f */
    public final C22871g f325429f;

    /* renamed from: g */
    public final C60887da f325430g;

    /* renamed from: h */
    public final C42876ab f325431h;

    /* renamed from: i */
    private final j f325432i;

    /* renamed from: j */
    private final C86176d f325433j;

    /* renamed from: k */
    private final C21370a f325434k;

    /* renamed from: l */
    private final C143658k f325435l;

    /* renamed from: m */
    private final String f325436m;

    /* renamed from: n */
    private final C89257aa f325437n;

    /* renamed from: o */
    private final C84474e f325438o;

    public C117233ba(Context context, C89256a aVar, SharedPreferences sharedPreferences, C86124t tVar, j jVar, C86176d dVar, C21370a aVar2, String str, String str2, C89257aa aaVar, C22871g gVar, C60887da daVar, C42876ab abVar, C84474e eVar) {
        this.f325425b = aVar;
        this.f325426c = sharedPreferences;
        this.f325427d = tVar;
        this.f325432i = jVar;
        this.f325433j = dVar;
        this.f325434k = aVar2;
        this.f325435l = C143658k.m233374c(context, str).mo118952a();
        this.f325436m = str2;
        this.f325437n = aaVar;
        this.f325429f = gVar;
        this.f325430g = daVar;
        this.f325431h = abVar;
        this.f325438o = eVar;
        this.f325428e = AppWidgetManager.getInstance(context);
    }

    /* renamed from: a */
    public static C58485gu m194821a(AppWidgetManager appWidgetManager, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        if (appWidgetManager == null || iArr == null) {
            return C58485gu.m89845m();
        }
        for (int appWidgetOptions : iArr) {
            Bundle appWidgetOptions2 = appWidgetManager.getAppWidgetOptions(appWidgetOptions);
            if (appWidgetOptions2 != null && !C117204as.m194763k(appWidgetOptions2)) {
                appWidgetOptions2.getInt("appWidgetMinWidth");
                int i = appWidgetOptions2.getInt("appWidgetMaxWidth");
                appWidgetOptions2.getInt("appWidgetMinHeight");
                arrayList.add(new C117211az(i, appWidgetOptions2.getInt("appWidgetMaxHeight")));
            }
        }
        return C58485gu.m89842j(arrayList);
    }

    /* renamed from: e */
    public static void m194822e(List list, SharedPreferences sharedPreferences) {
        Iterator it = list.iterator();
        int i = -1;
        int i2 = -1;
        while (it.hasNext()) {
            C117211az azVar = (C117211az) it.next();
            if (i == -1) {
                i = azVar.f325380b;
            } else {
                i = Math.min(i, azVar.f325380b);
            }
            if (i2 == -1) {
                i2 = azVar.f325379a;
            } else {
                i2 = Math.min(i2, azVar.f325379a);
            }
        }
        if (sharedPreferences != null) {
            if (i2 >= 0) {
                sharedPreferences.edit().putInt("search_widget_width", i2).apply();
            } else {
                sharedPreferences.edit().remove("search_widget_width").apply();
            }
            if (i >= 0) {
                sharedPreferences.edit().putInt("search_widget_height", i).apply();
            } else {
                sharedPreferences.edit().remove("search_widget_height").apply();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0140, code lost:
        if (r13.equals("cqsb") == false) goto L_0x014d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0172  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.common.p4552o.C60555uf m194823g(int r9, com.google.common.p4552o.C60462qy r10, java.lang.String r11, java.lang.Integer r12, java.lang.String r13) {
        /*
            r8 = this;
            com.google.common.o.uf r0 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.tz r0 = (com.google.common.p4552o.C60548tz) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            int r2 = r1.f164093a
            r3 = 2
            r2 = r2 | r3
            r1.f164093a = r2
            r2 = 462(0x1ce, float:6.47E-43)
            r1.f164258m = r2
            com.google.common.o.qw r1 = com.google.common.p4552o.C60460qw.f163615i
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.common.o.qv r1 = (com.google.common.p4552o.C60459qv) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.common.o.qw r2 = (com.google.common.p4552o.C60460qw) r2
            int r10 = r10.f163634h
            r2.f163619c = r10
            int r10 = r2.f163617a
            r10 = r10 | r3
            r2.f163617a = r10
            r1.copyOnWrite()
            com.google.protobuf.bv r10 = r1.instance
            com.google.common.o.qw r10 = (com.google.common.p4552o.C60460qw) r10
            r10.f163618b = r9
            int r9 = r10.f163617a
            r2 = 1
            r9 = r9 | r2
            r10.f163617a = r9
            if (r11 == 0) goto L_0x0051
            r1.copyOnWrite()
            com.google.protobuf.bv r9 = r1.instance
            com.google.common.o.qw r9 = (com.google.common.p4552o.C60460qw) r9
            int r10 = r9.f163617a
            r10 = r10 | 4
            r9.f163617a = r10
            r9.f163620d = r11
        L_0x0051:
            if (r12 == 0) goto L_0x0128
            int r9 = r12.intValue()
            r1.copyOnWrite()
            com.google.protobuf.bv r10 = r1.instance
            com.google.common.o.qw r10 = (com.google.common.p4552o.C60460qw) r10
            int r11 = r10.f163617a
            r11 = r11 | 8
            r10.f163617a = r11
            r10.f163621e = r9
            com.google.android.apps.gsa.search.core.i.t r9 = r8.f325427d
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246665S
            boolean r9 = r9.mo79746e(r10)
            if (r9 == 0) goto L_0x0128
            android.appwidget.AppWidgetManager r9 = r8.f325428e
            if (r9 == 0) goto L_0x0128
            int r10 = r12.intValue()
            android.os.Bundle r9 = r9.getAppWidgetOptions(r10)
            if (r9 == 0) goto L_0x0128
            java.lang.String r10 = "appWidgetMinWidth"
            int r10 = r9.getInt(r10)
            java.lang.String r11 = "appWidgetMaxWidth"
            int r11 = r9.getInt(r11)
            java.lang.String r4 = "appWidgetMinHeight"
            int r4 = r9.getInt(r4)
            java.lang.String r5 = "appWidgetMaxHeight"
            int r9 = r9.getInt(r5)
            com.google.common.o.xc r5 = com.google.common.p4552o.C60633xc.f164497f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.common.o.xb r5 = (com.google.common.p4552o.C60632xb) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.common.o.xc r6 = (com.google.common.p4552o.C60633xc) r6
            r6.f164500b = r2
            int r7 = r6.f164499a
            r7 = r7 | r2
            r6.f164499a = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.common.o.xc r6 = (com.google.common.p4552o.C60633xc) r6
            int r7 = r6.f164499a
            r7 = r7 | r3
            r6.f164499a = r7
            r6.f164501c = r10
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.common.o.xc r10 = (com.google.common.p4552o.C60633xc) r10
            int r6 = r10.f164499a
            r6 = r6 | 4
            r10.f164499a = r6
            r10.f164502d = r4
            int r10 = r12.intValue()
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.common.o.xc r4 = (com.google.common.p4552o.C60633xc) r4
            int r6 = r4.f164499a
            r6 = r6 | 8
            r4.f164499a = r6
            r4.f164503e = r10
            r0.mo57113c(r5)
            com.google.common.o.xc r10 = com.google.common.p4552o.C60633xc.f164497f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.common.o.xb r10 = (com.google.common.p4552o.C60632xb) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r4 = r10.instance
            com.google.common.o.xc r4 = (com.google.common.p4552o.C60633xc) r4
            r4.f164500b = r3
            int r5 = r4.f164499a
            r5 = r5 | r2
            r4.f164499a = r5
            r10.copyOnWrite()
            com.google.protobuf.bv r4 = r10.instance
            com.google.common.o.xc r4 = (com.google.common.p4552o.C60633xc) r4
            int r5 = r4.f164499a
            r5 = r5 | r3
            r4.f164499a = r5
            r4.f164501c = r11
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.common.o.xc r11 = (com.google.common.p4552o.C60633xc) r11
            int r4 = r11.f164499a
            r4 = r4 | 4
            r11.f164499a = r4
            r11.f164502d = r9
            int r9 = r12.intValue()
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.common.o.xc r11 = (com.google.common.p4552o.C60633xc) r11
            int r12 = r11.f164499a
            r12 = r12 | 8
            r11.f164499a = r12
            r11.f164503e = r9
            r0.mo57113c(r10)
        L_0x0128:
            r9 = 0
            if (r13 == 0) goto L_0x0183
            int r10 = r13.hashCode()
            r11 = 97768(0x17de8, float:1.37002E-40)
            if (r10 == r11) goto L_0x0143
            r11 = 3061565(0x2eb73d, float:4.290166E-39)
            if (r10 == r11) goto L_0x013a
            goto L_0x014d
        L_0x013a:
            java.lang.String r10 = "cqsb"
            boolean r10 = r13.equals(r10)
            if (r10 == 0) goto L_0x014d
            goto L_0x014e
        L_0x0143:
            java.lang.String r9 = "br8"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x014d
            r9 = 1
            goto L_0x014e
        L_0x014d:
            r9 = -1
        L_0x014e:
            if (r9 == 0) goto L_0x0172
            if (r9 == r2) goto L_0x0162
            r1.copyOnWrite()
            com.google.protobuf.bv r9 = r1.instance
            com.google.common.o.qw r9 = (com.google.common.p4552o.C60460qw) r9
            r9.f163622f = r2
            int r10 = r9.f163617a
            r10 = r10 | 32
            r9.f163617a = r10
            goto L_0x0192
        L_0x0162:
            r1.copyOnWrite()
            com.google.protobuf.bv r9 = r1.instance
            com.google.common.o.qw r9 = (com.google.common.p4552o.C60460qw) r9
            r9.f163622f = r3
            int r10 = r9.f163617a
            r10 = r10 | 32
            r9.f163617a = r10
            goto L_0x0192
        L_0x0172:
            r1.copyOnWrite()
            com.google.protobuf.bv r9 = r1.instance
            com.google.common.o.qw r9 = (com.google.common.p4552o.C60460qw) r9
            r10 = 3
            r9.f163622f = r10
            int r10 = r9.f163617a
            r10 = r10 | 32
            r9.f163617a = r10
            goto L_0x0192
        L_0x0183:
            r1.copyOnWrite()
            com.google.protobuf.bv r10 = r1.instance
            com.google.common.o.qw r10 = (com.google.common.p4552o.C60460qw) r10
            r10.f163622f = r9
            int r9 = r10.f163617a
            r9 = r9 | 32
            r10.f163617a = r9
        L_0x0192:
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.common.o.uf r9 = (com.google.common.p4552o.C60555uf) r9
            com.google.protobuf.bv r10 = r1.build()
            com.google.common.o.qw r10 = (com.google.common.p4552o.C60460qw) r10
            r10.getClass()
            r9.f164139at = r10
            int r10 = r9.f164249d
            r11 = 131072(0x20000, float:1.83671E-40)
            r10 = r10 | r11
            r9.f164249d = r10
            com.google.protobuf.bv r9 = r0.build()
            com.google.common.o.uf r9 = (com.google.common.p4552o.C60555uf) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchwidget.C117233ba.m194823g(int, com.google.common.o.qy, java.lang.String, java.lang.Integer, java.lang.String):com.google.common.o.uf");
    }

    /* renamed from: b */
    public final void mo103203b(boolean z) {
        int i = true != z ? 3 : 2;
        String string = Settings.Secure.getString(this.f325437n.f242024d.getContentResolver(), "selected_search_engine_aga");
        if (string == null) {
            string = "com.google.android.googlequicksearchbox";
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1448;
        long b = this.f325434k.mo26870b();
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164093a |= 1;
        ufVar2.f164257l = b;
        C60509sn snVar = (C60509sn) C60511sp.f163810d.createBuilder();
        snVar.copyOnWrite();
        C60511sp spVar = (C60511sp) snVar.instance;
        spVar.f163813b = i - 1;
        spVar.f163812a |= 1;
        snVar.copyOnWrite();
        C60511sp spVar2 = (C60511sp) snVar.instance;
        spVar2.f163812a = 2 | spVar2.f163812a;
        spVar2.f163814c = string;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        C60511sp spVar3 = (C60511sp) snVar.build();
        spVar3.getClass();
        ufVar3.f164202cC = spVar3;
        ufVar3.f164255j |= 4194304;
        C60555uf ufVar4 = (C60555uf) tzVar.build();
        if (this.f325438o.mo78062G()) {
            C89949q.m146525j(ufVar4, (C60321oe) null, (C63196b) null, (String) null);
            return;
        }
        C143658k kVar = this.f325435l;
        C58191h hVar = (C58191h) C58192i.f155603j.createBuilder();
        hVar.copyOnWrite();
        C58192i iVar = (C58192i) hVar.instance;
        ufVar4.getClass();
        iVar.f155607c = ufVar4;
        iVar.f155605a |= 4;
        String str = this.f325436m;
        hVar.copyOnWrite();
        C58192i iVar2 = (C58192i) hVar.instance;
        str.getClass();
        iVar2.f155605a |= 128;
        iVar2.f155610f = str;
        C143657j d = kVar.mo118999d(hVar.build());
        C58149a aVar = d.f389461c;
        aVar.copyOnWrite();
        C58150b bVar = (C58150b) aVar.instance;
        C58150b bVar2 = C58150b.f155459k;
        bVar.f155461a |= 16;
        bVar.f155464d = 1448;
        d.mo118992a();
    }

    /* renamed from: c */
    public final void mo103204c(int[] iArr) {
        mo103205d(C60462qy.DELETED, iArr, false, this.f325427d.mo79746e(C89985ax.f246661O), (C89283z) null);
        this.f325426c.edit().remove("search_widget_height").remove("search_widget_width").apply();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02b4  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103205d(com.google.common.p4552o.C60462qy r19, int[] r20, boolean r21, boolean r22, com.google.android.apps.gsa.shared.p6995aq.C89283z r23) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            android.content.SharedPreferences r0 = r7.f325426c
            java.lang.String r1 = "launcher"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x001c
            com.google.android.apps.gsa.shared.aq.a r0 = r7.f325425b
            java.lang.String r0 = r0.mo83214b()
        L_0x001c:
            r10 = r0
            if (r9 == 0) goto L_0x02cf
            int r11 = r9.length
            if (r11 == 0) goto L_0x02cf
            r13 = 0
        L_0x0023:
            if (r13 >= r11) goto L_0x02cf
            r0 = r9[r13]
            android.appwidget.AppWidgetManager r1 = r7.f325428e
            android.os.Bundle r1 = r1.getAppWidgetOptions(r0)
            android.content.SharedPreferences r2 = r7.f325426c
            java.lang.String r3 = "home_screen_widget_id"
            r14 = -1
            int r2 = r2.getInt(r3, r14)
            android.content.SharedPreferences r3 = r7.f325426c
            java.lang.String r4 = "recents_widget_id"
            int r3 = r3.getInt(r4, r14)
            if (r0 != r2) goto L_0x0048
            boolean r2 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.m194763k(r1)
            if (r2 != 0) goto L_0x0048
        L_0x0046:
            r2 = 1
            goto L_0x0080
        L_0x0048:
            r2 = 2
            if (r0 != r3) goto L_0x0052
            boolean r3 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.m194765m(r1)
            if (r3 != 0) goto L_0x0052
            goto L_0x0080
        L_0x0052:
            boolean r3 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.m194765m(r1)
            if (r3 == 0) goto L_0x0068
            android.content.SharedPreferences r1 = r7.f325426c
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "home_screen_widget_id"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r2, r0)
            r1.apply()
            goto L_0x0046
        L_0x0068:
            boolean r1 = com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.m194763k(r1)
            if (r1 == 0) goto L_0x007e
            android.content.SharedPreferences r1 = r7.f325426c
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r3 = "recents_widget_id"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r3, r0)
            r1.apply()
            goto L_0x0080
        L_0x007e:
            r1 = 3
            r2 = 3
        L_0x0080:
            com.google.common.o.qy r1 = com.google.common.p4552o.C60462qy.UPDATED
            r6 = 0
            if (r8 == r1) goto L_0x008d
            com.google.common.o.qy r1 = com.google.common.p4552o.C60462qy.UPDATED_OPTIONS_CHANGED
            if (r8 != r1) goto L_0x008a
            goto L_0x008d
        L_0x008a:
            r16 = r6
            goto L_0x009d
        L_0x008d:
            android.appwidget.AppWidgetManager r1 = r7.f325428e
            android.os.Bundle r1 = r1.getAppWidgetOptions(r0)
            java.lang.String r3 = "requested-widget-style"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.getString(r3, r4)
            r16 = r1
        L_0x009d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r1 = r18
            r3 = r19
            r4 = r10
            r14 = r6
            r6 = r16
            com.google.common.o.uf r0 = r1.m194823g(r2, r3, r4, r5, r6)
            com.google.protobuf.bn r0 = r0.toBuilder()
            r1 = r0
            com.google.common.o.tz r1 = (com.google.common.p4552o.C60548tz) r1
            if (r23 == 0) goto L_0x00ef
            com.google.android.apps.gsa.shared.aq.z r0 = com.google.android.apps.gsa.shared.p6995aq.C89283z.f242073n
            com.google.protobuf.bn r0 = r0.createBuilder()
            r2 = r0
            com.google.android.apps.gsa.shared.aq.m r2 = (com.google.android.apps.gsa.shared.p6995aq.C89270m) r2
            byte[] r0 = r23.toByteArray()     // Catch:{ ct -> 0x00c7 }
            r2.mergeFrom((byte[]) r0)     // Catch:{ ct -> 0x00c7 }
            goto L_0x00d7
        L_0x00c7:
            r0 = move-exception
            com.google.common.f.e r3 = f325424a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "Could not parse proto. This should never happen."
            r5 = 32740(0x7fe4, float:4.5879E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x00d7:
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.gsa.shared.aq.z r2 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r2
            r2.getClass()
            r0.f164073G = r2
            int r2 = r0.f164146b
            r2 = r2 | 512(0x200, float:7.175E-43)
            r0.f164146b = r2
        L_0x00ef:
            if (r21 == 0) goto L_0x02b4
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f325427d
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246678aE
            boolean r0 = r0.mo79746e(r2)
            r2 = 0
            if (r0 == 0) goto L_0x0142
            int r0 = r8.f163634h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "search_widget_event_timestamp_"
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.content.SharedPreferences r4 = r7.f325426c
            long r2 = r4.getLong(r0, r2)
            com.google.android.libraries.f.a r4 = r7.f325434k
            long r4 = r4.mo26870b()
            long r2 = r4 - r2
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS
            r17 = r13
            r12 = 1
            long r12 = r6.toMillis(r12)
            int r6 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x013f
            android.content.SharedPreferences r2 = r7.f325426c
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r0 = r2.putLong(r0, r4)
            r0.apply()
            com.google.protobuf.bv r0 = r1.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r14, r14, r14)
        L_0x013f:
            r3 = 0
            goto L_0x02c7
        L_0x0142:
            r17 = r13
            com.google.android.apps.gsa.search.core.logging.d r0 = r7.f325433j
            com.google.protobuf.bv r1 = r1.build()
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            android.content.Context r4 = r0.f232865a
            java.lang.String r5 = "ThrottlingLogger"
            r6 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r6)
            java.lang.Object r5 = r0.f232869e
            monitor-enter(r5)
            com.google.android.search.core.a.b r6 = r0.mo79811a(r4)     // Catch:{ all -> 0x02b1 }
            if (r6 == 0) goto L_0x0168
            com.google.protobuf.bn r6 = r6.toBuilder()     // Catch:{ all -> 0x02b1 }
            com.google.android.search.core.a.a r6 = (com.google.android.search.core.p3548a.C45231a) r6     // Catch:{ all -> 0x02b1 }
            goto L_0x0170
        L_0x0168:
            com.google.android.search.core.a.b r6 = com.google.android.search.core.p3548a.C45232b.f118026b     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x02b1 }
            com.google.android.search.core.a.a r6 = (com.google.android.search.core.p3548a.C45231a) r6     // Catch:{ all -> 0x02b1 }
        L_0x0170:
            com.google.protobuf.bv r12 = r6.instance     // Catch:{ all -> 0x02b1 }
            com.google.android.search.core.a.b r12 = (com.google.android.search.core.p3548a.C45232b) r12     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.cq r12 = r12.f118028a     // Catch:{ all -> 0x02b1 }
            int r12 = r12.size()     // Catch:{ all -> 0x02b1 }
            if (r12 <= 0) goto L_0x0246
            com.google.protobuf.bv r12 = r6.instance     // Catch:{ all -> 0x02b1 }
            com.google.android.search.core.a.b r12 = (com.google.android.search.core.p3548a.C45232b) r12     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.cq r12 = r12.f118028a     // Catch:{ all -> 0x02b1 }
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)     // Catch:{ all -> 0x02b1 }
            r14 = 0
        L_0x0187:
            int r13 = r12.size()     // Catch:{ all -> 0x02b1 }
            if (r14 >= r13) goto L_0x01d0
            java.lang.Object r13 = r12.get(r14)     // Catch:{ all -> 0x02b1 }
            com.google.common.o.uf r13 = (com.google.common.p4552o.C60555uf) r13     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bn r13 = r13.toBuilder()     // Catch:{ all -> 0x02b1 }
            com.google.common.o.tz r13 = (com.google.common.p4552o.C60548tz) r13     // Catch:{ all -> 0x02b1 }
            r13.copyOnWrite()     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bv r15 = r13.instance     // Catch:{ all -> 0x02b1 }
            com.google.common.o.uf r15 = (com.google.common.p4552o.C60555uf) r15     // Catch:{ all -> 0x02b1 }
            int r2 = r15.f164249d     // Catch:{ all -> 0x02b1 }
            r2 = r2 & -16385(0xffffffffffffbfff, float:NaN)
            r15.f164249d = r2     // Catch:{ all -> 0x02b1 }
            r2 = 0
            r15.f164136aq = r2     // Catch:{ all -> 0x02b1 }
            r13.copyOnWrite()     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bv r2 = r13.instance     // Catch:{ all -> 0x02b1 }
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2     // Catch:{ all -> 0x02b1 }
            int r3 = r2.f164249d     // Catch:{ all -> 0x02b1 }
            r15 = -32769(0xffffffffffff7fff, float:NaN)
            r3 = r3 & r15
            r2.f164249d = r3     // Catch:{ all -> 0x02b1 }
            r8 = 0
            r2.f164137ar = r8     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bv r2 = r13.build()     // Catch:{ all -> 0x02b1 }
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2     // Catch:{ all -> 0x02b1 }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x02b1 }
            if (r2 != 0) goto L_0x01d1
            int r14 = r14 + 1
            r2 = r8
            r8 = r19
            r9 = r20
            goto L_0x0187
        L_0x01d0:
            r14 = -1
        L_0x01d1:
            if (r14 < 0) goto L_0x0228
            com.google.protobuf.bv r1 = r6.instance     // Catch:{ all -> 0x02b1 }
            com.google.android.search.core.a.b r1 = (com.google.android.search.core.p3548a.C45232b) r1     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.cq r1 = r1.f118028a     // Catch:{ all -> 0x02b1 }
            java.lang.Object r1 = r1.get(r14)     // Catch:{ all -> 0x02b1 }
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bn r2 = r1.toBuilder()     // Catch:{ all -> 0x02b1 }
            com.google.common.o.tz r2 = (com.google.common.p4552o.C60548tz) r2     // Catch:{ all -> 0x02b1 }
            int r1 = r1.f164136aq     // Catch:{ all -> 0x02b1 }
            r3 = 1
            int r1 = r1 + r3
            r2.copyOnWrite()     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x02b1 }
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3     // Catch:{ all -> 0x02b1 }
            int r8 = r3.f164249d     // Catch:{ all -> 0x02b1 }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            r3.f164249d = r8     // Catch:{ all -> 0x02b1 }
            r3.f164136aq = r1     // Catch:{ all -> 0x02b1 }
            com.google.android.libraries.f.a r1 = r0.f232866b     // Catch:{ all -> 0x02b1 }
            long r8 = r1.mo26870b()     // Catch:{ all -> 0x02b1 }
            r2.copyOnWrite()     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bv r1 = r2.instance     // Catch:{ all -> 0x02b1 }
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1     // Catch:{ all -> 0x02b1 }
            int r3 = r1.f164249d     // Catch:{ all -> 0x02b1 }
            r12 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r12
            r1.f164249d = r3     // Catch:{ all -> 0x02b1 }
            r1.f164137ar = r8     // Catch:{ all -> 0x02b1 }
            r6.copyOnWrite()     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bv r1 = r6.instance     // Catch:{ all -> 0x02b1 }
            com.google.android.search.core.a.b r1 = (com.google.android.search.core.p3548a.C45232b) r1     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x02b1 }
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2     // Catch:{ all -> 0x02b1 }
            r2.getClass()     // Catch:{ all -> 0x02b1 }
            r1.mo49094a()     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.cq r1 = r1.f118028a     // Catch:{ all -> 0x02b1 }
            r1.set(r14, r2)     // Catch:{ all -> 0x02b1 }
            goto L_0x028b
        L_0x0228:
            com.google.protobuf.bv r2 = r6.instance     // Catch:{ all -> 0x02b1 }
            com.google.android.search.core.a.b r2 = (com.google.android.search.core.p3548a.C45232b) r2     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.cq r2 = r2.f118028a     // Catch:{ all -> 0x02b1 }
            int r2 = r2.size()     // Catch:{ all -> 0x02b1 }
            r3 = 15
            if (r2 < r3) goto L_0x0246
            r6.copyOnWrite()     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bv r2 = r6.instance     // Catch:{ all -> 0x02b1 }
            com.google.android.search.core.a.b r2 = (com.google.android.search.core.p3548a.C45232b) r2     // Catch:{ all -> 0x02b1 }
            r2.mo49094a()     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.cq r2 = r2.f118028a     // Catch:{ all -> 0x02b1 }
            r3 = 0
            r2.remove(r3)     // Catch:{ all -> 0x02b1 }
        L_0x0246:
            com.google.protobuf.bn r1 = r1.toBuilder()     // Catch:{ all -> 0x02b1 }
            com.google.common.o.tz r1 = (com.google.common.p4552o.C60548tz) r1     // Catch:{ all -> 0x02b1 }
            r1.copyOnWrite()     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ all -> 0x02b1 }
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2     // Catch:{ all -> 0x02b1 }
            int r3 = r2.f164249d     // Catch:{ all -> 0x02b1 }
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r2.f164249d = r3     // Catch:{ all -> 0x02b1 }
            r3 = 1
            r2.f164136aq = r3     // Catch:{ all -> 0x02b1 }
            com.google.android.libraries.f.a r2 = r0.f232866b     // Catch:{ all -> 0x02b1 }
            long r2 = r2.mo26870b()     // Catch:{ all -> 0x02b1 }
            r1.copyOnWrite()     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bv r8 = r1.instance     // Catch:{ all -> 0x02b1 }
            com.google.common.o.uf r8 = (com.google.common.p4552o.C60555uf) r8     // Catch:{ all -> 0x02b1 }
            int r9 = r8.f164249d     // Catch:{ all -> 0x02b1 }
            r12 = 32768(0x8000, float:4.5918E-41)
            r9 = r9 | r12
            r8.f164249d = r9     // Catch:{ all -> 0x02b1 }
            r8.f164137ar = r2     // Catch:{ all -> 0x02b1 }
            r6.copyOnWrite()     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bv r2 = r6.instance     // Catch:{ all -> 0x02b1 }
            com.google.android.search.core.a.b r2 = (com.google.android.search.core.p3548a.C45232b) r2     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x02b1 }
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1     // Catch:{ all -> 0x02b1 }
            r1.getClass()     // Catch:{ all -> 0x02b1 }
            r2.mo49094a()     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.cq r2 = r2.f118028a     // Catch:{ all -> 0x02b1 }
            r2.add(r1)     // Catch:{ all -> 0x02b1 }
        L_0x028b:
            com.google.protobuf.bv r1 = r6.build()     // Catch:{ all -> 0x02b1 }
            com.google.android.search.core.a.b r1 = (com.google.android.search.core.p3548a.C45232b) r1     // Catch:{ all -> 0x02b1 }
            r0.f232868d = r1     // Catch:{ all -> 0x02b1 }
            com.google.protobuf.bv r0 = r6.build()     // Catch:{ all -> 0x02b1 }
            com.google.android.search.core.a.b r0 = (com.google.android.search.core.p3548a.C45232b) r0     // Catch:{ all -> 0x02b1 }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x02b1 }
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch:{ all -> 0x02b1 }
            java.lang.String r2 = "aggregated_events"
            r3 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ all -> 0x02b1 }
            android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)     // Catch:{ all -> 0x02b1 }
            r0.apply()     // Catch:{ all -> 0x02b1 }
            monitor-exit(r5)     // Catch:{ all -> 0x02b1 }
            goto L_0x02c7
        L_0x02b1:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x02b1 }
            throw r0
        L_0x02b4:
            r17 = r13
            r3 = 0
            com.google.protobuf.bv r0 = r1.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r14, r14, r14)
            if (r22 == 0) goto L_0x02c7
            com.google.android.apps.gsa.eventlogger.j r0 = r7.f325432i
            r0.a()
        L_0x02c7:
            int r13 = r17 + 1
            r8 = r19
            r9 = r20
            goto L_0x0023
        L_0x02cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchwidget.C117233ba.mo103205d(com.google.common.o.qy, int[], boolean, boolean, com.google.android.apps.gsa.shared.aq.z):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C60870cx mo103206f(C60462qy qyVar, int[] iArr) {
        int i;
        if (qyVar == C60462qy.PROVIDER_DISABLED) {
            C89949q.m146523g(406);
        } else {
            String string = this.f325426c.getString("launcher", BuildConfig.FLAVOR);
            if (TextUtils.isEmpty(string)) {
                string = this.f325425b.mo83214b();
            }
            if (this.f325428e == null || (r8 = iArr.length) <= 0) {
                C89949q.m146525j(m194823g(3, qyVar, string, (Integer) null, (String) null), (C60321oe) null, (C63196b) null, (String) null);
            } else {
                for (int i2 : iArr) {
                    Bundle appWidgetOptions = this.f325428e.getAppWidgetOptions(i2);
                    if (C117204as.m194765m(appWidgetOptions)) {
                        i = 1;
                    } else {
                        i = C117204as.m194763k(appWidgetOptions) ? 2 : 3;
                    }
                    C89949q.m146525j(m194823g(i, qyVar, string, Integer.valueOf(i2), (String) null), (C60321oe) null, (C63196b) null, (String) null);
                }
            }
        }
        return C60866ct.f164955a;
    }
}
