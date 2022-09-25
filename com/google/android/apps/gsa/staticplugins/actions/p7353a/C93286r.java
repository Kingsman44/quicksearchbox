package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.provider.Settings;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.opa.p6435c.C83602n;
import com.google.android.apps.gsa.p8889z.p8891b.p8892a.C118850a;
import com.google.android.apps.gsa.search.core.C85741ce;
import com.google.android.apps.gsa.search.core.p6519al.p6628by.p6629a.C85043g;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.C87425m;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument;
import com.google.android.apps.gsa.search.shared.actions.util.C87484f;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.p6931i.C87572a;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.p7183s.C91088a;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.permissions.C91076c;
import com.google.android.apps.gsa.staticplugins.actions.C93423s;
import com.google.android.apps.gsa.staticplugins.actions.p7353a.p7354a.C93250a;
import com.google.android.apps.gsa.staticplugins.actions.p7358d.C93325l;
import com.google.android.apps.gsa.staticplugins.actions.p7358d.C93326m;
import com.google.android.apps.gsa.staticplugins.actions.p7358d.C93327n;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93387a;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93391e;
import com.google.android.libraries.gsa.conversation.clientop.communication.p1843a.C22412b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3745ab.C48273ca;
import com.google.assistant.p3745ab.C48275cc;
import com.google.assistant.p3745ab.C48276cd;
import com.google.assistant.p3745ab.C48277ce;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.p4152bb.p4153a.C55175iq;
import com.google.p4152bb.p4153a.C55237ky;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55305nl;
import com.google.p4152bb.p4153a.C55357pj;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.chromium.net.PrivateKeyType;
import p3186j$.util.DesugarArrays;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.r */
/* compiled from: PG */
public final class C93286r implements C93249a {

    /* renamed from: a */
    public static final String f260128a = String.valueOf(Environment.getExternalStorageDirectory().getPath()).concat("/DCIM/Camera");

    /* renamed from: e */
    private static final C59071e f260129e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.a.r");

    /* renamed from: f */
    private static final C58485gu f260130f = C58485gu.m89848p("com.google.android.music", "com.spotify.music", "com.pandora.android");

    /* renamed from: A */
    private final C68214a f260131A;

    /* renamed from: B */
    private final C68214a f260132B;

    /* renamed from: C */
    private final C68214a f260133C;

    /* renamed from: D */
    private final List f260134D;

    /* renamed from: E */
    private final C91088a f260135E;

    /* renamed from: F */
    private final C58833ax f260136F;

    /* renamed from: G */
    private final C93423s f260137G;

    /* renamed from: H */
    private final C93250a f260138H;

    /* renamed from: I */
    private final C85043g f260139I;

    /* renamed from: b */
    public final C91097g f260140b;

    /* renamed from: c */
    public final C93326m f260141c;

    /* renamed from: d */
    public final List f260142d;

    /* renamed from: g */
    private final C58833ax f260143g;

    /* renamed from: h */
    private final Context f260144h;

    /* renamed from: i */
    private final C87425m f260145i;

    /* renamed from: j */
    private final C87449m f260146j;

    /* renamed from: k */
    private final C118850a f260147k;

    /* renamed from: l */
    private final C58881cr f260148l;

    /* renamed from: m */
    private final C93327n f260149m;

    /* renamed from: n */
    private final C91096f f260150n = new C91095e();

    /* renamed from: o */
    private final C93391e f260151o;

    /* renamed from: p */
    private final C85741ce f260152p;

    /* renamed from: q */
    private final C87572a f260153q;

    /* renamed from: r */
    private final C93264al f260154r;

    /* renamed from: s */
    private final C22412b f260155s;

    /* renamed from: t */
    private final C68214a f260156t;

    /* renamed from: u */
    private final C68214a f260157u;

    /* renamed from: v */
    private final C22871g f260158v;

    /* renamed from: w */
    private final C22871g f260159w;

    /* renamed from: x */
    private final C58833ax f260160x;

    /* renamed from: y */
    private final C68214a f260161y;

    /* renamed from: z */
    private final C86124t f260162z;

    protected C93286r(C91097g gVar, C58833ax axVar, Context context, C87449m mVar, PackageManager packageManager, C118850a aVar, C58881cr crVar, C93327n nVar, C85741ce ceVar, C93391e eVar, ComponentName componentName, C93264al alVar, C22412b bVar, C68214a aVar2, C68214a aVar3, C22871g gVar2, C22871g gVar3, C22871g gVar4, C58833ax axVar2, C68214a aVar4, C86124t tVar, C69464a aVar5, C68214a aVar6, C93423s sVar, C91123v vVar, C68214a aVar7, C68214a aVar8, C93250a aVar9, C85043g gVar5, C58833ax axVar3) {
        Context context2 = context;
        ComponentName componentName2 = componentName;
        C22871g gVar6 = gVar2;
        C69464a aVar10 = aVar5;
        ArrayList arrayList = new ArrayList();
        this.f260134D = arrayList;
        this.f260140b = gVar;
        this.f260143g = axVar;
        this.f260144h = context2;
        this.f260146j = mVar;
        this.f260147k = aVar;
        this.f260148l = crVar;
        this.f260149m = nVar;
        this.f260152p = ceVar;
        this.f260151o = eVar;
        C87572a aVar11 = new C87572a(new C87573b(context2, componentName2, new C9325m(context2, componentName2, aVar10)));
        this.f260153q = aVar11;
        this.f260145i = new C87425m(packageManager, context2, aVar11.mo81703a());
        this.f260154r = alVar;
        this.f260155s = bVar;
        this.f260156t = aVar2;
        this.f260157u = aVar3;
        this.f260133C = aVar8;
        this.f260132B = aVar7;
        C87572a aVar12 = new C87572a(new C87573b(context2, componentName2, new C9325m(context2, componentName2, aVar10)));
        if (vVar.mo85393e()) {
            this.f260141c = new C93325l(context, packageManager, mVar, gVar.mo65092d(), nVar, aVar3, aVar12);
        } else {
            this.f260141c = new C93326m(context, packageManager, mVar, gVar.mo65092d(), nVar, aVar3, aVar12);
        }
        this.f260158v = gVar6;
        this.f260159w = gVar3;
        this.f260160x = axVar2;
        this.f260161y = aVar4;
        this.f260162z = tVar;
        this.f260131A = aVar6;
        this.f260137G = sVar;
        arrayList.add(new C93279k(context2, gVar4, gVar6));
        this.f260135E = new C91088a();
        this.f260138H = aVar9;
        this.f260139I = gVar5;
        this.f260136F = axVar3;
        this.f260142d = C83602n.m133182b(tVar);
    }

    /* renamed from: c */
    public static long m153397c(String str) {
        File[] listFiles;
        File file = new File(str);
        if (file.exists() && (listFiles = file.listFiles(new C93285q())) != null) {
            return ((Long) DesugarArrays.stream((T[]) listFiles).map(C93282n.f260122a).max(C93283o.f260123a).orElse(0L)).longValue();
        }
        return 0;
    }

