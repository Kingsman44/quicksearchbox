package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Pair;
import androidx.p060c.C0984n;
import com.google.android.apps.gsa.search.core.google.p6790a.C85810bb;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6883x.C87280a;
import com.google.android.apps.gsa.search.shared.media.C87580d;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52161hm;
import com.google.assistant.p3897e.p3921j.C52162hn;
import com.google.assistant.p3897e.p3921j.C52163ho;
import com.google.assistant.p3897e.p3921j.C52177ib;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.assistant.p3897e.p3921j.C52180ie;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.base.C58831av;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.ap */
/* compiled from: PG */
public final class C93094ap {

    /* renamed from: a */
    public static final C59071e f259690a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.g.ap");

    /* renamed from: h */
    private static final C0984n f259691h;

    /* renamed from: b */
    public final C90931ca f259692b;

    /* renamed from: c */
    public final C68214a f259693c;

    /* renamed from: d */
    public final C68214a f259694d;

    /* renamed from: e */
    public C52161hm f259695e = C52161hm.NONE;

    /* renamed from: f */
    public final C0310l f259696f;

    /* renamed from: g */
    public final C37215b f259697g;

    /* renamed from: i */
    private final C68214a f259698i;

    /* renamed from: j */
    private final C22871g f259699j;

    /* renamed from: k */
    private final C68214a f259700k;

    /* renamed from: l */
    private final C68214a f259701l;

    /* renamed from: m */
    private final Context f259702m;

    /* renamed from: n */
    private final C22695ah f259703n;

    /* renamed from: o */
    private final C21370a f259704o;

    /* renamed from: p */
    private final C118561t f259705p;

    /* renamed from: q */
    private final long f259706q;

    /* renamed from: r */
    private boolean f259707r;

    static {
        C0984n nVar = new C0984n(11);
        f259691h = nVar;
        nVar.put(0, C52179id.UNKNOWN_MEDIA_ERROR);
        nVar.put(1, C52179id.APP_ERROR);
        nVar.put(2, C52179id.NOT_SUPPORTED);
        nVar.put(3, C52179id.AUTHENTICATION_EXPIRED);
        nVar.put(4, C52179id.PREMIUM_ACCOUNT_REQUIRED);
        nVar.put(5, C52179id.CONCURRENT_STREAM_LIMIT);
        nVar.put(6, C52179id.PARENTAL_CONTROL_RESTRICTED);
        nVar.put(7, C52179id.NOT_AVAILABLE_IN_REGION);
        nVar.put(9, C52179id.SKIP_LIMIT_REACHED);
        nVar.put(10, C52179id.ACTION_ABORTED);
        nVar.put(11, C52179id.END_OF_QUEUE);
    }

    public C93094ap(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C90931ca caVar, C22871g gVar, C68214a aVar4, C68214a aVar5, C22695ah ahVar, C21370a aVar6, C118561t tVar, C37215b bVar) {
        this.f259702m = context;
        this.f259700k = aVar;
        this.f259694d = aVar2;
        this.f259698i = aVar3;
        this.f259692b = caVar;
        this.f259699j = gVar;
        this.f259693c = aVar4;
        this.f259701l = aVar5;
        this.f259703n = ahVar;
        this.f259704o = aVar6;
        this.f259706q = aVar6.mo26870b();
        this.f259705p = tVar;
        this.f259697g = bVar;
        this.f259696f = new C93089ak(bVar);
    }

    /* renamed from: b */
    static C52070ec m153159b(String str, C52179id idVar, CharSequence charSequence) {
        C52177ib ibVar = (C52177ib) C52180ie.f136954d.createBuilder();
        ibVar.copyOnWrite();
        C52180ie ieVar = (C52180ie) ibVar.instance;
        ieVar.f136957b = idVar.f136953B;
        ieVar.f136956a |= 2;
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "play_media_op_result";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        C63088z byteString = ((C52180ie) ibVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar.f137059a |= 2;
        kaVar.f137061c = byteString;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = "assistant.api.client_op.PlayMediaOpResult";
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        String str2 = "Got error code: " + idVar.name() + " from media app: " + str + " with error message: " + String.valueOf(charSequence);
        ((C59052c) ((C59052c) f259690a.mo56225c()).mo56372aa(13358)).mo56389s("%s", str2);
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.UNKNOWN;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        kdVar.copyOnWrite();
        C52236kg kgVar2 = (C52236kg) kdVar.instance;
        kgVar2.f137091a |= 2;
        kgVar2.f137093c = str2;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar3 = (C52236kg) kdVar.build();
        kgVar3.getClass();
        ecVar.f136654b = kgVar3;
        ecVar.f136653a |= 1;
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        eaVar.mo53780b((C52232kc) kbVar.build());
        dzVar.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar.instance;
        C52069eb ebVar = (C52069eb) eaVar.build();
        ebVar.getClass();
        ecVar2.f136655c = ebVar;
        ecVar2.f136653a |= 2;
        return (C52070ec) dzVar.build();
    }

    /* renamed from: c */
    static C52070ec m153160c(String str) {
        if (str == null) {
            return C22402a.m41822b(C52235kf.NOT_FOUND, "No active media controller.");
        }
        return m153159b(str, C52179id.MEDIA_SESSION_UNSUPPORTED, "Failed to get active media controller.");
    }

    /* renamed from: d */
    static C52070ec m153161d(C52180ie ieVar, C52163ho hoVar, C52232kc kcVar, CharSequence charSequence) {
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        if (charSequence != null) {
            C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
            C52235kf kfVar = C52235kf.UNKNOWN;
            kdVar.copyOnWrite();
            C52236kg kgVar = (C52236kg) kdVar.instance;
            kgVar.f137092b = kfVar.f137088t;
            kgVar.f137091a |= 1;
            String obj = charSequence.toString();
            kdVar.copyOnWrite();
            C52236kg kgVar2 = (C52236kg) kdVar.instance;
            obj.getClass();
            kgVar2.f137091a |= 2;
            kgVar2.f137093c = obj;
            dzVar.copyOnWrite();
            C52070ec ecVar = (C52070ec) dzVar.instance;
            C52236kg kgVar3 = (C52236kg) kdVar.build();
            kgVar3.getClass();
            ecVar.f136654b = kgVar3;
            ecVar.f136653a |= 1;
        } else {
            C52233kd kdVar2 = (C52233kd) C52236kg.f137089d.createBuilder();
            C52235kf kfVar2 = C52235kf.OK;
            kdVar2.copyOnWrite();
            C52236kg kgVar4 = (C52236kg) kdVar2.instance;
            kgVar4.f137092b = kfVar2.f137088t;
            kgVar4.f137091a |= 1;
            dzVar.copyOnWrite();
            C52070ec ecVar2 = (C52070ec) dzVar.instance;
            C52236kg kgVar5 = (C52236kg) kdVar2.build();
            kgVar5.getClass();
            ecVar2.f136654b = kgVar5;
            ecVar2.f136653a |= 1;
        }
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        if (ieVar != null) {
            eaVar.mo53780b(m153163i("play_media_op_result", "assistant.api.client_op.PlayMediaOpResult", ieVar.toByteString()));
        }
        if (hoVar != null) {
            eaVar.mo53780b(m153163i("media_initiation_op_result", "assistant.api.client_op.MediaInitiationOpResult", hoVar.toByteString()));
        }
        if (kcVar != null) {
            eaVar.mo53780b(kcVar);
        }
        if (((C52069eb) eaVar.instance).f136650a.size() > 0) {
            dzVar.copyOnWrite();
            C52070ec ecVar3 = (C52070ec) dzVar.instance;
            C52069eb ebVar = (C52069eb) eaVar.build();
            ebVar.getClass();
            ecVar3.f136655c = ebVar;
            ecVar3.f136653a |= 2;
        }
        return (C52070ec) dzVar.build();
    }

    /* renamed from: f */
    public static C52179id m153162f(PlaybackStateCompat playbackStateCompat) {
        return (C52179id) C58831av.m90830c((C52179id) f259691h.get(Integer.valueOf(playbackStateCompat.f999f)), C52179id.UNKNOWN_MEDIA_ERROR);
    }

    /* renamed from: i */
    static C52232kc m153163i(String str, String str2, C63088z zVar) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        zVar.getClass();
        kaVar.f137059a |= 2;
        kaVar.f137061c = zVar;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = str2;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return (C52232kc) kbVar.build();
    }