    /* renamed from: f */
    private static float m153398f(DeviceSettingsArgument deviceSettingsArgument, float f, float f2) {
        float f3 = deviceSettingsArgument.f236158l ? (float) deviceSettingsArgument.f236159m : deviceSettingsArgument.f236156j ? (f2 * ((float) deviceSettingsArgument.f236157k)) / 100.0f : f2 * 0.2f;
        return deviceSettingsArgument.f236162p == 4 ? f + f3 : f - f3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x019e A[Catch:{ CanceledException -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x019f A[Catch:{ CanceledException -> 0x01dc }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.gsa.search.shared.actions.C87421i m153399g(com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r14, com.google.p4152bb.p4153a.C55240la r15) {
        /*
            r13 = this;
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55208jw.f145316z
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r15.mo58887l(r0)
            com.google.protobuf.bf r1 = r15.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r1 = r1.mo58854l(r2)
            if (r1 != 0) goto L_0x0016
            java.lang.Object r0 = r0.f169969b
            goto L_0x001a
        L_0x0016:
            java.lang.Object r0 = r0.mo58889c(r1)
        L_0x001a:
            com.google.bb.a.jw r0 = (com.google.p4152bb.p4153a.C55208jw) r0
            r0.getClass()
            com.google.android.apps.gsa.search.shared.actions.m r1 = r13.f260145i
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r2 = r13.f260146j
            android.content.Intent r1 = r1.mo81206a(r0, r14, r2)
            if (r1 != 0) goto L_0x002c
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            return r14
        L_0x002c:
            boolean r2 = r0.f145333p
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x00e5
            com.google.common.base.ax r1 = r13.f260143g
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x00e2
            com.google.common.base.ax r1 = r13.f260143g
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.search.shared.h.k r1 = (com.google.android.apps.gsa.search.shared.p6930h.C87568k) r1
            android.content.Context r2 = r13.f260144h
            com.google.android.apps.gsa.search.shared.h.h r6 = new com.google.android.apps.gsa.search.shared.h.h
            r6.<init>()
            r6.f236560f = r3
            r6.f236497A = r4
            com.google.android.apps.gsa.search.core.i.t r7 = r13.f260162z
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247590jy
            boolean r7 = r7.mo79746e(r8)
            if (r7 != 0) goto L_0x005b
        L_0x0058:
            r7 = 0
            goto L_0x00d5
        L_0x005b:
            dagger.a r7 = r13.f260132B
            java.lang.Object r7 = r7.mo27525b()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            java.lang.String r8 = "opa_warm_welcome_launch_count"
            int r7 = r7.getInt(r8, r5)
            long r9 = (long) r7
            com.google.android.apps.gsa.search.core.i.t r7 = r13.f260162z
            com.google.android.apps.gsa.shared.m.f r11 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247589jx
            long r11 = r7.mo79743a(r11)
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x0077
            goto L_0x0058
        L_0x0077:
            dagger.a r7 = r13.f260132B
            java.lang.Object r7 = r7.mo27525b()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            int r7 = r7.getInt(r8, r5)
            if (r7 <= 0) goto L_0x0086
            goto L_0x0058
        L_0x0086:
            dagger.a r7 = r13.f260132B
            java.lang.Object r7 = r7.mo27525b()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            int r7 = r7.getInt(r8, r5)
            java.lang.String r8 = "opa_warmer_welcome_launch_count"
            if (r7 != 0) goto L_0x00b5
            dagger.a r7 = r13.f260132B
            java.lang.Object r7 = r7.mo27525b()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            int r7 = r7.getInt(r8, r5)
            if (r7 != 0) goto L_0x00b5
            dagger.a r7 = r13.f260132B
            java.lang.Object r7 = r7.mo27525b()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            java.lang.String r9 = "assistant_response_received"
            boolean r7 = r7.getBoolean(r9, r5)
            if (r7 == 0) goto L_0x00b5
            goto L_0x0058
        L_0x00b5:
            dagger.a r7 = r13.f260132B
            java.lang.Object r7 = r7.mo27525b()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            int r7 = r7.getInt(r8, r5)
            dagger.a r8 = r13.f260132B
            java.lang.Object r8 = r8.mo27525b()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.lang.String r9 = "ww_chat_ui_help_num_times_triggered"
            int r8 = r8.getInt(r9, r5)
            int r7 = r7 - r8
            r8 = 3
            if (r7 < r8) goto L_0x00d4
            goto L_0x0058
        L_0x00d4:
            r7 = 1
        L_0x00d5:
            r6.f236498B = r7
            android.os.Bundle r6 = r6.mo81685a()
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r1 = r1.mo81687a(r2, r6, r7)
            goto L_0x00e5
        L_0x00e2:
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            return r14
        L_0x00e5:
            java.lang.String r2 = r0.f145337t
            boolean r2 = r2.isEmpty()
            r6 = 0
            if (r2 != 0) goto L_0x0224
            dagger.a r2 = r13.f260157u
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.handsfree.i r2 = (com.google.android.apps.gsa.handsfree.i) r2
            java.lang.String r7 = r0.f145337t
            android.app.PendingIntent r2 = r2.a(r7)
            if (r2 == 0) goto L_0x0224
            dagger.a r15 = r13.f260157u
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.handsfree.i r15 = (com.google.android.apps.gsa.handsfree.i) r15
            java.lang.String r2 = r0.f145337t
            android.app.PendingIntent r15 = r15.a(r2)
            if (r15 == 0) goto L_0x0221
            com.google.common.o.uf r2 = com.google.common.p4552o.C60555uf.f164065cO     // Catch:{ CanceledException -> 0x01dc }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ CanceledException -> 0x01dc }
            com.google.common.o.tz r2 = (com.google.common.p4552o.C60548tz) r2     // Catch:{ CanceledException -> 0x01dc }
            r2.copyOnWrite()     // Catch:{ CanceledException -> 0x01dc }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ CanceledException -> 0x01dc }
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4     // Catch:{ CanceledException -> 0x01dc }
            int r7 = r4.f164093a     // Catch:{ CanceledException -> 0x01dc }
            r7 = r7 | r3
            r4.f164093a = r7     // Catch:{ CanceledException -> 0x01dc }
            r7 = 585(0x249, float:8.2E-43)
            r4.f164258m = r7     // Catch:{ CanceledException -> 0x01dc }
            com.google.bb.a.x r4 = r14.f236107m     // Catch:{ CanceledException -> 0x01dc }
            int r4 = r4.f146230cP     // Catch:{ CanceledException -> 0x01dc }
            r2.copyOnWrite()     // Catch:{ CanceledException -> 0x01dc }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ CanceledException -> 0x01dc }
            com.google.common.o.uf r7 = (com.google.common.p4552o.C60555uf) r7     // Catch:{ CanceledException -> 0x01dc }
            int r8 = r7.f164093a     // Catch:{ CanceledException -> 0x01dc }
            r8 = r8 | 256(0x100, float:3.59E-43)
            r7.f164093a = r8     // Catch:{ CanceledException -> 0x01dc }
            r7.f164264s = r4     // Catch:{ CanceledException -> 0x01dc }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ CanceledException -> 0x01dc }
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2     // Catch:{ CanceledException -> 0x01dc }
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r2, r6, r6, r6)     // Catch:{ CanceledException -> 0x01dc }
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r2 = r13.f260146j     // Catch:{ CanceledException -> 0x01dc }
            com.google.protobuf.cq r0 = r0.f145328k     // Catch:{ CanceledException -> 0x01dc }
            android.os.Bundle r0 = com.google.android.apps.gsa.search.shared.actions.C87425m.m141598b(r0, r14, r2)     // Catch:{ CanceledException -> 0x01dc }
            if (r0 != 0) goto L_0x014e
        L_0x014c:
            r4 = r6
            goto L_0x019c
        L_0x014e:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ CanceledException -> 0x01dc }
            r2.<init>()     // Catch:{ CanceledException -> 0x01dc }
            java.util.Set r4 = r0.keySet()     // Catch:{ CanceledException -> 0x01dc }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ CanceledException -> 0x01dc }
        L_0x015b:
            boolean r7 = r4.hasNext()     // Catch:{ CanceledException -> 0x01dc }
            if (r7 == 0) goto L_0x017d
            java.lang.Object r7 = r4.next()     // Catch:{ CanceledException -> 0x01dc }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ CanceledException -> 0x01dc }
            dagger.a r8 = r13.f260157u     // Catch:{ CanceledException -> 0x01dc }
            java.lang.Object r8 = r8.mo27525b()     // Catch:{ CanceledException -> 0x01dc }
            com.google.android.apps.gsa.handsfree.i r8 = (com.google.android.apps.gsa.handsfree.i) r8     // Catch:{ CanceledException -> 0x01dc }
            java.util.Map r8 = r8.c     // Catch:{ CanceledException -> 0x01dc }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ CanceledException -> 0x01dc }
            androidx.core.app.ba r7 = (androidx.core.app.C1811ba) r7     // Catch:{ CanceledException -> 0x01dc }
            if (r7 == 0) goto L_0x015b
            r2.add(r7)     // Catch:{ CanceledException -> 0x01dc }
            goto L_0x015b
        L_0x017d:
            boolean r4 = r2.isEmpty()     // Catch:{ CanceledException -> 0x01dc }
            if (r4 == 0) goto L_0x0184
            goto L_0x014c
        L_0x0184:
            int r4 = r2.size()     // Catch:{ CanceledException -> 0x01dc }
            androidx.core.app.ba[] r4 = new androidx.core.app.C1811ba[r4]     // Catch:{ CanceledException -> 0x01dc }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ CanceledException -> 0x01dc }
            androidx.core.app.ba[] r2 = (androidx.core.app.C1811ba[]) r2     // Catch:{ CanceledException -> 0x01dc }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ CanceledException -> 0x01dc }
            r4.<init>()     // Catch:{ CanceledException -> 0x01dc }
            android.app.RemoteInput[] r2 = androidx.core.app.C1811ba.m4980a(r2)     // Catch:{ CanceledException -> 0x01dc }
            androidx.core.app.C1806aw.m4969c(r2, r4, r0)     // Catch:{ CanceledException -> 0x01dc }
        L_0x019c:
            if (r4 != 0) goto L_0x019f
            goto L_0x01a0
        L_0x019f:
            r1 = r4
        L_0x01a0:
            android.content.Context r0 = r13.f260144h     // Catch:{ CanceledException -> 0x01dc }
            r15.send(r0, r5, r1)     // Catch:{ CanceledException -> 0x01dc }
            com.google.common.o.uf r15 = com.google.common.p4552o.C60555uf.f164065cO     // Catch:{ CanceledException -> 0x01dc }
            com.google.protobuf.bn r15 = r15.createBuilder()     // Catch:{ CanceledException -> 0x01dc }
            com.google.common.o.tz r15 = (com.google.common.p4552o.C60548tz) r15     // Catch:{ CanceledException -> 0x01dc }
            r15.copyOnWrite()     // Catch:{ CanceledException -> 0x01dc }
            com.google.protobuf.bv r0 = r15.instance     // Catch:{ CanceledException -> 0x01dc }
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0     // Catch:{ CanceledException -> 0x01dc }
            int r1 = r0.f164093a     // Catch:{ CanceledException -> 0x01dc }
            r1 = r1 | r3
            r0.f164093a = r1     // Catch:{ CanceledException -> 0x01dc }
            r1 = 794(0x31a, float:1.113E-42)
            r0.f164258m = r1     // Catch:{ CanceledException -> 0x01dc }
            com.google.bb.a.x r0 = r14.f236107m     // Catch:{ CanceledException -> 0x01dc }
            int r0 = r0.f146230cP     // Catch:{ CanceledException -> 0x01dc }
            r15.copyOnWrite()     // Catch:{ CanceledException -> 0x01dc }
            com.google.protobuf.bv r1 = r15.instance     // Catch:{ CanceledException -> 0x01dc }
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1     // Catch:{ CanceledException -> 0x01dc }
            int r2 = r1.f164093a     // Catch:{ CanceledException -> 0x01dc }
            r2 = r2 | 256(0x100, float:3.59E-43)
            r1.f164093a = r2     // Catch:{ CanceledException -> 0x01dc }
            r1.f164264s = r0     // Catch:{ CanceledException -> 0x01dc }
            com.google.protobuf.bv r15 = r15.build()     // Catch:{ CanceledException -> 0x01dc }
            com.google.common.o.uf r15 = (com.google.common.p4552o.C60555uf) r15     // Catch:{ CanceledException -> 0x01dc }
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r15, r6, r6, r6)     // Catch:{ CanceledException -> 0x01dc }
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a     // Catch:{ CanceledException -> 0x01dc }
            return r14
        L_0x01dc:
            r15 = move-exception
            com.google.common.o.uf r0 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.tz r0 = (com.google.common.p4552o.C60548tz) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            int r2 = r1.f164093a
            r2 = r2 | r3
            r1.f164093a = r2
            r2 = 793(0x319, float:1.111E-42)
            r1.f164258m = r2
            com.google.bb.a.x r14 = r14.f236107m
            int r14 = r14.f146230cP
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            int r2 = r1.f164093a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r1.f164093a = r2
            r1.f164264s = r14
            com.google.protobuf.bv r14 = r0.build()
            com.google.common.o.uf r14 = (com.google.common.p4552o.C60555uf) r14
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r14, r6, r6, r6)
            com.google.common.f.e r14 = f260129e
            com.google.common.f.x r14 = r14.mo56225c()
            java.lang.String r0 = "pending intent canceled"
            r1 = 13512(0x34c8, float:1.8934E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56382g(r15)).mo56372aa(r1)).mo56386p(r0)
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            return r14
        L_0x0221:
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            return r14
        L_0x0224:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r2 = r14.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r2 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r2
            com.google.android.apps.gsa.search.shared.actions.util.i r7 = r2.f236270h
            boolean r7 = r7.mo81484i()
            if (r7 == 0) goto L_0x0258
            java.lang.String r7 = r1.getPackage()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0258
            com.google.bb.a.pn r2 = r2.mo81433d()
            java.lang.String r2 = com.google.android.apps.gsa.search.shared.actions.util.C87494p.m142026c(r2)
            r1.setPackage(r2)
            android.content.Context r2 = r13.f260144h
            android.content.Intent[] r7 = new android.content.Intent[r4]
            r7[r5] = r1
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r2 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142015c(r2, r7)
            boolean r2 = r2.mo81435e()
            if (r2 == 0) goto L_0x0258
            r1.setPackage(r6)
        L_0x0258:
            boolean r2 = r0.f145336s
            if (r2 == 0) goto L_0x0277
            com.google.android.apps.gsa.shared.util.s.a r2 = r13.f260135E
            android.content.Context r7 = r13.f260144h
            boolean r2 = r2.mo85355d(r7, r1)
            if (r2 == 0) goto L_0x0267
            goto L_0x0277
        L_0x0267:
            com.google.common.f.e r14 = f260129e
            com.google.common.f.x r14 = r14.mo56225c()
            java.lang.String r15 = "Unable to sign intent"
            r0 = 13510(0x34c6, float:1.8932E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            return r14
        L_0x0277:
            boolean r2 = r0.f145330m
            if (r2 == 0) goto L_0x0287
            java.lang.String r2 = r1.getPackage()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0287
            r2 = 1
            goto L_0x0288
        L_0x0287:
            r2 = 0
        L_0x0288:
            com.google.common.base.ax r7 = r13.f260160x
            boolean r7 = r7.mo56113h()
            if (r7 == 0) goto L_0x02d7
            if (r2 == 0) goto L_0x02d7
            com.google.common.base.ax r7 = r13.f260160x
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.apps.gsa.staticplugins.actions.a.h r7 = (com.google.android.apps.gsa.staticplugins.actions.p7353a.C93276h) r7
            java.sql.Timestamp r8 = new java.sql.Timestamp
            java.util.Date r9 = new java.util.Date
            r9.<init>()
            long r9 = r9.getTime()
            r8.<init>(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "com.google.android.gms.action.EXTRA_COMPLETION_TOKEN"
            r1.putExtra(r9, r8)
            com.google.android.gms.common.api.w r9 = r7.f260107c
            r9.mo119131f()
            com.google.android.gms.common.api.l r9 = com.google.android.gms.appdatasearch.C142805b.f387601a
            com.google.android.gms.common.api.w r9 = r7.f260107c
            r1.getPackage()
            com.google.android.gms.appdatasearch.a.j r10 = new com.google.android.gms.appdatasearch.a.j
            r10.<init>(r9, r8)
            com.google.android.gms.common.api.internal.m r9 = r9.mo119159d(r10)
            com.google.android.apps.gsa.staticplugins.actions.a.f r10 = new com.google.android.apps.gsa.staticplugins.actions.a.f
            r10.<init>(r7)
            r9.mo117321f(r10)
            r14.f236110p = r8
            com.google.common.util.concurrent.SettableFuture r8 = new com.google.common.util.concurrent.SettableFuture
            r8.<init>()
            r7.f260110f = r8
        L_0x02d7:
            boolean r7 = r0.f145335r
            if (r7 == 0) goto L_0x02ed
            android.content.Context r14 = r13.f260144h
            androidx.m.a.d r14 = androidx.p128m.p129a.C2399d.m6419a(r14)
            boolean r14 = r14.mo5805d(r1)
            if (r14 == 0) goto L_0x02ea
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a
            goto L_0x02ec
        L_0x02ea:
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
        L_0x02ec:
            return r14
        L_0x02ed:
            boolean r7 = r0.f145334q
            if (r7 == 0) goto L_0x03e3
            com.google.android.apps.gsa.search.shared.i.a r7 = r13.f260153q
            boolean r7 = r7.mo81703a()
            if (r7 == 0) goto L_0x03e3
            java.lang.String r15 = r1.getAction()
            java.lang.String r0 = "android.media.action.STILL_IMAGE_CAMERA"
            boolean r15 = android.text.TextUtils.equals(r15, r0)
            if (r15 == 0) goto L_0x03d0
            com.google.common.f.e r15 = f260129e
            com.google.common.f.x r15 = r15.mo56224b()
            java.lang.String r0 = "#maybeTrackCameraActions"
            r2 = 13509(0x34c5, float:1.893E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r2)).mo56386p(r0)
            int r15 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r15 > r0) goto L_0x03d0
            com.google.assistant.ab.cc r15 = com.google.assistant.p3745ab.C48275cc.f124856g
            com.google.protobuf.bn r15 = r15.createBuilder()
            r8 = r15
            com.google.assistant.ab.cb r8 = (com.google.assistant.p3745ab.C48274cb) r8
            java.util.Calendar r15 = java.util.Calendar.getInstance()
            java.util.Date r15 = r15.getTime()
            long r2 = r15.getTime()
            r8.copyOnWrite()
            com.google.protobuf.bv r15 = r8.instance
            com.google.assistant.ab.cc r15 = (com.google.assistant.p3745ab.C48275cc) r15
            int r0 = r15.f124858a
            r0 = r0 | 4
            r15.f124858a = r0
            r15.f124861d = r2
            com.google.android.apps.gsa.shared.logger.b.ae r15 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CAMERA_START
            com.google.protobuf.bv r0 = r8.build()
            com.google.assistant.ab.cc r0 = (com.google.assistant.p3745ab.C48275cc) r0
            r13.mo87614e(r15, r14, r0)
            android.os.Bundle r15 = r1.getExtras()
            r2 = 10000(0x2710, double:4.9407E-320)
            if (r15 == 0) goto L_0x0360
            java.lang.String r15 = "com.google.assistant.extra.CAMERA_OPEN_ONLY"
            boolean r15 = r1.getBooleanExtra(r15, r5)
            java.lang.String r0 = "com.google.assistant.extra.TIME_DURATION_SECONDS"
            int r0 = r1.getIntExtra(r0, r5)
            int r0 = r0 * 1000
            long r6 = (long) r0
            long r2 = r2 + r6
            goto L_0x0361
        L_0x0360:
            r15 = 0
        L_0x0361:
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.assistant.ab.cc r0 = (com.google.assistant.p3745ab.C48275cc) r0
            int r6 = r0.f124858a
            r6 = r6 | 8
            r0.f124858a = r6
            r0.f124862e = r15
            if (r15 == 0) goto L_0x037e
            com.google.android.apps.gsa.shared.logger.b.ae r15 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CAMERA_DONE
            com.google.protobuf.bv r0 = r8.build()
            com.google.assistant.ab.cc r0 = (com.google.assistant.p3745ab.C48275cc) r0
            r13.mo87614e(r15, r14, r0)
            goto L_0x03d0
        L_0x037e:
            java.lang.String r15 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x03ad
            java.lang.String r0 = "mounted_ro"
            boolean r15 = r0.equals(r15)
            if (r15 == 0) goto L_0x0393
            goto L_0x03ad
        L_0x0393:
            r8.copyOnWrite()
            com.google.protobuf.bv r15 = r8.instance
            com.google.assistant.ab.cc r15 = (com.google.assistant.p3745ab.C48275cc) r15
            int r0 = r15.f124858a
            r0 = r0 | r4
            r15.f124858a = r0
            r15.f124859b = r5
            com.google.android.apps.gsa.shared.logger.b.ae r15 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CAMERA_DONE
            com.google.protobuf.bv r0 = r8.build()
            com.google.assistant.ab.cc r0 = (com.google.assistant.p3745ab.C48275cc) r0
            r13.mo87614e(r15, r14, r0)
            goto L_0x03d0
        L_0x03ad:
            r8.copyOnWrite()
            com.google.protobuf.bv r15 = r8.instance
            com.google.assistant.ab.cc r15 = (com.google.assistant.p3745ab.C48275cc) r15
            int r0 = r15.f124858a
            r0 = r0 | r4
            r15.f124858a = r0
            r15.f124859b = r4
            java.lang.String r15 = f260128a
            long r9 = m153397c(r15)
            com.google.android.libraries.gsa.k.g r15 = r13.f260158v
            com.google.android.apps.gsa.staticplugins.actions.a.p r0 = new com.google.android.apps.gsa.staticplugins.actions.a.p
            r6 = r0
            r7 = r13
            r11 = r14
            r6.<init>(r7, r8, r9, r11)
            java.lang.String r14 = "Timeout runnable to query taken photo timestamp."
            r15.mo28213m(r14, r2, r0)
        L_0x03d0:
            com.google.android.apps.gsa.search.shared.i.a r14 = r13.f260153q
            boolean r15 = r14.mo81703a()
            if (r15 != 0) goto L_0x03db
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            goto L_0x03e2
        L_0x03db:
            com.google.android.apps.gsa.search.shared.i.b r14 = r14.f236594a
            r14.mo81707e(r1, r5)
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a
        L_0x03e2:
            return r14
        L_0x03e3:
            boolean r7 = r0.f145332o
            if (r7 == 0) goto L_0x0434
            android.net.Uri r14 = r1.getData()
            if (r14 == 0) goto L_0x040a
            android.net.Uri r14 = r1.getData()
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "dynserv://velour/wernicke_player"
            boolean r14 = r14.startsWith(r0)
            if (r14 != 0) goto L_0x03fe
            goto L_0x040a
        L_0x03fe:
            com.google.android.apps.gsa.search.core.al.by.a.g r14 = r13.f260139I
            android.content.Intent r15 = com.google.android.libraries.p1646ay.C19601c.m37395b(r1)
            r14.mo78666c(r15)
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a
            return r14
        L_0x040a:
            android.content.Context r14 = r13.f260144h
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r14 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142017e(r14, r1, r15)
            boolean r14 = r14.mo81435e()
            if (r14 == 0) goto L_0x0426
            com.google.common.f.e r14 = f260129e
            com.google.common.f.x r14 = r14.mo56226d()
            java.lang.String r15 = "Trying to execute action with service intent that cannot be resolved."
            r0 = 13508(0x34c4, float:1.8929E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            return r14
        L_0x0426:
            android.content.Context r14 = r13.f260144h
            android.content.ComponentName r14 = com.google.android.apps.gsa.shared.util.C91070p.m148777b(r14, r1)
            if (r14 == 0) goto L_0x0431
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a
            return r14
        L_0x0431:
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            return r14
        L_0x0434:
            android.content.Context r15 = r13.f260144h
            android.content.Intent[] r7 = new android.content.Intent[r4]
            r7[r5] = r1
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r15 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142015c(r15, r7)
            boolean r15 = r15.mo81435e()
            if (r15 == 0) goto L_0x0471
            dagger.a r15 = r13.f260156t
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r15 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r15
            com.google.android.apps.gsa.search.shared.d.d r15 = r15.mo81644f()
            com.google.knowledge.b.ai r15 = r15.f236467f
            if (r15 == 0) goto L_0x0461
            java.lang.String r15 = r1.getDataString()
            java.lang.String r7 = "maps.google.com"
            boolean r15 = r15.contains(r7)
            if (r15 == 0) goto L_0x0461
            goto L_0x0471
        L_0x0461:
            com.google.common.f.e r14 = f260129e
            com.google.common.f.x r14 = r14.mo56226d()
            java.lang.String r15 = "Trying to execute action with intent that cannot be resolved."
            r0 = 13507(0x34c3, float:1.8927E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            return r14
        L_0x0471:
            boolean r15 = r0.f145331n
            if (r15 == 0) goto L_0x0485
            com.google.android.apps.gsa.shared.util.t.g r14 = r13.f260140b
            com.google.android.apps.gsa.shared.util.t.f r15 = r13.f260150n
            boolean r14 = r14.mo65090b(r1, r15)
            if (r14 == 0) goto L_0x0482
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a
            goto L_0x0484
        L_0x0482:
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
        L_0x0484:
            return r14
        L_0x0485:
            java.lang.String r15 = r1.getPackage()
            boolean r7 = android.text.TextUtils.isEmpty(r15)
            if (r7 != 0) goto L_0x04b4
            android.content.ClipData r7 = r1.getClipData()
            if (r7 == 0) goto L_0x04b4
            int r8 = r7.getItemCount()
            r9 = 0
        L_0x049a:
            if (r9 >= r8) goto L_0x04b4
            android.content.ClipData$Item r10 = r7.getItemAt(r9)
            if (r10 == 0) goto L_0x04b1
            android.net.Uri r11 = r10.getUri()
            if (r11 == 0) goto L_0x04b1
            android.content.Context r11 = r13.f260144h
            android.net.Uri r10 = r10.getUri()
            r11.grantUriPermission(r15, r10, r4)
        L_0x04b1:
            int r9 = r9 + 1
            goto L_0x049a
        L_0x04b4:
            boolean r15 = r0.f145338u
            if (r15 != 0) goto L_0x04d6
            com.google.android.apps.gsa.staticplugins.actions.s r15 = r13.f260137G
            dagger.a r15 = r15.f260599a
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.search.core.service.af r15 = (com.google.android.apps.gsa.search.core.service.C86610af) r15
            com.google.android.apps.gsa.search.core.service.r r15 = r15.f233977l
            if (r15 == 0) goto L_0x04d6
            com.google.android.apps.gsa.search.shared.service.al r7 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.DO_NOT_COMMIT_TO_TOUCH_ON_PAUSE
            r7.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r8)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r7 = r7.mo81964a()
            com.google.android.apps.gsa.search.core.service.n r15 = r15.f234383e
            r15.mo80379b(r7)
        L_0x04d6:
            com.google.bb.a.x r15 = r14.f236107m
            com.google.bb.a.x r7 = com.google.p4152bb.p4153a.C55421x.SHOW_LIST
            java.lang.String r8 = "android.intent.action.VIEW"
            if (r15 != r7) goto L_0x04f3
            java.lang.String r15 = r0.f145319b
            boolean r15 = android.text.TextUtils.equals(r15, r8)
            if (r15 == 0) goto L_0x04f3
            dagger.a r15 = r13.f260131A
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.proactive.b.c r15 = (com.google.android.apps.gsa.proactive.p6475b.C84160c) r15
            com.google.ai.b.eo r0 = com.google.p375ai.p378b.C7642eo.SHOPPING_LIST_ITEM_ADDED
            r15.mo77604e(r0)
        L_0x04f3:
            com.google.android.apps.gsa.search.core.i.t r15 = r13.f260162z
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247707mI
            boolean r15 = r15.mo79746e(r0)
            if (r15 == 0) goto L_0x0526
            java.lang.String r15 = r1.getAction()
            java.lang.String r0 = "android.intent.action.CALL"
            boolean r15 = android.text.TextUtils.equals(r15, r0)
            if (r15 == 0) goto L_0x0526
            com.google.common.f.e r15 = f260129e
            com.google.common.f.x r15 = r15.mo56224b()
            java.lang.String r0 = "#maybeTrackPhoneCallUsageTime"
            r7 = 13506(0x34c2, float:1.8926E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r7)).mo56386p(r0)
            com.google.android.libraries.gsa.conversation.clientop.communication.a.b r15 = r13.f260155s
            android.content.Context r0 = r13.f260144h
            java.lang.String r0 = android.telephony.PhoneNumberUtils.getNumberFromIntent(r1, r0)
            com.google.android.apps.gsa.staticplugins.actions.a.m r7 = new com.google.android.apps.gsa.staticplugins.actions.a.m
            r7.<init>(r13, r14)
            r15.mo27603c(r0, r7)
        L_0x0526:
            com.google.common.base.ax r15 = r13.f260136F
            boolean r15 = r15.mo56113h()
            if (r15 == 0) goto L_0x0547
            com.google.common.base.ax r15 = r13.f260136F
            java.lang.Object r15 = r15.mo56107c()
            dagger.a r15 = (dagger.C68214a) r15
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.assistant.shared.az r15 = (com.google.android.apps.gsa.assistant.shared.az) r15
            boolean r15 = r15.l()
            if (r15 == 0) goto L_0x0547
            r15 = 262144(0x40000, float:3.67342E-40)
            r1.addFlags(r15)
        L_0x0547:
            com.google.android.libraries.gsa.k.g r15 = r13.f260159w
            com.google.android.apps.gsa.staticplugins.actions.a.l r0 = new com.google.android.apps.gsa.staticplugins.actions.a.l
            r0.<init>(r13, r1)
            java.lang.String r7 = "Start execution activity"
            com.google.common.util.concurrent.cx r15 = r15.mo28201a(r7, r0)
            java.lang.Object r15 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r15)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            boolean r15 = r15.booleanValue()     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            if (r15 == 0) goto L_0x061b
            java.lang.String r15 = r1.getAction()     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            java.lang.String r0 = r1.getPackage()     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            java.lang.String r1 = "android.media.action.MEDIA_PLAY_FROM_SEARCH"
            boolean r1 = r1.equals(r15)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            boolean r15 = r8.equals(r15)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            if (r15 == 0) goto L_0x0581
            com.google.common.b.gu r15 = f260130f     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            boolean r15 = r15.contains(r0)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            r1 = r1 | r15
            java.lang.String r15 = "com.google.android.apps.maps"
            boolean r5 = r15.equals(r0)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
        L_0x0581:
            if (r1 != 0) goto L_0x0585
            if (r5 == 0) goto L_0x059e
        L_0x0585:
            android.content.Intent r15 = new android.content.Intent     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            java.lang.String r0 = "com.google.android.apps.gsa.handsfree.ACTION_SWITCH_TO_A2DP"
            r15.<init>(r0)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            java.lang.String r0 = "com.google.android.apps.gsa.handsfree.EXTRA_A2DP_TRIGGER"
            if (r4 == r1) goto L_0x0591
            goto L_0x0592
        L_0x0591:
            r3 = 1
        L_0x0592:
            r15.putExtra(r0, r3)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            android.content.Context r0 = r13.f260144h     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            androidx.m.a.d r0 = androidx.p128m.p129a.C2399d.m6419a(r0)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            r0.mo5805d(r15)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
        L_0x059e:
            if (r2 == 0) goto L_0x0618
            com.google.common.base.ax r15 = r13.f260160x     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            boolean r15 = r15.mo56113h()     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            if (r15 == 0) goto L_0x0615
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r15 = r14.f235986b     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r15 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r15     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            if (r15 == 0) goto L_0x05c2
            com.google.android.apps.gsa.search.shared.actions.util.i r15 = r15.f236270h     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            boolean r15 = r15.mo81484i()     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            if (r15 == 0) goto L_0x05c2
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r14 = r14.f235986b     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r14 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r14     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.bb.a.pn r14 = r14.mo81433d()     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            java.lang.String r6 = com.google.android.apps.gsa.search.shared.actions.util.C87494p.m142026c(r14)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
        L_0x05c2:
            boolean r14 = android.text.TextUtils.isEmpty(r6)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            if (r14 != 0) goto L_0x0615
            java.lang.String r14 = "com.google.android.keep"
            boolean r14 = r6.equals(r14)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            if (r14 == 0) goto L_0x0615
            com.google.common.base.ax r14 = r13.f260160x     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            java.lang.Object r14 = r14.mo56107c()     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.staticplugins.actions.a.h r14 = (com.google.android.apps.gsa.staticplugins.actions.p7353a.C93276h) r14     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.search.core.i.t r15 = r14.f260109e     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.shared.m.f r0 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250787a     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            long r0 = r15.mo79743a(r0)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            int r15 = (int) r0     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.staticplugins.actions.a.aq r0 = new com.google.android.apps.gsa.staticplugins.actions.a.aq     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.staticplugins.actions.a.e r1 = new com.google.android.apps.gsa.staticplugins.actions.a.e     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            r1.<init>(r14)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            r0.<init>(r15, r2, r1)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            r14.f260112h = r0     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.staticplugins.actions.a.aq r15 = r14.f260112h     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            r15.mo87598a()     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            r15.mo87599b()     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.common.util.concurrent.SettableFuture r14 = r14.f260110f     // Catch:{ InterruptedException -> 0x0604, ExecutionException -> 0x0602 }
            java.lang.Object r14 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r14)     // Catch:{ InterruptedException -> 0x0604, ExecutionException -> 0x0602 }
            com.google.android.apps.gsa.search.shared.actions.i r14 = (com.google.android.apps.gsa.search.shared.actions.C87421i) r14     // Catch:{ InterruptedException -> 0x0604, ExecutionException -> 0x0602 }
            goto L_0x0614
        L_0x0602:
            r14 = move-exception
            goto L_0x0605
        L_0x0604:
            r14 = move-exception
        L_0x0605:
            com.google.common.f.e r15 = com.google.android.apps.gsa.staticplugins.actions.p7353a.C93276h.f260105a     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.common.f.x r15 = r15.mo56225c()     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            java.lang.String r0 = "Can't get action completion state."
            r1 = 13492(0x34b4, float:1.8906E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56382g(r14)).mo56372aa(r1)).mo56386p(r0)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
        L_0x0614:
            return r14
        L_0x0615:
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236080b     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            return r14
        L_0x0618:
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            return r14
        L_0x061b:
            com.google.android.apps.gsa.staticplugins.actions.s r14 = r13.f260137G     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            dagger.a r14 = r14.f260599a     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            java.lang.Object r14 = r14.mo27525b()     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.search.core.service.af r14 = (com.google.android.apps.gsa.search.core.service.C86610af) r14     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.search.core.service.r r14 = r14.f233977l     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            if (r14 == 0) goto L_0x0639
            com.google.android.apps.gsa.search.shared.service.al r15 = new com.google.android.apps.gsa.search.shared.service.al     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.COMMIT_TO_TOUCH_ON_PAUSE     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            r15.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r0)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r15 = r15.mo81964a()     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            com.google.android.apps.gsa.search.core.service.n r14 = r14.f234383e     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            r14.mo80379b(r15)     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
        L_0x0639:
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c     // Catch:{ InterruptedException -> 0x063e, ExecutionException -> 0x063c }
            return r14
        L_0x063c:
            r14 = move-exception
            goto L_0x063f
        L_0x063e:
            r14 = move-exception
        L_0x063f:
            com.google.common.f.e r15 = f260129e
            com.google.common.f.x r15 = r15.mo56225c()
            java.lang.String r0 = "Failed to start activity in UI thread."
            r1 = 13505(0x34c1, float:1.8925E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56382g(r14)).mo56372aa(r1)).mo56386p(r0)
            com.google.android.apps.gsa.search.shared.actions.i r14 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7353a.C93286r.m153399g(com.google.android.apps.gsa.search.shared.actions.modular.ModularAction, com.google.bb.a.la):com.google.android.apps.gsa.search.shared.actions.i");
    }

    /* renamed from: h */
    private final boolean m153400h(ModularAction modularAction, C55240la laVar) {
        Object obj;
        C62940bt r3 = C62942bv.checkIsLite(C55237ky.f145439d);
        laVar.mo58887l(r3);
        Object l = laVar.f169962ag.mo58854l(r3.f169971d);
        if (l == null) {
            obj = r3.f169969b;
        } else {
            obj = r3.mo58889c(l);
        }
        C55237ky kyVar = (C55237ky) obj;
        boolean z = false;
        if (!(kyVar == null || (kyVar.f145441a & 1) == 0)) {
            Argument R = modularAction.mo81211R(kyVar.f145442b);
            if ((R instanceof DeviceSettingsArgument) && R.mo81263C()) {
                DeviceSettingsArgument deviceSettingsArgument = (DeviceSettingsArgument) R;
                boolean z2 = deviceSettingsArgument.f236155i;
                int i = deviceSettingsArgument.f236162p;
                int i2 = deviceSettingsArgument.f236161o - 1;
                if (i2 == 1) {
                    WifiManager wifiManager = (WifiManager) this.f260144h.getSystemService("wifi");
                    boolean isWifiEnabled = wifiManager.isWifiEnabled();
                    if (z2 && !isWifiEnabled) {
                        wifiManager.setWifiEnabled(true);
                    } else if (!z2 && isWifiEnabled) {
                        wifiManager.setWifiEnabled(false);
                    }
                    return true;
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        C87484f f = C93387a.m153629f(this.f260144h);
                        C55175iq iqVar = deviceSettingsArgument.f236160n;
                        if (iqVar != null) {
                            z = iqVar.f145253a;
                        }
                        ((C93387a) f).f260468c = z;
                        return f.mo81474e(z2);
                    } else if (i2 == 5) {
                        try {
                            float f2 = (float) Settings.System.getInt(this.f260144h.getContentResolver(), "screen_brightness");
                            int i3 = i - 1;
                            if (i != 0) {
                                switch (i3) {
                                    case 1:
                                        f2 = 0.0f;
                                        break;
                                    case 2:
                                        f2 = 255.0f;
                                        break;
                                    case 3:
                                    case 4:
                                        f2 = m153398f(deviceSettingsArgument, f2, 255.0f);
                                        break;
                                    case 5:
                                        f2 = ((float) (deviceSettingsArgument.f236157k * PrivateKeyType.INVALID)) / 100.0f;
                                        break;
                                    case 6:
                                        f2 = (float) deviceSettingsArgument.f236159m;
                                        break;
                                }
                                float min = Math.min(255.0f, Math.max(0.0f, f2));
                                Settings.System.putInt(this.f260144h.getContentResolver(), "screen_brightness_mode", 0);
                                Settings.System.putInt(this.f260144h.getContentResolver(), "screen_brightness", (int) min);
                                return true;
                            }
                            throw null;
                        } catch (Settings.SettingNotFoundException unused) {
                            return false;
                        }
                    } else if (i2 != 6) {
                        return false;
                    } else {
                        int a = deviceSettingsArgument.mo81296a();
                        try {
                            float streamVolume = (float) this.f260138H.f260022a.getStreamVolume(a);
                            int streamMaxVolume = this.f260138H.f260022a.getStreamMaxVolume(a);
                            int i4 = i - 1;
                            if (i != 0) {
                                switch (i4) {
                                    case 1:
                                        streamVolume = 0.0f;
                                        break;
                                    case 2:
                                        streamVolume = (float) streamMaxVolume;
                                        break;
                                    case 3:
                                    case 4:
                                        streamVolume = m153398f(deviceSettingsArgument, streamVolume, (float) streamMaxVolume);
                                        break;
                                    case 5:
                                        streamVolume = ((float) (deviceSettingsArgument.f236157k * streamMaxVolume)) / 100.0f;
                                        break;
                                    case 6:
                                        streamVolume = (float) deviceSettingsArgument.f236159m;
                                        break;
                                }
                                float min2 = Math.min((float) streamMaxVolume, Math.max(0.0f, streamVolume));
                                try {
                                    this.f260138H.mo87582a(a, (int) min2);
                                    return true;
                                } catch (SecurityException e) {
                                    ((C59052c) ((C59052c) ((C59052c) f260129e.mo56225c()).mo56382g(e)).mo56372aa(13521)).mo56392v("Error setting stream volume, stream=%d, newValue=%f", a, min2);
                                    return false;
                                } catch (InterruptedException e2) {
                                    ((C59052c) ((C59052c) ((C59052c) f260129e.mo56225c()).mo56382g(e2)).mo56372aa(13522)).mo56386p("Interrupted while waiting for StreamVolumeManager");
                                    Thread.currentThread().interrupt();
                                    return false;
                                } catch (TimeoutException e3) {
                                    ((C59052c) ((C59052c) ((C59052c) f260129e.mo56225c()).mo56382g(e3)).mo56372aa(13523)).mo56386p("Timed out while waiting for StreamVolumeManager");
                                    return false;
                                }
                            } else {
                                throw null;
                            }
                        } catch (InterruptedException e4) {
                            ((C59052c) ((C59052c) ((C59052c) f260129e.mo56225c()).mo56382g(e4)).mo56372aa(13524)).mo56386p("Interrupted while waiting for StreamVolumeManager");
                            Thread.currentThread().interrupt();
                            return false;
                        } catch (TimeoutException e5) {
                            ((C59052c) ((C59052c) ((C59052c) f260129e.mo56225c()).mo56382g(e5)).mo56372aa(13525)).mo56386p("Timed out while waiting for StreamVolumeManager");
                            return false;
                        }
                    }
                } else if (!C91076c.m148792a(this.f260144h)) {
                    return false;
                } else {
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    boolean isEnabled = defaultAdapter.isEnabled();
                    if (z2 && !isEnabled) {
                        return defaultAdapter.enable();
                    }
                    if (z2 || !isEnabled) {
                        return true;
                    }
                    return defaultAdapter.disable();
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0786, code lost:
        if (r5.mo86249g(r3.f145465b) != false) goto L_0x07b5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x05e9  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x068b  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x069a  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0733  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0735  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0738  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0793  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x08f7  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x08ff  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x090c  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x09c1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.apps.gsa.search.shared.actions.C87421i mo87580a(com.google.android.apps.gsa.search.shared.actions.VoiceAction r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            r2 = r19
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r2 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r2
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 == r5) goto L_0x004c
            if (r0 == r3) goto L_0x0045
            switch(r0) {
                case 101: goto L_0x004c;
                case 102: goto L_0x003e;
                case 103: goto L_0x0037;
                case 104: goto L_0x0030;
                case 105: goto L_0x0029;
                case 106: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            r0 = r6
            goto L_0x0052
        L_0x0015:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r0 = r2.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r0
            com.google.bb.a.ln r0 = r0.mo81239b()
            if (r0 != 0) goto L_0x0020
            goto L_0x0013
        L_0x0020:
            com.google.protobuf.cq r0 = r0.f145510b
            java.lang.Object r0 = r0.get(r4)
            com.google.bb.a.la r0 = (com.google.p4152bb.p4153a.C55240la) r0
            goto L_0x0052
        L_0x0029:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r0 = r2.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r0
            com.google.bb.a.la r0 = r0.f236120f
            goto L_0x0052
        L_0x0030:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r0 = r2.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r0
            com.google.bb.a.la r0 = r0.f236117c
            goto L_0x0052
        L_0x0037:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r0 = r2.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r0
            com.google.bb.a.la r0 = r0.f236119e
            goto L_0x0052
        L_0x003e:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r0 = r2.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r0
            com.google.bb.a.la r0 = r0.f236118d
            goto L_0x0052
        L_0x0045:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r0 = r2.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r0
            com.google.bb.a.la r0 = r0.f236116b
            goto L_0x0052
        L_0x004c:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r0 = r2.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r0
            com.google.bb.a.la r0 = r0.f236115a
        L_0x0052:
            if (r0 != 0) goto L_0x0058
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            goto L_0x0a08
        L_0x0058:
            com.google.android.apps.gsa.search.shared.actions.util.i r7 = r2.f236103i
            java.util.List r7 = r7.f236312a
            int r7 = r7.size()
            if (r7 <= r5) goto L_0x006b
            com.google.bb.a.nl r7 = r2.f236104j
            com.google.bb.a.jy r7 = r7.f145706p
            if (r7 != 0) goto L_0x0075
            com.google.bb.a.jy r7 = com.google.p4152bb.p4153a.C55210jy.f145342e
            goto L_0x0075
        L_0x006b:
            com.google.bb.a.nl r7 = r2.mo81219Z()
            com.google.bb.a.jy r7 = r7.f145706p
            if (r7 != 0) goto L_0x0075
            com.google.bb.a.jy r7 = com.google.p4152bb.p4153a.C55210jy.f145342e
        L_0x0075:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r8 = r2.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r8 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r8
            if (r7 == 0) goto L_0x00a9
            int r9 = r7.f145344a
            r9 = r9 & r5
            if (r9 == 0) goto L_0x00a9
            com.google.android.apps.gsa.search.shared.actions.util.i r9 = r8.f236270h
            boolean r9 = r9.mo81484i()
            if (r9 == 0) goto L_0x00a9
            boolean r9 = r8.mo81437g()
            if (r9 != 0) goto L_0x00a9
            com.google.android.apps.gsa.staticplugins.actions.d.n r9 = r1.f260149m
            java.lang.String r7 = r7.f145345b
            com.google.bb.a.pn r8 = r8.mo81433d()
            java.lang.String r8 = com.google.android.apps.gsa.search.shared.actions.util.C87494p.m142026c(r8)
            if (r7 == 0) goto L_0x00a9
            android.content.SharedPreferences r9 = r9.f260286a
            android.content.SharedPreferences$Editor r9 = r9.edit()
            android.content.SharedPreferences$Editor r7 = r9.putString(r7, r8)
            r7.apply()
        L_0x00a9:
            com.google.protobuf.bt r7 = com.google.p4152bb.p4153a.C55208jw.f145316z
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r0.mo58887l(r7)
            com.google.protobuf.bf r8 = r0.f169962ag
            com.google.protobuf.bs r7 = r7.f169971d
            boolean r7 = r8.mo58857o(r7)
            if (r7 == 0) goto L_0x00c2
            com.google.android.apps.gsa.search.shared.actions.i r0 = r1.m153399g(r2, r0)
            goto L_0x0a08
        L_0x00c2:
            com.google.protobuf.bt r7 = com.google.p4152bb.p4153a.C55237ky.f145439d
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r0.mo58887l(r7)
            com.google.protobuf.bf r8 = r0.f169962ag
            com.google.protobuf.bs r7 = r7.f169971d
            boolean r7 = r8.mo58857o(r7)
            if (r7 == 0) goto L_0x00e3
            boolean r0 = r1.m153400h(r2, r0)
            if (r0 == 0) goto L_0x00df
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a
            goto L_0x0a08
        L_0x00df:
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            goto L_0x0a08
        L_0x00e3:
            com.google.protobuf.bt r7 = com.google.p4152bb.p4153a.C55255lp.f145515d
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r0.mo58887l(r7)
            com.google.protobuf.bf r8 = r0.f169962ag
            com.google.protobuf.bs r7 = r7.f169971d
            boolean r7 = r8.mo58857o(r7)
            if (r7 == 0) goto L_0x0359
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55255lp.f145515d
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r0.mo58887l(r3)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r7 = r3.f169971d
            java.lang.Object r0 = r0.mo58854l(r7)
            if (r0 != 0) goto L_0x010c
            java.lang.Object r0 = r3.f169969b
            goto L_0x0110
        L_0x010c:
            java.lang.Object r0 = r3.mo58889c(r0)
        L_0x0110:
            r3 = r0
            com.google.bb.a.lp r3 = (com.google.p4152bb.p4153a.C55255lp) r3
            if (r3 != 0) goto L_0x0119
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            goto L_0x0a08
        L_0x0119:
            com.google.bb.a.ad r0 = com.google.p4152bb.p4153a.C54946ad.f144531h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.bb.a.ac r0 = (com.google.p4152bb.p4153a.C54945ac) r0
            com.google.protobuf.bt r7 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.common.base.cr r8 = r1.f260148l
            java.lang.Object r8 = r8.mo6453a()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            com.google.bb.a.lz r2 = r2.mo81218Y(r8, r4)
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.bb.a.ly r2 = (com.google.p4152bb.p4153a.C55264ly) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.bb.a.lz r8 = (com.google.p4152bb.p4153a.C55265lz) r8
            com.google.protobuf.cq r9 = com.google.p4152bb.p4153a.C55265lz.emptyProtobufList()
            r8.f145560c = r9
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.bb.a.lz r8 = (com.google.p4152bb.p4153a.C55265lz) r8
            r8.f145564g = r6
            int r9 = r8.f145558a
            r9 = r9 & -9
            r8.f145558a = r9
            com.google.protobuf.bv r2 = r2.build()
            com.google.bb.a.lz r2 = (com.google.p4152bb.p4153a.C55265lz) r2
            r0.mo58885m(r7, r2)
            dagger.a r2 = r1.f260156t
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r2 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r2
            com.google.bb.a.ad r2 = r2.mo81649k()
            if (r2 == 0) goto L_0x0184
            com.google.bb.a.af r2 = r2.f144536d
            if (r2 != 0) goto L_0x0172
            com.google.bb.a.af r2 = com.google.p4152bb.p4153a.C54948af.f144541h
        L_0x0172:
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.bb.a.ad r7 = (com.google.p4152bb.p4153a.C54946ad) r7
            r2.getClass()
            r7.f144536d = r2
            int r2 = r7.f144533a
            r2 = r2 | 16
            r7.f144533a = r2
        L_0x0184:
            com.google.android.apps.gsa.z.b.a.a r2 = r1.f260147k
            com.google.protobuf.bv r0 = r0.build()
            com.google.bb.a.ad r0 = (com.google.p4152bb.p4153a.C54946ad) r0
            java.lang.String r7 = r3.f145517a
            com.google.bb.a.af r8 = r0.f144536d
            if (r8 != 0) goto L_0x0194
            com.google.bb.a.af r8 = com.google.p4152bb.p4153a.C54948af.f144541h
        L_0x0194:
            int r8 = r8.f144544b
            com.google.bb.a.x r8 = com.google.p4152bb.p4153a.C55421x.m87686a(r8)
            if (r8 != 0) goto L_0x019e
            com.google.bb.a.x r8 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
        L_0x019e:
            com.google.bb.a.x r9 = com.google.p4152bb.p4153a.C55421x.ADD_REMINDER
            if (r8 != r9) goto L_0x01a9
            r8 = 1703936(0x1a0000, float:2.387723E-39)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x01aa
        L_0x01a9:
            r8 = r6
        L_0x01aa:
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 == 0) goto L_0x01c0
            com.google.common.f.e r0 = com.google.android.apps.gsa.p8889z.p8891b.p8892a.C118850a.f331498a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "#executeActionSync: no confirmation URL"
            r3 = 34183(0x8587, float:4.79E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0355
        L_0x01c0:
            com.google.android.apps.gsa.search.core.google.cw r9 = r2.f331499b
            android.net.Uri r10 = r9.mo79563b(r5)
            com.google.android.apps.gsa.search.core.google.f.c r9 = r9.mo79568h(r10)
            dagger.a r10 = r2.f331502e
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.search.core.google.di r10 = (com.google.android.apps.gsa.search.core.google.C85963di) r10
            r10.mo79491a(r9)
            com.google.android.apps.gsa.search.core.google.cw r10 = r2.f331499b
            com.google.android.apps.gsa.search.core.google.dk r9 = r10.mo79566f(r9)
            com.google.android.apps.gsa.search.shared.api.UriRequest r9 = r9.mo79626b(r6)
            java.util.HashMap r10 = com.google.common.p4522b.C58662ni.m90351j(r5)
            byte[] r0 = r0.toByteArray()
            r11 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r11)
            java.lang.String r11 = "pinfo"
            r10.put(r11, r0)
            android.net.Uri r0 = r9.f236331a
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String[] r12 = new java.lang.String[r5]
            r12[r4] = r11
            java.util.HashSet r11 = com.google.common.p4522b.C58758qx.m90649g(r5)
            java.util.Collections.addAll(r11, r12)
            android.net.Uri r0 = com.google.android.apps.gsa.search.core.google.C85929cw.m138087c(r0, r7, r11, r10)
            java.lang.String r0 = r0.toString()
            com.google.android.apps.gsa.search.core.aj.a r7 = r2.f331501d
            com.google.common.b.hd r9 = r9.mo81502a()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>(r9)
            java.lang.String r9 = r7.mo78217a(r0, r10, r5)
            java.lang.String r11 = "HttpUtils"
            if (r9 == 0) goto L_0x0220
            goto L_0x02f3
        L_0x0220:
            if (r8 != 0) goto L_0x0225
            r9 = 29
            goto L_0x0227
        L_0x0225:
            r9 = 211(0xd3, float:2.96E-43)
        L_0x0227:
            if (r8 != 0) goto L_0x022d
            r8 = 917507(0xe0003, float:1.285701E-39)
            goto L_0x0231
        L_0x022d:
            int r8 = r8.intValue()
        L_0x0231:
            dagger.a r12 = r7.f230014d
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r12 = (com.google.android.apps.gsa.shared.logger.C89911f) r12
            com.google.android.apps.gsa.shared.q.a r13 = new com.google.android.apps.gsa.shared.q.a
            r13.<init>(r9, r8)
            com.google.android.apps.gsa.shared.logger.e r12 = r12.mo83756b(r13)
            r13 = 8738549(0x8556f5, float:1.2245315E-38)
            r12.f246282c = r13
            r12.mo83721a()
            android.net.Uri r12 = android.net.Uri.parse(r0)
            java.lang.String r13 = "client"
            java.lang.String r14 = r12.getQueryParameter(r13)
            if (r14 != 0) goto L_0x0268
            android.net.Uri$Builder r0 = r12.buildUpon()
            java.lang.String r12 = "mobile-legacy"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r13, r12)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
        L_0x0268:
            java.lang.String r12 = "User-Agent"
            java.lang.Object r10 = r10.get(r12)
            java.lang.String r10 = (java.lang.String) r10
            com.google.android.apps.gsa.search.core.google.gaia.o r13 = r7.f230013c
            java.lang.String r14 = "mobilepersonalfeeds"
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r5 = r13.mo79657D(r14, r5)
            if (r5 != 0) goto L_0x0290
            com.google.common.f.e r5 = com.google.android.apps.gsa.search.core.p6513aj.C84514a.f230011a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r11)
            java.lang.String r6 = "#getFallbackHeaders: Failed to get auth token"
            r10 = 9393(0x24b1, float:1.3162E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r10)).mo56386p(r6)
            r6 = 0
            goto L_0x02a9
        L_0x0290:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            boolean r13 = android.text.TextUtils.isEmpty(r10)
            if (r13 != 0) goto L_0x029e
            r6.put(r12, r10)
        L_0x029e:
            java.lang.String r10 = "GoogleLogin auth="
            java.lang.String r5 = r10.concat(r5)
            java.lang.String r10 = "Authorization"
            r6.put(r10, r5)
        L_0x02a9:
            if (r6 == 0) goto L_0x02f2
            java.lang.String r5 = r7.mo78217a(r0, r6, r4)
            if (r5 == 0) goto L_0x02b3
            r9 = r5
            goto L_0x02f3
        L_0x02b3:
            dagger.a r5 = r7.f230014d
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r5 = (com.google.android.apps.gsa.shared.logger.C89911f) r5
            com.google.android.apps.gsa.shared.q.a r6 = new com.google.android.apps.gsa.shared.q.a
            r6.<init>(r9, r8)
            com.google.android.apps.gsa.shared.logger.e r5 = r5.mo83756b(r6)
            r6 = 8789172(0x861cb4, float:1.2316253E-38)
            r5.f246282c = r6
            r5.mo83721a()
            java.util.regex.Pattern r5 = com.google.android.apps.gsa.search.core.p6513aj.C84514a.f230012b
            java.util.regex.Matcher r0 = r5.matcher(r0)
            boolean r5 = r0.find()
            if (r5 == 0) goto L_0x02dd
            java.lang.String r0 = r0.group()
            goto L_0x02de
        L_0x02dd:
            r0 = 0
        L_0x02de:
            if (r0 == 0) goto L_0x02f2
            com.google.common.f.e r5 = com.google.android.apps.gsa.search.core.p6513aj.C84514a.f230011a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r11)
            java.lang.String r6 = "HttpActionExecutor failed: %s"
            r7 = 9392(0x24b0, float:1.3161E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56389s(r6, r0)
        L_0x02f2:
            r9 = 0
        L_0x02f3:
            if (r9 != 0) goto L_0x0309
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.core.p6513aj.C84514a.f230011a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r5, r11)
            java.lang.String r5 = "No response."
            r6 = 9387(0x24ab, float:1.3154E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r5)
        L_0x0307:
            r0 = 0
            goto L_0x032c
        L_0x0309:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0312
            r4 = 1
        L_0x0310:
            r6 = 0
            goto L_0x0336
        L_0x0312:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0318 }
            r0.<init>(r9)     // Catch:{ JSONException -> 0x0318 }
            goto L_0x032c
        L_0x0318:
            r0 = move-exception
            com.google.common.f.e r5 = com.google.android.apps.gsa.search.core.p6513aj.C84514a.f230011a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r11)
            java.lang.String r6 = "Failed to parse response! %s"
            r7 = 9386(0x24aa, float:1.3153E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r7)).mo56389s(r6, r9)
            goto L_0x0307
        L_0x032c:
            if (r0 != 0) goto L_0x032f
            goto L_0x0310
        L_0x032f:
            java.lang.String r4 = "vInfo"
            java.lang.String r6 = r0.optString(r4)
            r4 = 1
        L_0x0336:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0347
            com.google.android.apps.gsa.sidekick.main.b.b r0 = r2.f331500c
            r0.mo85533d(r6)
            com.google.android.apps.gsa.sidekick.main.b.b r0 = r2.f331500c
            r2 = 1
            r0.mo85535f(r2, r6)
        L_0x0347:
            if (r4 == 0) goto L_0x0355
            boolean r0 = r3.f145518b
            if (r0 == 0) goto L_0x0351
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a
            goto L_0x0a08
        L_0x0351:
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236080b
            goto L_0x0a08
        L_0x0355:
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            goto L_0x0a08
        L_0x0359:
            com.google.protobuf.bt r5 = com.google.p4152bb.p4153a.C55206ju.f145304i
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r0.mo58887l(r5)
            com.google.protobuf.bf r6 = r0.f169962ag
            com.google.protobuf.bs r5 = r5.f169971d
            boolean r5 = r6.mo58857o(r5)
            if (r5 == 0) goto L_0x061d
            com.google.protobuf.bt r5 = com.google.p4152bb.p4153a.C55206ju.f145304i
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r0.mo58887l(r5)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r6 = r5.f169971d
            java.lang.Object r0 = r0.mo58854l(r6)
            if (r0 != 0) goto L_0x0382
            java.lang.Object r0 = r5.f169969b
            goto L_0x0386
        L_0x0382:
            java.lang.Object r0 = r5.mo58889c(r0)
        L_0x0386:
            com.google.bb.a.ju r0 = (com.google.p4152bb.p4153a.C55206ju) r0
            r0.getClass()
            int r5 = r0.f145306a
            r5 = r5 & 16
            if (r5 == 0) goto L_0x039c
            java.lang.String r5 = r0.f145311f
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x039c
            java.lang.String r5 = r0.f145311f
            goto L_0x03b0
        L_0x039c:
            boolean r5 = r0.f145312g
            if (r5 != 0) goto L_0x03af
            com.google.common.f.e r0 = f260129e
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "maybeExecuteAddCalendarEventExecutionInfo: No user account given, failed to save event."
            r3 = 13520(0x34d0, float:1.8946E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0619
        L_0x03af:
            r5 = 0
        L_0x03b0:
            int r6 = r0.f145306a
            r7 = 1
            r6 = r6 & r7
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x03cf
            int r6 = r0.f145307b
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r6 = r2.mo81211R(r6)
            boolean r8 = r6 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument
            if (r8 == 0) goto L_0x03cf
            boolean r8 = r6.mo81263C()
            if (r8 == 0) goto L_0x03cf
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument r6 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument) r6
            java.lang.Object r6 = r6.f236203n
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x03d0
        L_0x03cf:
            r6 = r7
        L_0x03d0:
            if (r6 != 0) goto L_0x03e1
            com.google.common.f.e r0 = f260129e
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "maybeExecuteAddCalendarEventExecutionInfo: No title given"
            r3 = 13519(0x34cf, float:1.8944E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0619
        L_0x03e1:
            int r8 = r0.f145306a
            r8 = r8 & 8
            if (r8 == 0) goto L_0x043e
            int r8 = r0.f145310e
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r8 = r2.mo81211R(r8)
            boolean r9 = r8 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument
            if (r9 == 0) goto L_0x043e
            boolean r9 = r8.mo81263C()
            if (r9 == 0) goto L_0x043e
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument r8 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument) r8
            java.lang.Object r9 = r8.f236203n
            com.google.android.apps.gsa.search.shared.contact.Disambiguation r9 = (com.google.android.apps.gsa.search.shared.contact.Disambiguation) r9
            if (r9 == 0) goto L_0x043e
            boolean r9 = r9.mo81543l()
            if (r9 == 0) goto L_0x043e
            com.google.bb.a.hc r9 = com.google.p4152bb.p4153a.C55134hc.f145119i
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.bb.a.gz r9 = (com.google.p4152bb.p4153a.C55130gz) r9
            com.google.bb.a.hb r10 = com.google.p4152bb.p4153a.C55133hb.LOCATION_TITLE
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.bb.a.hc r11 = (com.google.p4152bb.p4153a.C55134hc) r11
            int r10 = r10.f145118S
            r11.f145123c = r10
            int r10 = r11.f145121a
            r10 = r10 | r3
            r11.f145121a = r10
            com.google.protobuf.bv r9 = r9.build()
            com.google.bb.a.hc r9 = (com.google.p4152bb.p4153a.C55134hc) r9
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r10 = r1.f260146j
            android.content.Context r11 = r1.f260144h
            android.content.res.Resources r11 = r11.getResources()
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r8 = r8.mo81250c(r10, r9, r11)
            boolean r9 = r8.mo81247f()
            if (r9 == 0) goto L_0x043e
            java.lang.String r8 = r8.mo81245d()
            if (r8 == 0) goto L_0x043e
            r7 = r8
        L_0x043e:
            int r8 = r0.f145306a
            r3 = r3 & r8
            r8 = -1
            if (r3 == 0) goto L_0x0462
            int r3 = r0.f145308c
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r3 = r2.mo81211R(r3)
            boolean r10 = r3 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument
            if (r10 == 0) goto L_0x0462
            boolean r10 = r3.mo81263C()
            if (r10 == 0) goto L_0x0462
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument r3 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument) r3
            boolean r10 = r3.mo81343R()
            if (r10 == 0) goto L_0x0462
            long r10 = r3.mo81248a()
            goto L_0x0463
        L_0x0462:
            r10 = r8
        L_0x0463:
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0476
            com.google.common.f.e r0 = f260129e
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "maybeExecuteAddCalendarEventExecutionInfo: No start time given"
            r3 = 13518(0x34ce, float:1.8943E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0619
        L_0x0476:
            int r3 = r0.f145306a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x04ab
            int r3 = r0.f145309d
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r3 = r2.mo81211R(r3)
            boolean r12 = r3 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument
            if (r12 == 0) goto L_0x0493
            boolean r12 = r3.mo81263C()
            if (r12 == 0) goto L_0x0493
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument r3 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument) r3
            long r12 = r3.mo81248a()
            goto L_0x04ac
        L_0x0493:
            boolean r12 = r3 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument
            if (r12 == 0) goto L_0x04ab
            boolean r12 = r3.mo81263C()
            if (r12 == 0) goto L_0x04ab
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument r3 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument) r3
            java.lang.Object r3 = r3.f236203n
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L_0x04ab
            long r12 = r3.longValue()
            long r12 = r12 + r10
            goto L_0x04ac
        L_0x04ab:
            r12 = r8
        L_0x04ac:
            int r3 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x04bf
            com.google.common.f.e r0 = f260129e
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "maybeExecuteAddCalendarEventExecutionInfo: No end time given"
            r3 = 13517(0x34cd, float:1.8941E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0619
        L_0x04bf:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.google.android.apps.gsa.search.shared.common.util.EventReminder r14 = com.google.android.apps.gsa.search.shared.common.util.EventReminder.f236347a
            r3.add(r14)
            com.google.android.apps.gsa.staticplugins.actions.g.e r14 = r1.f260151o
            boolean r0 = r0.f145312g
            if (r5 == 0) goto L_0x04d4
            long r16 = r14.mo87654a(r5)
            goto L_0x04d6
        L_0x04d4:
            r16 = r8
        L_0x04d6:
            int r5 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0529
            if (r0 == 0) goto L_0x0527
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93391e.f260474a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r5 = "Failed to find calendarId from given owner, trying again with device account."
            r15 = 13674(0x356a, float:1.9161E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r15)).mo56386p(r5)
            com.google.android.apps.gsa.shared.i.b r0 = new com.google.android.apps.gsa.shared.i.b
            r0.<init>()
            com.google.android.apps.gsa.shared.b.a r5 = r14.f260476b
            r5.mo79664K(r0)
            java.lang.Object r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r0)     // Catch:{ InterruptedException -> 0x04fc, ExecutionException -> 0x04fa }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ InterruptedException -> 0x04fc, ExecutionException -> 0x04fa }
            goto L_0x050b
        L_0x04fa:
            r0 = move-exception
            goto L_0x04fd
        L_0x04fc:
            r0 = move-exception
        L_0x04fd:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93391e.f260474a
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r15 = "Can't get account."
            r4 = 13676(0x356c, float:1.9164E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r4)).mo56386p(r15)
            r0 = 0
        L_0x050b:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x0522
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93391e.f260474a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "Failed to get account from account helper."
            r4 = 13675(0x356b, float:1.9163E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x05e3
        L_0x0522:
            long r16 = r14.mo87654a(r0)
            goto L_0x0529
        L_0x0527:
            r16 = r8
        L_0x0529:
            int r0 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x05d4
            r4 = 0
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0535
            r0 = 1
            goto L_0x0536
        L_0x0535:
            r0 = 0
        L_0x0536:
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            com.google.common.base.C58838bb.m90868c(r0)
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0542
            r4 = 1
            goto L_0x0543
        L_0x0542:
            r4 = 0
        L_0x0543:
            com.google.common.base.C58838bb.m90868c(r4)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r4 = "calendar_id"
            java.lang.Long r5 = java.lang.Long.valueOf(r16)
            r0.put(r4, r5)
            java.lang.String r4 = "dtstart"
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r0.put(r4, r5)
            java.lang.String r4 = "dtend"
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            r0.put(r4, r5)
            java.lang.String r4 = "title"
            r0.put(r4, r6)
            if (r7 == 0) goto L_0x0572
            java.lang.String r4 = "eventLocation"
            r0.put(r4, r7)
        L_0x0572:
            java.util.TimeZone r4 = java.util.TimeZone.getDefault()
            java.lang.String r4 = r4.getID()
            java.lang.String r5 = "eventTimezone"
            r0.put(r5, r4)
            android.content.ContentResolver r4 = r14.f260477c
            android.net.Uri r5 = android.provider.CalendarContract.Events.CONTENT_URI
            android.net.Uri r0 = r4.insert(r5, r0)
            java.lang.String r0 = r0.getLastPathSegment()
            long r4 = java.lang.Long.parseLong(r0)
            java.util.Iterator r0 = r3.iterator()
        L_0x0593:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x05cb
            java.lang.Object r3 = r0.next()
            com.google.android.apps.gsa.search.shared.common.util.EventReminder r3 = (com.google.android.apps.gsa.search.shared.common.util.EventReminder) r3
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "event_id"
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            r6.put(r7, r8)
            int r7 = r3.f236348b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "minutes"
            r6.put(r8, r7)
            int r3 = r3.f236349c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r7 = "method"
            r6.put(r7, r3)
            android.content.ContentResolver r3 = r14.f260477c
            android.net.Uri r7 = android.provider.CalendarContract.Reminders.CONTENT_URI
            r3.insert(r7, r6)
            goto L_0x0593
        L_0x05cb:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x05e3
        L_0x05d4:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93391e.f260474a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "Failed to add event."
            r4 = 13673(0x3569, float:1.916E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x05e3:
            boolean r3 = r0.mo56113h()
            if (r3 == 0) goto L_0x0619
            com.google.bb.a.lc r3 = com.google.p4152bb.p4153a.C55242lc.f145462c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.bb.a.lb r3 = (com.google.p4152bb.p4153a.C55241lb) r3
            java.lang.Object r0 = r0.mo56107c()
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.String r0 = r0.toString()
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.bb.a.lc r4 = (com.google.p4152bb.p4153a.C55242lc) r4
            r0.getClass()
            int r5 = r4.f145464a
            r6 = 1
            r5 = r5 | r6
            r4.f145464a = r5
            r4.f145465b = r0
            com.google.protobuf.bv r0 = r3.build()
            com.google.bb.a.lc r0 = (com.google.p4152bb.p4153a.C55242lc) r0
            r2.f236109o = r0
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a
            goto L_0x0a08
        L_0x0619:
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            goto L_0x0a08
        L_0x061d:
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55278ml.f145594j
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r0.mo58887l(r4)
            com.google.protobuf.bf r5 = r0.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            if (r4 == 0) goto L_0x07bd
            dagger.a r4 = r1.f260161y
            java.lang.Object r4 = r4.mo27525b()
            r5 = r4
            com.google.android.apps.gsa.sidekick.shared.l.a r5 = (com.google.android.apps.gsa.sidekick.shared.p7243l.C91755a) r5
            if (r5 != 0) goto L_0x064a
            com.google.common.f.e r0 = f260129e
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "GmsRemindersHelper null in ModularActionExecutor."
            r3 = 13527(0x34d7, float:1.8955E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x07b9
        L_0x064a:
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55278ml.f145594j
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r0.mo58887l(r4)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r6 = r4.f169971d
            java.lang.Object r0 = r0.mo58854l(r6)
            if (r0 != 0) goto L_0x0660
            java.lang.Object r0 = r4.f169969b
            goto L_0x0664
        L_0x0660:
            java.lang.Object r0 = r4.mo58889c(r0)
        L_0x0664:
            com.google.bb.a.ml r0 = (com.google.p4152bb.p4153a.C55278ml) r0
            int r4 = r0.f145596a
            r6 = 1
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0684
            int r4 = r0.f145597b
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r4 = r2.mo81211R(r4)
            boolean r6 = r4 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument
            if (r6 == 0) goto L_0x0684
            boolean r6 = r4.mo81263C()
            if (r6 == 0) goto L_0x0684
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument r4 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument) r4
            java.lang.Object r4 = r4.f236203n
            java.lang.String r4 = (java.lang.String) r4
            r6 = r4
            goto L_0x0685
        L_0x0684:
            r6 = 0
        L_0x0685:
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L_0x069a
            com.google.common.f.e r0 = f260129e
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "maybeExecuteReminderExecutionInfo: No title given"
            r3 = 13526(0x34d6, float:1.8954E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x07b9
        L_0x069a:
            int r4 = r0.f145596a
            r4 = r4 & 16
            if (r4 == 0) goto L_0x06c8
            int r4 = r0.f145601f
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r4 = r2.mo81211R(r4)
            boolean r7 = r4 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument
            if (r7 == 0) goto L_0x06c8
            boolean r7 = r4.mo81263C()
            if (r7 == 0) goto L_0x06c8
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument r4 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument) r4
            java.lang.Object r4 = r4.f236203n
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x06c8
            int r7 = r0.f145596a
            r7 = r7 & 64
            if (r7 == 0) goto L_0x06c8
            int r4 = r4.intValue()
            int r7 = r0.f145602g
            if (r4 != r7) goto L_0x06c8
            r4 = 0
            goto L_0x06c9
        L_0x06c8:
            r4 = 1
        L_0x06c9:
            if (r4 == 0) goto L_0x06e4
            int r7 = r0.f145596a
            r3 = r3 & r7
            if (r3 == 0) goto L_0x06e4
            int r3 = r0.f145598c
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r3 = r2.mo81211R(r3)
            boolean r7 = r3 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument
            if (r7 == 0) goto L_0x06e4
            boolean r7 = r3.mo81263C()
            if (r7 == 0) goto L_0x06e4
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument r3 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument) r3
            r7 = r3
            goto L_0x06e5
        L_0x06e4:
            r7 = 0
        L_0x06e5:
            if (r4 == 0) goto L_0x0701
            int r3 = r0.f145596a
            r3 = r3 & 8
            if (r3 == 0) goto L_0x0701
            int r3 = r0.f145600e
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r3 = r2.mo81211R(r3)
            boolean r8 = r3 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument
            if (r8 == 0) goto L_0x0701
            boolean r8 = r3.mo81263C()
            if (r8 == 0) goto L_0x0701
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument r3 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument) r3
            r8 = r3
            goto L_0x0702
        L_0x0701:
            r8 = 0
        L_0x0702:
            if (r4 != 0) goto L_0x071e
            int r3 = r0.f145596a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x071e
            int r3 = r0.f145599d
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r3 = r2.mo81211R(r3)
            boolean r4 = r3 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument
            if (r4 == 0) goto L_0x071e
            boolean r4 = r3.mo81263C()
            if (r4 == 0) goto L_0x071e
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument r3 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument) r3
            r9 = r3
            goto L_0x071f
        L_0x071e:
            r9 = 0
        L_0x071f:
            com.google.bb.a.lc r3 = r2.f236109o
            int r4 = r0.f145596a
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0735
            int r0 = r0.f145603h
            int r0 = com.google.p4152bb.p4153a.C55277mk.m87650a(r0)
            if (r0 != 0) goto L_0x0730
            goto L_0x0735
        L_0x0730:
            r4 = 3
            if (r0 != r4) goto L_0x0735
            r0 = 1
            goto L_0x0736
        L_0x0735:
            r0 = 0
        L_0x0736:
            if (r3 == 0) goto L_0x0789
            if (r0 != 0) goto L_0x0780
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.String r4 = r3.f145465b
            r10 = 0
            r0[r10] = r4
            java.util.ArrayList r0 = com.google.common.p4522b.C58597ky.m90212c(r0)
            java.util.List r0 = r5.mo86246d(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0751
            goto L_0x0789
        L_0x0751:
            java.lang.String r10 = r3.f145465b
            java.lang.String r0 = r5.mo86245c(r6, r7, r8, r9, r10)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x07b9
            com.google.bb.a.lc r3 = com.google.p4152bb.p4153a.C55242lc.f145462c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.bb.a.lb r3 = (com.google.p4152bb.p4153a.C55241lb) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.bb.a.lc r4 = (com.google.p4152bb.p4153a.C55242lc) r4
            r0.getClass()
            int r5 = r4.f145464a
            r6 = 1
            r5 = r5 | r6
            r4.f145464a = r5
            r4.f145465b = r0
            com.google.protobuf.bv r0 = r3.build()
            com.google.bb.a.lc r0 = (com.google.p4152bb.p4153a.C55242lc) r0
            r2.f236109o = r0
            goto L_0x07b5
        L_0x0780:
            java.lang.String r0 = r3.f145465b
            boolean r0 = r5.mo86249g(r0)
            if (r0 == 0) goto L_0x07b9
            goto L_0x07b5
        L_0x0789:
            java.lang.String r0 = r5.mo86244b(r6, r7, r8, r9)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x07b9
            com.google.bb.a.lc r3 = com.google.p4152bb.p4153a.C55242lc.f145462c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.bb.a.lb r3 = (com.google.p4152bb.p4153a.C55241lb) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.bb.a.lc r4 = (com.google.p4152bb.p4153a.C55242lc) r4
            r0.getClass()
            int r5 = r4.f145464a
            r6 = 1
            r5 = r5 | r6
            r4.f145464a = r5
            r4.f145465b = r0
            com.google.protobuf.bv r0 = r3.build()
            com.google.bb.a.lc r0 = (com.google.p4152bb.p4153a.C55242lc) r0
            r2.f236109o = r0
        L_0x07b5:
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a
            goto L_0x0a08
        L_0x07b9:
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            goto L_0x0a08
        L_0x07bd:
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55274mh.f145587e
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r0.mo58887l(r4)
            com.google.protobuf.bf r5 = r0.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            if (r4 == 0) goto L_0x0876
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55274mh.f145587e
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r0.mo58887l(r4)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r5 = r4.f169971d
            java.lang.Object r0 = r0.mo58854l(r5)
            if (r0 != 0) goto L_0x07e6
            java.lang.Object r0 = r4.f169969b
            goto L_0x07ea
        L_0x07e6:
            java.lang.Object r0 = r4.mo58889c(r0)
        L_0x07ea:
            com.google.bb.a.mh r0 = (com.google.p4152bb.p4153a.C55274mh) r0
            r0.getClass()
            int r4 = r0.f145589a
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0868
            int r4 = r0.f145591c
            int r4 = com.google.p4152bb.p4153a.C55273mg.m87649a(r4)
            if (r4 != 0) goto L_0x07fe
            goto L_0x085d
        L_0x07fe:
            if (r4 == r5) goto L_0x085d
            int r4 = r0.f145590b
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r4 = r2.mo81211R(r4)
            boolean r5 = r4 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument
            if (r5 == 0) goto L_0x0853
            boolean r5 = r4.mo81263C()
            if (r5 != 0) goto L_0x0811
            goto L_0x0853
        L_0x0811:
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument r4 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument) r4
            java.lang.Object r2 = r4.f236203n
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r2 = (com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation) r2
            if (r2 == 0) goto L_0x0872
            boolean r4 = r2.mo81543l()
            if (r4 == 0) goto L_0x0872
            com.google.android.apps.gsa.search.shared.contact.RelationshipStatus r4 = r2.f236395k
            if (r4 == 0) goto L_0x0872
            com.google.android.apps.gsa.search.shared.contact.Relationship r4 = r4.f236410c
            if (r4 == 0) goto L_0x0872
            android.os.Parcelable r5 = r2.f236364c
            r5.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r5 = (com.google.android.apps.gsa.search.shared.contact.Person) r5
            int r0 = r0.f145591c
            int r0 = com.google.p4152bb.p4153a.C55273mg.m87649a(r0)
            if (r0 != 0) goto L_0x0837
            r0 = 1
        L_0x0837:
            int r0 = r0 + -1
            r6 = 1
            if (r0 == r6) goto L_0x0845
            if (r0 == r3) goto L_0x083f
            goto L_0x0872
        L_0x083f:
            com.google.android.apps.gsa.search.core.ce r0 = r1.f260152p
            r0.mo79393e(r4, r5)
            goto L_0x084a
        L_0x0845:
            com.google.android.apps.gsa.search.core.ce r0 = r1.f260152p
            r0.mo79390b(r4, r5)
        L_0x084a:
            com.google.android.apps.gsa.search.shared.contact.RelationshipStatus r0 = r2.f236395k
            r0.mo81599a()
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a
            goto L_0x0a08
        L_0x0853:
            com.google.android.apps.gsa.search.shared.actions.modular.b r2 = r2.mo81210Q()
            int r0 = r0.f145590b
            r2.mo81402f(r0)
            goto L_0x0872
        L_0x085d:
            com.google.android.apps.gsa.search.shared.actions.modular.b r2 = r2.mo81210Q()
            java.lang.String r3 = "The relationship operation provided with the RelationshipExecutioInfo was set to UNKNOWN"
            r4 = 0
            r2.mo81395a(r3, r0, r4)
            goto L_0x0872
        L_0x0868:
            r4 = 0
            com.google.android.apps.gsa.search.shared.actions.modular.b r2 = r2.mo81210Q()
            java.lang.String r3 = "The argument to be used with the Relationship execution info was missing or of incorrect type."
            r2.mo81395a(r3, r0, r4)
        L_0x0872:
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            goto L_0x0a08
        L_0x0876:
            r4 = 0
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55284mr.f145623d
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r0.mo58887l(r3)
            com.google.protobuf.bf r5 = r0.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r3 = r5.mo58857o(r3)
            if (r3 == 0) goto L_0x09c4
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55284mr.f145623d
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r0.mo58887l(r3)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r5 = r3.f169971d
            java.lang.Object r0 = r0.mo58854l(r5)
            if (r0 != 0) goto L_0x08a0
            java.lang.Object r0 = r3.f169969b
            goto L_0x08a4
        L_0x08a0:
            java.lang.Object r0 = r3.mo58889c(r0)
        L_0x08a4:
            com.google.bb.a.mr r0 = (com.google.p4152bb.p4153a.C55284mr) r0
            r0.getClass()
            int r3 = r0.f145626b
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r3 = r2.mo81211R(r3)
            boolean r5 = r3 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument
            if (r5 == 0) goto L_0x08db
            boolean r5 = r3.mo81263C()
            if (r5 == 0) goto L_0x08db
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument r3 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument) r3
            java.lang.Object r3 = r3.f236203n
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r3 = (com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation) r3
            if (r3 == 0) goto L_0x08e6
            boolean r5 = r3.mo81543l()
            if (r5 == 0) goto L_0x08e6
            java.util.Set r5 = r3.f236392h
            com.google.android.apps.gsa.search.shared.contact.c r6 = com.google.android.apps.gsa.search.shared.contact.C87515c.PHONE_NUMBER
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x08e6
            android.os.Parcelable r3 = r3.f236412o
            r3.getClass()
            com.google.android.apps.gsa.search.shared.contact.Contact r3 = (com.google.android.apps.gsa.search.shared.contact.Contact) r3
            java.lang.String r3 = r3.f236354e
            goto L_0x08e7
        L_0x08db:
            boolean r5 = r3 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument
            if (r5 == 0) goto L_0x08e6
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument r3 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument) r3
            java.lang.Object r3 = r3.f236203n
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x08e7
        L_0x08e6:
            r3 = r4
        L_0x08e7:
            int r0 = r0.f145625a
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r0 = r2.mo81211R(r0)
            boolean r2 = r0 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument
            if (r2 == 0) goto L_0x08ff
            boolean r2 = r0.mo81263C()
            if (r2 == 0) goto L_0x08ff
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument r0 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument) r0
            java.lang.Object r0 = r0.f236203n
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0900
        L_0x08ff:
            r6 = r4
        L_0x0900:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x09c1
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x09c1
            com.google.android.apps.gsa.staticplugins.actions.a.al r0 = r1.f260154r
            com.google.common.base.ax r2 = r0.f260049g
            boolean r2 = r2.mo56113h()
            if (r2 != 0) goto L_0x0918
            goto L_0x099f
        L_0x0918:
            android.bluetooth.BluetoothAdapter r2 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            android.content.Context r4 = r0.f260044b
            boolean r4 = com.google.android.apps.gsa.shared.util.permissions.C91076c.m148792a(r4)
            if (r4 == 0) goto L_0x099f
            if (r2 == 0) goto L_0x099f
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L_0x099f
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f260045c
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250409cb
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x0951
            com.google.common.base.ax r2 = r0.f260048f
            boolean r2 = r2.mo56113h()
            if (r2 != 0) goto L_0x093f
            goto L_0x0951
        L_0x093f:
            com.google.common.base.ax r2 = r0.f260048f
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.a.b.b r2 = (com.google.android.apps.gsa.p496a.p499b.C9308b) r2
            com.google.common.b.ij r2 = r2.mo17489d()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x099f
        L_0x0951:
            com.google.common.base.ax r2 = r0.f260049g
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.a.b.a r2 = (com.google.android.apps.gsa.p496a.p499b.C9307a) r2
            com.google.android.apps.gsa.staticplugins.actions.a.an r4 = r0.f260046d     // Catch:{ am -> 0x0986 }
            android.content.Context r4 = r0.f260044b     // Catch:{ am -> 0x0986 }
            long r3 = com.google.android.apps.gsa.staticplugins.actions.p7353a.C93266an.m153357c(r4, r6, r3)     // Catch:{ am -> 0x0986 }
            com.google.android.apps.gsa.staticplugins.actions.a.aj r5 = new com.google.android.apps.gsa.staticplugins.actions.a.aj
            r5.<init>()
            r6 = 1
            com.google.android.apps.gsa.staticplugins.actions.a.ak r3 = r0.mo87594a(r3, r6, r5)
            android.content.Context r0 = r0.f260044b
            java.util.ArrayList r0 = com.google.android.apps.gsa.staticplugins.actions.p7353a.C93264al.m153351c(r0, r6)
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            boolean r0 = r2.mo17485a()
            if (r0 != 0) goto L_0x0983
            r0 = 25
            r3.mo87592a(r0)
        L_0x0983:
            com.google.common.util.concurrent.SettableFuture r0 = r3.f260039a
            goto L_0x09a3
        L_0x0986:
            r0 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.actions.p7353a.C93264al.f260043a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Exception inserting queued SMS into database."
            r4 = 13554(0x34f2, float:1.8993E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
            r0 = 18
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.m141588a(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x09a3
        L_0x099f:
            com.google.common.util.concurrent.cx r0 = r0.mo87595b(r3, r6)
        L_0x09a3:
            java.lang.Object r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r0)     // Catch:{ InterruptedException -> 0x09ac, ExecutionException -> 0x09aa }
            com.google.android.apps.gsa.search.shared.actions.i r0 = (com.google.android.apps.gsa.search.shared.actions.C87421i) r0     // Catch:{ InterruptedException -> 0x09ac, ExecutionException -> 0x09aa }
            goto L_0x0a08
        L_0x09aa:
            r0 = move-exception
            goto L_0x09ad
        L_0x09ac:
            r0 = move-exception
        L_0x09ad:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.actions.p7353a.C93264al.f260043a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Can't get SMS sending success"
            r4 = 13544(0x34e8, float:1.8979E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
            r0 = 22
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.m141588a(r0)
            goto L_0x0a08
        L_0x09c1:
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            goto L_0x0a08
        L_0x09c4:
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55217ke.f145371b
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r0.mo58887l(r3)
            com.google.protobuf.bf r4 = r0.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r3 = r4.mo58857o(r3)
            if (r3 == 0) goto L_0x09e5
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r0 = r2.f235985a
            boolean r0 = r0.mo81124l()
            if (r0 == 0) goto L_0x09e2
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a
            goto L_0x0a08
        L_0x09e2:
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
            goto L_0x0a08
        L_0x09e5:
            java.util.List r3 = r1.f260134D
            java.util.Iterator r3 = r3.iterator()
        L_0x09eb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0a06
            java.lang.Object r4 = r3.next()
            com.google.android.apps.gsa.staticplugins.actions.a.i r4 = (com.google.android.apps.gsa.staticplugins.actions.p7353a.C93277i) r4
            boolean r5 = r4.mo87608a(r0)
            if (r5 == 0) goto L_0x09eb
            boolean r0 = r4.mo87609b(r2, r0)
            if (r0 == 0) goto L_0x0a06
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236079a
            goto L_0x0a08
        L_0x0a06:
            com.google.android.apps.gsa.search.shared.actions.i r0 = com.google.android.apps.gsa.search.shared.actions.C87421i.f236081c
        L_0x0a08:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7353a.C93286r.mo87580a(com.google.android.apps.gsa.search.shared.actions.VoiceAction, int):com.google.android.apps.gsa.search.shared.actions.i");
    }

    /* renamed from: b */
    public final /* synthetic */ MatchingProviderInfo mo87581b(VoiceAction voiceAction, boolean z) {
        ModularAction modularAction = (ModularAction) voiceAction;
        C93326m mVar = this.f260141c;
        ArrayList arrayList = new ArrayList();
        MatchingProviderInfo matchingProviderInfo = null;
        ModularActionMatchingProviderInfo modularActionMatchingProviderInfo = null;
        for (C55305nl nlVar : modularAction.mo81236i()) {
            ModularActionMatchingProviderInfo b = mVar.mo87629b(modularAction, nlVar, z);
            arrayList.addAll(b.f236270h.f236312a);
            if (nlVar == modularAction.mo81219Z()) {
                modularActionMatchingProviderInfo = b;
            }
        }
        if (modularActionMatchingProviderInfo == null) {
            modularActionMatchingProviderInfo = mVar.mo87629b(modularAction, modularAction.mo81219Z(), z);
        }
        if (modularActionMatchingProviderInfo.mo81435e() && modularAction.mo81238l()) {
            List<C55361pn> k = modularAction.mo81237k();
            if (!k.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (C55361pn pnVar : k) {
                    C62940bt r2 = C62942bv.checkIsLite(C55357pj.f145861b);
                    pnVar.mo58887l(r2);
                    if (pnVar.f169962ag.mo58857o(r2.f169971d)) {
                        arrayList2.add(pnVar);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    matchingProviderInfo = new MatchingProviderInfo(arrayList2, (C55361pn) null, false);
                }
            }
        }
        if (matchingProviderInfo == null) {
            matchingProviderInfo = new MatchingProviderInfo(arrayList, modularActionMatchingProviderInfo.mo81433d(), modularActionMatchingProviderInfo.mo81437g());
        }
        return new ModularActionMatchingProviderInfo(matchingProviderInfo, modularActionMatchingProviderInfo.f236115a, modularActionMatchingProviderInfo.f236116b, modularActionMatchingProviderInfo.f236117c, modularActionMatchingProviderInfo.f236118d, modularActionMatchingProviderInfo.f236119e, modularActionMatchingProviderInfo.f236120f);
    }

    /* renamed from: d */
    public final void mo87613d(C89849ae aeVar, ModularAction modularAction, C48273ca caVar, boolean z) {
        if (!z) {
            ((C89859i) this.f260133C.mo27525b()).mo83702b(aeVar);
            return;
        }
        String str = modularAction.f235988d;
        String substring = (str == null || !str.startsWith("G")) ? BuildConfig.FLAVOR : str.substring(1);
        C48276cd cdVar = (C48276cd) C48277ce.f124864e.createBuilder();
        cdVar.copyOnWrite();
        C48277ce ceVar = (C48277ce) cdVar.instance;
        substring.getClass();
        ceVar.f124866a = 1 | ceVar.f124866a;
        ceVar.f124867b = substring;
        C48277ce ceVar2 = (C48277ce) cdVar.build();
        if (caVar != null) {
            C48276cd cdVar2 = (C48276cd) ceVar2.toBuilder();
            cdVar2.copyOnWrite();
            C48277ce ceVar3 = (C48277ce) cdVar2.instance;
            ceVar3.f124868c = caVar;
            ceVar3.f124866a |= 2;
            ceVar2 = (C48277ce) cdVar2.build();
        }
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        ceVar2.getClass();
        cbVar.f160046K = ceVar2;
        cbVar.f160115b |= 1024;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.f246203c = (C59687cb) ajVar.build();
        ((C89859i) this.f260133C.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: e */
    public final void mo87614e(C89849ae aeVar, ModularAction modularAction, C48275cc ccVar) {
        String str = modularAction.f235988d;
        String substring = (str == null || !str.startsWith("G")) ? BuildConfig.FLAVOR : str.substring(1);
        C48276cd cdVar = (C48276cd) C48277ce.f124864e.createBuilder();
        cdVar.copyOnWrite();
        C48277ce ceVar = (C48277ce) cdVar.instance;
        substring.getClass();
        ceVar.f124866a = 1 | ceVar.f124866a;
        ceVar.f124867b = substring;
        C48277ce ceVar2 = (C48277ce) cdVar.build();
        if (ccVar != null) {
            C48276cd cdVar2 = (C48276cd) ceVar2.toBuilder();
            cdVar2.copyOnWrite();
            C48277ce ceVar3 = (C48277ce) cdVar2.instance;
            ceVar3.f124869d = ccVar;
            ceVar3.f124866a |= 4;
            ceVar2 = (C48277ce) cdVar2.build();
        }
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        ceVar2.getClass();
        cbVar.f160046K = ceVar2;
        cbVar.f160115b |= 1024;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.f246203c = (C59687cb) ajVar.build();
        ((C89859i) this.f260133C.mo27525b()).mo74236a(fVar.mo83699a());
    }
}