    /* renamed from: l */
    public static String m153164l(String str, CharSequence charSequence) {
        String valueOf = String.valueOf(charSequence);
        return "Got error " + valueOf + " from media app " + str;
    }

    /* renamed from: m */
    static String m153165m(C51098gh ghVar) {
        if (ghVar == null || ghVar.f133012b != 1) {
            return null;
        }
        C51058ev evVar = (C51058ev) ghVar.f133013c;
        if ((evVar.f132943a & 1) != 0) {
            return evVar.f132944b;
        }
        return null;
    }

    /* renamed from: p */
    static boolean m153166p(C0320v vVar) {
        PlaybackStateCompat f = vVar.mo1038f();
        return f != null && f.f994a == 7 && f.f999f == 3;
    }

    /* renamed from: q */
    public static boolean m153167q(PlaybackStateCompat playbackStateCompat) {
        return playbackStateCompat.f994a == 7 || playbackStateCompat.f999f != 0;
    }

    /* renamed from: r */
    private final long m153168r() {
        return this.f259704o.mo26870b() - this.f259706q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0320v mo87533a(String str, boolean z) {
        ComponentName componentName = null;
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent("android.media.browse.MediaBrowserService");
            intent.setPackage(str);
            List<ResolveInfo> queryIntentServices = ((C87594r) this.f259694d.mo27525b()).f236649b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices.isEmpty()) {
                ((C59052c) ((C59052c) C87594r.f236647a.mo56226d()).mo56372aa(9631)).mo56389s("Could not find a service matching MediaBrowserServiceCompat.SERVICE_INTERFACE and package name: %s", str);
            } else {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (!TextUtils.isEmpty(serviceInfo.packageName) && !TextUtils.isEmpty(serviceInfo.name)) {
                        componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    }
                }
                ((C59052c) ((C59052c) C87594r.f236647a.mo56226d()).mo56372aa(9630)).mo56389s("Invalid ComponentInfo while creating ComponentName from package name %s", str);
            }
        }
        Pair e = ((C87594r) this.f259694d.mo27525b()).mo81726e(componentName, str, z);
        this.f259707r = ((Boolean) e.second).booleanValue();
        return (C0320v) e.first;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C52163ho mo87534e(C52161hm hmVar, String str) {
        ((C59052c) ((C59052c) f259690a.mo56224b()).mo56372aa(13359)).mo56354G("Media Initiation Executed, Type is: %s sent to package: %s", hmVar, str);
        C52162hn hnVar = (C52162hn) C52163ho.f136875d.createBuilder();
        hnVar.copyOnWrite();
        C52163ho hoVar = (C52163ho) hnVar.instance;
        hoVar.f136878b = hmVar.f136874g;
        hoVar.f136877a |= 1;
        boolean z = this.f259707r;
        hnVar.copyOnWrite();
        C52163ho hoVar2 = (C52163ho) hnVar.instance;
        hoVar2.f136877a |= 2;
        hoVar2.f136879c = z;
        return (C52163ho) hnVar.build();
    }

    /* renamed from: g */
    public final C52180ie mo87535g() {
        C52177ib ibVar = (C52177ib) C52180ie.f136954d.createBuilder();
        long r = m153168r();
        ibVar.copyOnWrite();
        C52180ie ieVar = (C52180ie) ibVar.instance;
        ieVar.f136956a |= 4;
        ieVar.f136958c = r;
        return (C52180ie) ibVar.build();
    }

    /* renamed from: h */
    public final C52180ie mo87536h(C52179id idVar) {
        C52177ib ibVar = (C52177ib) C52180ie.f136954d.createBuilder();
        ibVar.copyOnWrite();
        C52180ie ieVar = (C52180ie) ibVar.instance;
        ieVar.f136957b = idVar.f136953B;
        ieVar.f136956a |= 2;
        long r = m153168r();
        ibVar.copyOnWrite();
        C52180ie ieVar2 = (C52180ie) ibVar.instance;
        ieVar2.f136956a |= 4;
        ieVar2.f136958c = r;
        return (C52180ie) ibVar.build();
    }

    /* renamed from: j */
    public final C52232kc mo87537j(C0320v vVar) {
        C52232kc d = ((C85810bb) this.f259698i.mo27525b()).mo79456d(vVar);
        if (d == null) {
            ((C59052c) ((C59052c) f259690a.mo56226d()).mo56372aa(13360)).mo56386p("Unable to populate MediaParams from MediaController.");
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo87538k(java.lang.String r16, com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93093ao r17, android.support.p031v4.media.session.C0320v r18, boolean r19) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
            r8 = r18
            android.support.v4.media.session.PlaybackStateCompat r0 = r18.mo1038f()
            if (r0 != 0) goto L_0x001d
            com.google.common.f.e r0 = f259690a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = r18.mo1039g()
            r2 = 13363(0x3433, float:1.8726E-41)
            java.lang.String r3 = "PlaybackState is null for package: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r3, r1)
            goto L_0x0078
        L_0x001d:
            dagger.a r1 = r6.f259698i
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.google.a.bb r1 = (com.google.android.apps.gsa.search.core.google.p6790a.C85810bb) r1
            long r2 = r0.f998e
            java.util.List r0 = r1.mo79458g(r2)
            java.lang.String r1 = r18.mo1039g()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Package: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " supports: "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.util.Iterator r0 = r0.iterator()
        L_0x0046:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x006b
            java.lang.Object r2 = r0.next()
            com.google.assistant.e.i.a.ih r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51454ih) r2
            java.lang.String r2 = r2.name()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = "; "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L_0x0046
        L_0x006b:
            com.google.common.f.e r0 = f259690a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r2 = "%s"
            r3 = 13362(0x3432, float:1.8724E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r2, r1)
        L_0x0078:
            com.google.common.util.concurrent.SettableFuture r9 = new com.google.common.util.concurrent.SettableFuture
            r9.<init>()
            dagger.a r0 = r6.f259693c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90050db.f248764a
            boolean r10 = r0.mo79746e(r1)
            com.google.android.apps.gsa.staticplugins.accl.performers.g.al r0 = new com.google.android.apps.gsa.staticplugins.accl.performers.g.al
            r0.<init>(r15, r10, r8)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r9, r0, r1)
            dagger.a r0 = r6.f259694d
            java.lang.Object r0 = r0.mo27525b()
            r11 = r0
            com.google.android.apps.gsa.search.shared.media.r r11 = (com.google.android.apps.gsa.search.shared.media.C87594r) r11
            int r0 = r16.hashCode()
            r1 = 3
            r2 = 2
            java.lang.String r12 = "media.PLAY_MEDIA"
            r13 = 1
            switch(r0) {
                case -1431171252: goto L_0x00c7;
                case -1355740809: goto L_0x00bd;
                case -26624189: goto L_0x00b5;
                case 1893603276: goto L_0x00ab;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            goto L_0x00d1
        L_0x00ab:
            java.lang.String r0 = "media.STOP"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = 1
            goto L_0x00d2
        L_0x00b5:
            boolean r0 = r7.equals(r12)
            if (r0 == 0) goto L_0x00d1
            r0 = 2
            goto L_0x00d2
        L_0x00bd:
            java.lang.String r0 = "media.RESUME"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = 3
            goto L_0x00d2
        L_0x00c7:
            java.lang.String r0 = "media.PAUSE"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00d1
            r0 = 0
            goto L_0x00d2
        L_0x00d1:
            r0 = -1
        L_0x00d2:
            if (r0 == 0) goto L_0x00ef
            if (r0 == r13) goto L_0x00ef
            if (r0 == r2) goto L_0x00e0
            if (r0 == r1) goto L_0x00e0
            com.google.android.apps.gsa.staticplugins.accl.performers.g.ai r0 = new com.google.android.apps.gsa.staticplugins.accl.performers.g.ai
            r0.<init>(r15, r9, r8)
            goto L_0x00f4
        L_0x00e0:
            com.google.android.apps.gsa.staticplugins.accl.performers.g.ah r14 = new com.google.android.apps.gsa.staticplugins.accl.performers.g.ah
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r18
            r4 = r9
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x00f4
        L_0x00ef:
            com.google.android.apps.gsa.staticplugins.accl.performers.g.ag r0 = new com.google.android.apps.gsa.staticplugins.accl.performers.g.ag
            r0.<init>(r15, r9, r8)
        L_0x00f4:
            r11.f236652e = r0
            com.google.android.libraries.gsa.k.g r11 = r6.f259699j
            com.google.android.apps.gsa.staticplugins.accl.performers.g.aj r14 = new com.google.android.apps.gsa.staticplugins.accl.performers.g.aj
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r18
            r4 = r10
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r0 = "Register callback and execute media operation"
            r11.mo28212l(r0, r14)
            boolean r5 = r7.equals(r12)
            if (r13 == r5) goto L_0x0116
            r0 = 1000(0x3e8, float:1.401E-42)
            r7 = 1000(0x3e8, float:1.401E-42)
            goto L_0x011a
        L_0x0116:
            r0 = 5000(0x1388, float:7.006E-42)
            r7 = 5000(0x1388, float:7.006E-42)
        L_0x011a:
            com.google.android.apps.gsa.staticplugins.accl.performers.g.an r10 = new com.google.android.apps.gsa.staticplugins.accl.performers.g.an
            r0 = r10
            r1 = r15
            r2 = r9
            r3 = r18
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.apps.gsa.shared.util.c.ca r0 = r6.f259692b
            long r1 = (long) r7
            r0.mo85137b(r10, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93094ap.mo87538k(java.lang.String, com.google.android.apps.gsa.staticplugins.accl.performers.g.ao, android.support.v4.media.session.v, boolean):com.google.common.util.concurrent.cx");
    }

    /* renamed from: n */
    public final void mo87539n() {
        C87580d.m142368a((C87594r) this.f259694d.mo27525b());
        C118561t tVar = this.f259705p;
        long a = ((C86124t) this.f259693c.mo27525b()).mo79743a(C90014bt.f247400gT);
        ((C59052c) ((C59052c) C87580d.f236621a.mo56224b()).mo56372aa(9615)).mo56386p("Arrange background task to log media content.");
        C118522by byVar = C118522by.LOG_TOP_ACTIVE_MEDIA_SESSION;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = a;
        if (!tVar.mo103754e(byVar, (C118472ag) afVar.build())) {
            ((C59052c) ((C59052c) C87580d.f236621a.mo56226d()).mo56372aa(9616)).mo56386p("#arrangeLogMediaContentBackgroundTask: Failed to schedule one-off task.");
        }
    }

    /* renamed from: o */
    public final void mo87540o(C0320v vVar) {
        String g = vVar.mo1039g();
        C87280a aVar = (C87280a) this.f259700k.mo27525b();
        boolean equals = "com.google.android.apps.books".equals(g);
        PendingIntent c = vVar.mo1035c();
        if (c != null) {
            if (equals) {
                try {
                    Intent intent = new Intent();
                    ((C87280a) this.f259700k.mo27525b()).mo80926a(intent);
                    c.send(this.f259702m, 0, intent);
                    return;
                } catch (PendingIntent.CanceledException e) {
                    ((C59052c) ((C59052c) ((C59052c) f259690a.mo56225c()).mo56382g(e)).mo56372aa(13366)).mo56386p("Failed to send session activity.");
                }
            } else {
                c.send();
                return;
            }
        }
        C59071e eVar = f259690a;
        ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(13364)).mo56389s("Failed to open app by session activity. Fallback to intent with: %s", g);
        Intent launchIntentForPackage = ((PackageManager) this.f259701l.mo27525b()).getLaunchIntentForPackage(g);
        if (launchIntentForPackage != null) {
            if (equals) {
                ((C87280a) this.f259700k.mo27525b()).mo80926a(launchIntentForPackage);
            }
            launchIntentForPackage.setFlags(536870912);
            this.f259703n.mo27807a(launchIntentForPackage);
            return;
        }
        ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(13365)).mo56389s("Failed to get launch-intent from package: %s", g);
    }
}
