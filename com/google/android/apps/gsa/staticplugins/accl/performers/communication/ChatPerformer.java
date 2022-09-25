package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.p507f.p508a.C9413b;
import com.google.android.apps.gsa.assistant.shared.C73846br;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6727dt.C85458b;
import com.google.android.apps.gsa.search.core.p6519al.p6727dt.C85460d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89143o;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7183s.C91088a;
import com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22535l;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p3494x.p3495a.p3496a.C44483b;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52309mz;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class ChatPerformer extends C22538o {

    /* renamed from: a */
    public static final C59071e f259389a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer");

    /* renamed from: b */
    public final C22695ah f259390b;

    /* renamed from: c */
    public final Context f259391c;

    /* renamed from: d */
    public C52321nk f259392d;

    /* renamed from: e */
    public final C9413b f259393e;

    /* renamed from: f */
    public final C68214a f259394f;

    /* renamed from: g */
    public final C22720x f259395g;

    /* renamed from: h */
    public final C93021be f259396h;

    /* renamed from: i */
    public final C89143o f259397i;

    /* renamed from: j */
    ResultReceiverCallback f259398j;

    /* renamed from: k */
    C92996ag f259399k;

    /* renamed from: l */
    private final C91088a f259400l;

    /* renamed from: m */
    private final C22871g f259401m;

    /* renamed from: o */
    private final C85460d f259402o;

    /* renamed from: p */
    private final C22871g f259403p;

    /* renamed from: q */
    private final PackageManager f259404q;

    /* renamed from: r */
    private final C68214a f259405r;

    /* renamed from: s */
    private final C22871g f259406s;

    /* renamed from: t */
    private final C58833ax f259407t;

    /* renamed from: u */
    private final C68214a f259408u;

    /* renamed from: v */
    private final C58833ax f259409v;

    /* renamed from: w */
    private final C44483b f259410w;

    /* renamed from: x */
    private final C68214a f259411x;

    /* compiled from: PG */
    class ResultReceiverCallback extends ResultReceiver {

        /* renamed from: a */
        public final SettableFuture f259412a = new SettableFuture();

        public ResultReceiverCallback() {
            super(new Handler(Looper.getMainLooper()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo87509a(int i, Bundle bundle) {
            C59071e eVar = ChatPerformer.f259389a;
            if (i == 0) {
                this.f259412a.mo57356n(C118826c.f331422a);
                return;
            }
            String string = (bundle == null || !bundle.containsKey("com.google.android.voicesearch.extra.ERROR_MESSAGE")) ? "Unknown error" : bundle.getString("com.google.android.voicesearch.extra.ERROR_MESSAGE");
            SettableFuture settableFuture = this.f259412a;
            settableFuture.mo57357o(new RuntimeException("Unknown error. ResultCode: " + i + " ErrorMessage: " + string));
        }

        /* access modifiers changed from: protected */
        public final void onReceiveResult(int i, Bundle bundle) {
            mo87509a(i, bundle);
        }
    }

    public ChatPerformer(Context context, C22695ah ahVar, C91088a aVar, C22871g gVar, C85460d dVar, C9413b bVar, C22871g gVar2, C22871g gVar3, PackageManager packageManager, C68214a aVar2, C58833ax axVar, C68214a aVar3, C68214a aVar4, C68214a aVar5, C22720x xVar, C58833ax axVar2, C93021be beVar, C44483b bVar2, C89143o oVar) {
        this.f259390b = ahVar;
        this.f259391c = context;
        this.f259400l = aVar;
        this.f259401m = gVar;
        this.f259402o = dVar;
        this.f259393e = bVar;
        this.f259403p = gVar2;
        this.f259406s = gVar3;
        this.f259404q = packageManager;
        this.f259405r = aVar2;
        this.f259407t = axVar;
        this.f259411x = aVar3;
        this.f259408u = aVar4;
        this.f259394f = aVar5;
        this.f259395g = xVar;
        this.f259409v = axVar2;
        this.f259396h = beVar;
        this.f259410w = bVar2;
        this.f259397i = oVar;
    }

    /* renamed from: b */
    public static C52070ec m153032b(C52235kf kfVar, String str) {
        return C22402a.m41822b(kfVar, "Send chat message failed. Error: ".concat(str));
    }

    /* renamed from: i */
    static boolean m153033i(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("audio/");
    }

    /* renamed from: n */
    private final C60870cx m153034n(C52321nk nkVar, String str, C60870cx cxVar, String str2, C51809dy dyVar, C22434e eVar) {
        if (this.f259392d != null) {
            C51098gh ghVar = nkVar.f137333f;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            C51098gh ghVar2 = ghVar;
            C52374pj pjVar = nkVar.f137331d;
            if (pjVar == null) {
                pjVar = C52374pj.f137434e;
            }
            String str3 = pjVar.f137437b == 2 ? (String) pjVar.f137438c : BuildConfig.FLAVOR;
            String b = C92998ai.m153057b(this.f259392d);
            if (!TextUtils.isEmpty(str3) || !b.isEmpty()) {
                return m153035o(C60922j.m93045h(C60838bs.m92859i(cxVar), new C93054z(this, ghVar2, str3, str, str2, nkVar), C60826bg.f164896a), false, C89849ae.OPA_CHAT_PERFORMER_SHARE_FILES_SUCCESS, dyVar, eVar);
            }
            ((C59052c) ((C59052c) f259389a.mo56225c()).mo56372aa(13182)).mo56386p("Invalid args without recipient phone number or app unique id.");
            ((C89859i) this.f259394f.mo27525b()).mo83702b(C89849ae.OPA_CHAT_PERFORMER_INVALID_ARGS);
            C93223a.m153296b(this.f259397i, eVar, dyVar.f135936b, "INVALID_ARGS");
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, (String) null));
        }
        ((C89859i) this.f259394f.mo27525b()).mo83702b(C89849ae.OPA_CHAT_PERFORMER_NULL_CHAT_ARGS);
        throw new RuntimeException("ChatArgs is null. Can't share URI.");
    }

    /* renamed from: o */
    private final C60870cx m153035o(C60870cx cxVar, boolean z, C89849ae aeVar, C51809dy dyVar, C22434e eVar) {
        return C60846c.m92878g(C60846c.m92878g(C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(C90877ak.m148471e(cxVar, 5, TimeUnit.SECONDS, this.f259401m)), new C92990aa(this, eVar, dyVar, aeVar), C60826bg.f164896a), RuntimeException.class, new C92991ab(this, eVar, dyVar), C60826bg.f164896a), TimeoutException.class, new C93041m(this, z, eVar, dyVar, aeVar), C60826bg.f164896a), Exception.class, new C93042n(this, eVar, dyVar), C60826bg.f164896a);
    }

    /* renamed from: p */
    private static String m153036p(C58833ax axVar) {
        return axVar.mo56113h() ? ((C73846br) axVar.mo56107c()).mo65332b() : "text/plain";
    }

    /* renamed from: q */
    private static String m153037q(C68214a aVar) {
        return (String) C58833ax.m90833j(((C86054o) aVar.mo27525b()).mo79659F()).mo56106b(C93046r.f259556a).mo56109e(BuildConfig.FLAVOR);
    }

    /* renamed from: r */
    private static boolean m153038r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!"content".equalsIgnoreCase(Uri.parse((String) it.next()).getScheme())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    private static C58833ax m153039s(int i) {
        int i2 = i - 2;
        return (i2 == -1 || i2 == 0) ? C58836b.f156633a : C58833ax.m90834k("message.text");
    }

    /* JADX WARNING: type inference failed for: r2v68, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b7, code lost:
        if (com.google.android.apps.gsa.staticplugins.accl.performers.communication.C92998ai.m153058c(java.lang.Long.parseLong(r5.mo79758x(com.google.android.apps.gsa.shared.p7066m.C90014bt.f247644kz)), r4) == false) goto L_0x00f9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r17, com.google.android.libraries.gsa.conversation.clientop.C22434e r18) {
        /*
            r16 = this;
            r9 = r16
            r10 = r17
            r11 = r18
            java.lang.String r0 = "chat_message.SEND"
            java.lang.String r1 = r10.f135936b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x056c
            com.google.common.f.e r0 = f259389a
            com.google.common.f.x r1 = r0.mo56224b()
            java.lang.String r2 = "ChatPerformer invoked."
            r3 = 13172(0x3374, float:1.8458E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.assistant.e.j.dw r1 = r10.f135938d
            if (r1 != 0) goto L_0x0023
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0023:
            com.google.assistant.e.j.nk r2 = com.google.assistant.p3897e.p3921j.C52321nk.f137326j
            com.google.protobuf.eb r2 = r2.getParserForType()
            java.lang.String r3 = "chat_args"
            com.google.protobuf.MessageLite r1 = m41992m(r1, r3, r2)
            com.google.assistant.e.j.nk r1 = (com.google.assistant.p3897e.p3921j.C52321nk) r1
            r9.f259392d = r1
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.my r1 = (com.google.assistant.p3897e.p3921j.C52308my) r1
            android.content.Context r2 = r9.f259391c
            com.google.assistant.e.j.nk r3 = r9.f259392d
            android.content.pm.PackageManager r4 = r9.f259404q
            dagger.a r5 = r9.f259408u
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            com.google.assistant.e.c.c.gh r6 = r3.f137333f
            if (r6 != 0) goto L_0x004d
            com.google.assistant.e.c.c.gh r6 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x004d:
            java.lang.String r7 = android.provider.Telephony.Sms.getDefaultSmsPackage(r2)
            int r8 = r6.f133012b
            r12 = 1
            if (r8 != r12) goto L_0x005b
            java.lang.Object r8 = r6.f133013c
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            goto L_0x005d
        L_0x005b:
            com.google.assistant.e.c.c.ev r8 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x005d:
            java.lang.String r8 = r8.f132944b
            boolean r8 = r8.isEmpty()
            r13 = 13
            if (r8 == 0) goto L_0x00f9
            java.lang.String r8 = "com.google.android.apps.messaging"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00f9
            boolean r2 = com.google.android.apps.gsa.staticplugins.accl.performers.communication.C92998ai.m153059d(r2)
            if (r2 != 0) goto L_0x00f9
            int r2 = r3.f137328a
            if (r2 != r13) goto L_0x00b9
            java.lang.Object r2 = r3.f137329b
            com.google.assistant.e.j.nb r2 = (com.google.assistant.p3897e.p3921j.C52312nb) r2
            java.lang.String r2 = r2.f137315b
            boolean r2 = m153033i(r2)
            if (r2 == 0) goto L_0x0096
            com.google.android.apps.gsa.shared.m.h r2 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249667J
            java.lang.String r2 = r5.mo79758x(r2)
            long r14 = java.lang.Long.parseLong(r2)
            boolean r2 = com.google.android.apps.gsa.staticplugins.accl.performers.communication.C92998ai.m153058c(r14, r4)
            if (r2 != 0) goto L_0x0096
            goto L_0x00f9
        L_0x0096:
            int r2 = r3.f137328a
            if (r2 != r13) goto L_0x009f
            java.lang.Object r2 = r3.f137329b
            com.google.assistant.e.j.nb r2 = (com.google.assistant.p3897e.p3921j.C52312nb) r2
            goto L_0x00a1
        L_0x009f:
            com.google.assistant.e.j.nb r2 = com.google.assistant.p3897e.p3921j.C52312nb.f137312c
        L_0x00a1:
            com.google.protobuf.cq r2 = r2.f137314a
            int r2 = r2.size()
            if (r2 <= r12) goto L_0x00b9
            com.google.android.apps.gsa.shared.m.h r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247644kz
            java.lang.String r2 = r5.mo79758x(r2)
            long r2 = java.lang.Long.parseLong(r2)
            boolean r2 = com.google.android.apps.gsa.staticplugins.accl.performers.communication.C92998ai.m153058c(r2, r4)
            if (r2 == 0) goto L_0x00f9
        L_0x00b9:
            com.google.protobuf.bn r2 = r6.toBuilder()
            com.google.assistant.e.c.c.gg r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r2
            int r3 = r6.f133012b
            if (r3 != r12) goto L_0x00c8
            java.lang.Object r3 = r6.f133013c
            com.google.assistant.e.c.c.ev r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r3
            goto L_0x00ca
        L_0x00c8:
            com.google.assistant.e.c.c.ev r3 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x00ca:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.e.c.c.es r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4
            int r5 = r4.f132943a
            r5 = r5 | r12
            r4.f132943a = r5
            r4.f132944b = r8
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.c.c.gh r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.c.c.ev r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r3
            r3.getClass()
            r4.f133013c = r3
            r4.f133012b = r12
            com.google.protobuf.bv r2 = r2.build()
            r6 = r2
            com.google.assistant.e.c.c.gh r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r6
        L_0x00f9:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.nk r2 = (com.google.assistant.p3897e.p3921j.C52321nk) r2
            r6.getClass()
            r2.f137333f = r6
            com.google.assistant.e.j.nk r2 = r9.f259392d
            com.google.assistant.e.j.pj r2 = r2.f137331d
            if (r2 != 0) goto L_0x010d
            com.google.assistant.e.j.pj r2 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x010d:
            int r2 = r2.f137437b
            java.lang.String r3 = ""
            r4 = 2
            if (r2 != r4) goto L_0x0152
            com.google.assistant.e.j.pj r2 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.pi r2 = (com.google.assistant.p3897e.p3921j.C52373pi) r2
            com.google.assistant.e.j.nk r5 = r9.f259392d
            com.google.assistant.e.j.pj r5 = r5.f137331d
            if (r5 != 0) goto L_0x0124
            com.google.assistant.e.j.pj r5 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x0124:
            int r6 = r5.f137437b
            if (r6 != r4) goto L_0x012d
            java.lang.Object r5 = r5.f137438c
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x012e
        L_0x012d:
            r5 = r3
        L_0x012e:
            java.lang.String r5 = android.telephony.PhoneNumberUtils.normalizeNumber(r5)
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.e.j.pj r6 = (com.google.assistant.p3897e.p3921j.C52374pj) r6
            r5.getClass()
            r6.f137437b = r4
            r6.f137438c = r5
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.assistant.e.j.nk r5 = (com.google.assistant.p3897e.p3921j.C52321nk) r5
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.pj r2 = (com.google.assistant.p3897e.p3921j.C52374pj) r2
            r2.getClass()
            r5.f137331d = r2
        L_0x0152:
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.nk r1 = (com.google.assistant.p3897e.p3921j.C52321nk) r1
            r9.f259392d = r1
            com.google.assistant.e.c.c.gh r1 = r1.f137333f
            if (r1 != 0) goto L_0x0160
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0160:
            int r2 = r1.f133012b
            if (r2 != r12) goto L_0x0169
            java.lang.Object r1 = r1.f133013c
            com.google.assistant.e.c.c.ev r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r1
            goto L_0x016b
        L_0x0169:
            com.google.assistant.e.c.c.ev r1 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x016b:
            java.lang.String r1 = r1.f132944b
            com.google.common.o.ap r2 = com.google.common.p4552o.C59589ap.f159543d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.ao r2 = (com.google.common.p4552o.C59588ao) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.common.o.ap r5 = (com.google.common.p4552o.C59589ap) r5
            r1.getClass()
            int r6 = r5.f159545a
            r6 = r6 | r12
            r5.f159545a = r6
            r5.f159546b = r1
            android.content.Context r1 = r9.f259391c
            boolean r1 = com.google.android.apps.gsa.staticplugins.accl.performers.communication.C92998ai.m153059d(r1)
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.common.o.ap r5 = (com.google.common.p4552o.C59589ap) r5
            int r6 = r5.f159545a
            r6 = r6 | r4
            r5.f159545a = r6
            r5.f159547c = r1
            com.google.protobuf.bv r1 = r2.build()
            com.google.common.o.ap r1 = (com.google.common.p4552o.C59589ap) r1
            com.google.common.o.cb r2 = com.google.common.p4552o.C59687cb.f160034bf
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.aj r2 = (com.google.common.p4552o.C59582aj) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.common.o.cb r5 = (com.google.common.p4552o.C59687cb) r5
            r1.getClass()
            r5.f160113ay = r1
            int r1 = r5.f160122c
            r6 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r6
            r5.f160122c = r1
            j$.util.Optional r1 = com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a.m153295a(r18)
            boolean r5 = r1.isPresent()
            if (r5 == 0) goto L_0x01dd
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.common.o.cb r5 = (com.google.common.p4552o.C59687cb) r5
            r1.getClass()
            int r6 = r5.f160062a
            r6 = r6 | 4
            r5.f160062a = r6
            r5.f160127h = r1
        L_0x01dd:
            com.google.protobuf.bv r1 = r2.build()
            com.google.common.o.cb r1 = (com.google.common.p4552o.C59687cb) r1
            com.google.android.apps.gsa.shared.logger.b.f r2 = new com.google.android.apps.gsa.shared.logger.b.f
            r2.<init>()
            if (r1 == 0) goto L_0x01ec
            r2.f246203c = r1
        L_0x01ec:
            dagger.a r1 = r9.f259408u
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90025cd.f248163u
            boolean r1 = r1.mo79746e(r5)
            if (r1 == 0) goto L_0x0229
            com.google.assistant.e.j.nk r1 = r9.f259392d
            java.lang.String r1 = r1.f137332e
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0229
            com.google.assistant.e.j.nk r1 = r9.f259392d
            java.lang.String r5 = r1.f137332e
            com.google.assistant.e.c.c.gh r1 = r1.f137333f
            if (r1 != 0) goto L_0x0210
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0210:
            int r6 = r1.f133012b
            if (r6 != r12) goto L_0x0219
            java.lang.Object r1 = r1.f133013c
            com.google.assistant.e.c.c.ev r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r1
            goto L_0x021b
        L_0x0219:
            com.google.assistant.e.c.c.ev r1 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x021b:
            java.lang.String r1 = r1.f132944b
            com.google.android.libraries.gsa.k.g r6 = r9.f259406s
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.t r7 = new com.google.android.apps.gsa.staticplugins.accl.performers.communication.t
            r7.<init>(r9, r5, r1)
            java.lang.String r1 = "Querying ShortcutAPI"
            r6.mo28207g(r1, r7)
        L_0x0229:
            com.google.assistant.e.j.nk r1 = r9.f259392d
            java.lang.String r6 = r1.f137334g
            int r5 = r1.f137328a
            if (r5 != r13) goto L_0x03a9
            java.lang.Object r0 = r1.f137329b
            com.google.assistant.e.j.nb r0 = (com.google.assistant.p3897e.p3921j.C52312nb) r0
            com.google.protobuf.cq r1 = r0.f137314a
            java.lang.String r0 = r0.f137315b
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r12 != r5) goto L_0x0241
            java.lang.String r0 = "image/*"
        L_0x0241:
            r5 = r0
            boolean r0 = m153033i(r5)
            if (r0 == 0) goto L_0x024b
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_AUDIO_MSG
            goto L_0x024d
        L_0x024b:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_ATTACHMENTS_SHARE
        L_0x024d:
            dagger.a r7 = r9.f259394f
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r7 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r7
            r2.f246201a = r0
            com.google.android.apps.gsa.shared.logger.b.g r0 = r2.mo83699a()
            r7.mo74236a(r0)
            boolean r0 = m153033i(r5)
            r2 = 0
            if (r0 == 0) goto L_0x0313
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.assistant.e.j.nk r1 = r9.f259392d
            com.google.assistant.e.c.c.gh r6 = r1.f137333f
            if (r6 != 0) goto L_0x0277
            com.google.assistant.e.c.c.gh r6 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0277:
            com.google.assistant.e.j.pj r1 = r1.f137331d
            if (r1 != 0) goto L_0x027d
            com.google.assistant.e.j.pj r1 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x027d:
            int r7 = r1.f137437b
            if (r7 != r4) goto L_0x0286
            java.lang.Object r1 = r1.f137438c
            java.lang.String r1 = (java.lang.String) r1
            r3 = r1
        L_0x0286:
            int r1 = r6.f133012b
            if (r1 != r12) goto L_0x028f
            java.lang.Object r1 = r6.f133013c
            com.google.assistant.e.c.c.ev r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r1
            goto L_0x0291
        L_0x028f:
            com.google.assistant.e.c.c.ev r1 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0291:
            java.lang.String r1 = r1.f132944b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x02c2
            com.google.android.apps.gsa.search.core.al.dt.a r1 = new com.google.android.apps.gsa.search.core.al.dt.a
            r1.<init>()
            r1.f231280a = r5
            java.lang.String[] r4 = new java.lang.String[r12]
            r4[r2] = r3
            r1.f231283d = r4
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            r1.f231282c = r0
            com.google.android.apps.gsa.search.core.al.dt.b r0 = r1.mo78984a()
            com.google.common.util.concurrent.cx r1 = r9.mo87501d(r0, r2)
            r2 = 0
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_AUDIO_SUCCESS
            r0 = r16
            r4 = r17
            r5 = r18
            com.google.common.util.concurrent.cx r0 = r0.m153035o(r1, r2, r3, r4, r5)
            goto L_0x0312
        L_0x02c2:
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89846n(r0)
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer$ResultReceiverCallback r0 = new com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer$ResultReceiverCallback
            r0.<init>()
            r9.f259398j = r0
            java.lang.String r5 = ""
            java.lang.String r7 = "audio/*"
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r0)
            r12 = 0
            r13 = 0
            r0 = r16
            r1 = r6
            r2 = r3
            r3 = r5
            r5 = r7
            r6 = r8
            r7 = r12
            r8 = r13
            boolean r0 = r0.mo87507k(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x02f8
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer$ResultReceiverCallback r0 = r9.f259398j
            com.google.common.util.concurrent.SettableFuture r1 = r0.f259412a
            r2 = 0
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_AUDIO_SUCCESS
            r0 = r16
            r4 = r17
            r5 = r18
            com.google.common.util.concurrent.cx r0 = r0.m153035o(r1, r2, r3, r4, r5)
            goto L_0x0312
        L_0x02f8:
            com.google.android.apps.gsa.shared.ag.e.o r0 = r9.f259397i
            java.lang.String r1 = r10.f135936b
            java.lang.String r2 = "SEND_MSG_FAILED"
            com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a.m153296b(r0, r11, r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_MSG_FAILED
            r9.mo87504g(r0, r11)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            java.lang.String r1 = "Failed to send audio message."
            com.google.assistant.e.j.ec r0 = m153032b(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0312:
            return r0
        L_0x0313:
            int r0 = r1.size()
            if (r0 != r12) goto L_0x0345
            boolean r0 = m153038r(r1)
            if (r0 != 0) goto L_0x0320
            goto L_0x0345
        L_0x0320:
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.assistant.e.j.nk r1 = r9.f259392d
            com.google.android.apps.gsa.assistant.shared.s r2 = new com.google.android.apps.gsa.assistant.shared.s
            r2.<init>(r0, r5)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r2)
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            r0 = r16
            r2 = r6
            r4 = r17
            r5 = r18
            com.google.common.util.concurrent.cx r0 = r0.mo87503f(r1, r2, r3, r4, r5)
            return r0
        L_0x0345:
            boolean r0 = m153038r(r1)
            if (r0 == 0) goto L_0x0371
            com.google.assistant.e.j.nk r2 = r9.f259392d
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.u r1 = com.google.android.apps.gsa.staticplugins.accl.performers.communication.C93049u.f259561a
            j$.util.stream.Stream r0 = r0.map(r1)
            j$.util.stream.Collector r1 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r0 = r0.collect(r1)
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            r0 = r16
            r1 = r2
            r2 = r6
            r4 = r5
            r5 = r17
            r6 = r18
            com.google.common.util.concurrent.cx r0 = r0.m153034n(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0371:
            com.google.assistant.e.j.nk r1 = r9.f259392d
            dagger.a r0 = r9.f259411x
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.al.bw.a r0 = (com.google.android.apps.gsa.search.core.p6519al.p6624bw.C85031a) r0
            int r2 = r1.f137328a
            if (r2 != r13) goto L_0x0384
            java.lang.Object r2 = r1.f137329b
            com.google.assistant.e.j.nb r2 = (com.google.assistant.p3897e.p3921j.C52312nb) r2
            goto L_0x0386
        L_0x0384:
            com.google.assistant.e.j.nb r2 = com.google.assistant.p3897e.p3921j.C52312nb.f137312c
        L_0x0386:
            com.google.protobuf.cq r2 = r2.f137314a
            com.google.common.util.concurrent.cx r0 = r0.mo78661a(r2)
            com.google.common.util.concurrent.bs r0 = com.google.common.util.concurrent.C60838bs.m92859i(r0)
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.o r2 = com.google.android.apps.gsa.staticplugins.accl.performers.communication.C93043o.f259545a
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r0, r2, r3)
            com.google.common.util.concurrent.bs r3 = com.google.common.util.concurrent.C60838bs.m92859i(r0)
            r0 = r16
            r2 = r6
            r4 = r5
            r5 = r17
            r6 = r18
            com.google.common.util.concurrent.cx r0 = r0.m153034n(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x03a9:
            r3 = 8
            if (r5 != r3) goto L_0x0410
            dagger.a r1 = r9.f259394f
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_GOOGLE_PHOTO_SHARE
            r2.f246201a = r3
            com.google.android.apps.gsa.shared.logger.b.g r2 = r2.mo83699a()
            r1.mo74236a(r2)
            com.google.assistant.e.j.nk r1 = r9.f259392d
            com.google.common.base.ax r2 = r9.f259407t
            boolean r2 = r2.mo56113h()
            if (r2 != 0) goto L_0x03e5
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Google Photo URI provider unavailable. Sharing screenshot"
            r3 = 13183(0x337f, float:1.8473E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            com.google.common.util.concurrent.cx r3 = r16.mo87500c()
            r0 = r16
            r2 = r6
            r4 = r17
            r5 = r18
            com.google.common.util.concurrent.cx r0 = r0.mo87503f(r1, r2, r3, r4, r5)
            goto L_0x040f
        L_0x03e5:
            com.google.common.base.ax r0 = r9.f259407t
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.assistant.shared.bs r0 = (com.google.android.apps.gsa.assistant.shared.C73847bs) r0
            com.google.common.util.concurrent.cx r0 = r0.mo65333a()
            com.google.common.util.concurrent.bs r0 = com.google.common.util.concurrent.C60838bs.m92859i(r0)
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.s r2 = new com.google.android.apps.gsa.staticplugins.accl.performers.communication.s
            r2.<init>(r9)
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r0, r2, r3)
            com.google.common.util.concurrent.bs r3 = com.google.common.util.concurrent.C60838bs.m92859i(r0)
            r0 = r16
            r2 = r6
            r4 = r17
            r5 = r18
            com.google.common.util.concurrent.cx r0 = r0.mo87503f(r1, r2, r3, r4, r5)
        L_0x040f:
            return r0
        L_0x0410:
            r0 = 10
            if (r5 != r0) goto L_0x0491
            java.lang.Object r0 = r1.f137329b
            com.google.assistant.e.j.nh r0 = (com.google.assistant.p3897e.p3921j.C52318nh) r0
            boolean r0 = r0.f137322a
            if (r0 == 0) goto L_0x046c
            com.google.common.base.ax r0 = r9.f259409v
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x046c
            dagger.a r0 = r9.f259394f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SCREENSHOT_SHARE_FALLBACK
            r2.f246201a = r1
            com.google.android.apps.gsa.shared.logger.b.g r1 = r2.mo83699a()
            r0.mo74236a(r1)
            com.google.assistant.e.j.nk r7 = r9.f259392d
            com.google.common.base.ax r0 = r9.f259409v
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.nga.api.i r0 = (com.google.android.apps.gsa.nga.api.C74729i) r0
            com.google.common.util.concurrent.cx r0 = r0.mo71113c()
            com.google.common.util.concurrent.bs r8 = com.google.common.util.concurrent.C60838bs.m92859i(r0)
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.p r12 = new com.google.android.apps.gsa.staticplugins.accl.performers.communication.p
            r0 = r12
            r1 = r16
            r2 = r7
            r3 = r6
            r4 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60922j.m93045h(r8, r12, r0)
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.q r12 = new com.google.android.apps.gsa.staticplugins.accl.performers.communication.q
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Class<java.lang.Exception> r0 = java.lang.Exception.class
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60846c.m92879h(r8, r0, r12, r1)
            return r0
        L_0x046c:
            dagger.a r0 = r9.f259394f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SCREENSHOT_SHARE
            r2.f246201a = r1
            com.google.android.apps.gsa.shared.logger.b.g r1 = r2.mo83699a()
            r0.mo74236a(r1)
            com.google.assistant.e.j.nk r1 = r9.f259392d
            com.google.common.util.concurrent.cx r3 = r16.mo87500c()
            r0 = r16
            r2 = r6
            r4 = r17
            r5 = r18
            com.google.common.util.concurrent.cx r0 = r0.mo87503f(r1, r2, r3, r4, r5)
            return r0
        L_0x0491:
            r0 = 9
            if (r5 == r0) goto L_0x0549
            r0 = 0
            java.lang.String r1 = "INVALID_ARGS"
            r3 = 11
            if (r5 != r3) goto L_0x04f7
            dagger.a r4 = r9.f259394f
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r4 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r4
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_WEB_URL_SHARE
            r2.f246201a = r5
            com.google.android.apps.gsa.shared.logger.b.g r2 = r2.mo83699a()
            r4.mo74236a(r2)
            com.google.assistant.e.j.nk r2 = r9.f259392d
            int r4 = r2.f137328a
            if (r4 != r3) goto L_0x04ba
            java.lang.Object r2 = r2.f137329b
            com.google.assistant.e.j.nj r2 = (com.google.assistant.p3897e.p3921j.C52320nj) r2
            goto L_0x04bc
        L_0x04ba:
            com.google.assistant.e.j.nj r2 = com.google.assistant.p3897e.p3921j.C52320nj.f137323b
        L_0x04bc:
            java.lang.String r2 = r2.f137325a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x04db
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_INVALID_ARGS
            r9.mo87504g(r2, r11)
            com.google.android.apps.gsa.shared.ag.e.o r2 = r9.f259397i
            java.lang.String r3 = r10.f135936b
            com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a.m153296b(r2, r11, r3, r1)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x04db:
            com.google.assistant.e.j.nk r1 = r9.f259392d
            int r0 = r1.f137328a
            if (r0 != r3) goto L_0x04e6
            java.lang.Object r0 = r1.f137329b
            com.google.assistant.e.j.nj r0 = (com.google.assistant.p3897e.p3921j.C52320nj) r0
            goto L_0x04e8
        L_0x04e6:
            com.google.assistant.e.j.nj r0 = com.google.assistant.p3897e.p3921j.C52320nj.f137323b
        L_0x04e8:
            java.lang.String r2 = r0.f137325a
            boolean r3 = r1.f137335h
            r0 = r16
            r4 = r17
            r5 = r18
            com.google.common.util.concurrent.cx r0 = r0.mo87502e(r1, r2, r3, r4, r5)
            return r0
        L_0x04f7:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L_0x0526
            com.google.assistant.e.j.nk r3 = r9.f259392d
            int r3 = r3.f137336i
            int r3 = com.google.assistant.p3897e.p3921j.C52309mz.m86567a(r3)
            if (r3 != 0) goto L_0x0508
            goto L_0x0509
        L_0x0508:
            r12 = r3
        L_0x0509:
            com.google.common.base.ax r3 = m153039s(r12)
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x0514
            goto L_0x0526
        L_0x0514:
            com.google.android.apps.gsa.shared.ag.e.o r2 = r9.f259397i
            java.lang.String r3 = r10.f135936b
            com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a.m153296b(r2, r11, r3, r1)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x0526:
            dagger.a r0 = r9.f259394f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_TEXT_MSG
            r2.f246201a = r1
            com.google.android.apps.gsa.shared.logger.b.g r1 = r2.mo83699a()
            r0.mo74236a(r1)
            com.google.assistant.e.j.nk r1 = r9.f259392d
            boolean r3 = r1.f137335h
            r0 = r16
            r2 = r6
            r4 = r17
            r5 = r18
            com.google.common.util.concurrent.cx r0 = r0.mo87502e(r1, r2, r3, r4, r5)
            return r0
        L_0x0549:
            dagger.a r0 = r9.f259394f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_LOCATION_SHARE
            r2.f246201a = r1
            com.google.android.apps.gsa.shared.logger.b.g r1 = r2.mo83699a()
            r0.mo74236a(r1)
            com.google.assistant.e.j.nk r1 = r9.f259392d
            boolean r3 = r1.f137335h
            r0 = r16
            r2 = r6
            r4 = r17
            r5 = r18
            com.google.common.util.concurrent.cx r0 = r0.mo87502e(r1, r2, r3, r4, r5)
            return r0
        L_0x056c:
            com.google.android.libraries.gsa.conversation.clientop.d r0 = new com.google.android.libraries.gsa.conversation.clientop.d
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final C60870cx mo87500c() {
        return this.f259403p.mo28201a("Take screenshot", new C93050v(this));
    }

    /* renamed from: d */
    public final C60870cx mo87501d(C85458b bVar, boolean z) {
        ((C89859i) this.f259394f.mo27525b()).mo83702b(C89849ae.OPA_CHAT_PERFORMER_XMS_WORKER_STARTED);
        return C60846c.m92878g(C60922j.m93045h(C60838bs.m92859i(this.f259402o.mo78985a(bVar)), new C93052x(this, z, bVar), C60826bg.f164896a), Exception.class, new C93053y(this), C60826bg.f164896a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.common.util.concurrent.SettableFuture} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo87502e(com.google.assistant.p3897e.p3921j.C52321nk r11, java.lang.String r12, boolean r13, com.google.assistant.p3897e.p3921j.C51809dy r14, com.google.android.libraries.gsa.conversation.clientop.C22434e r15) {
        /*
            r10 = this;
            com.google.assistant.e.c.c.gh r0 = r11.f137333f
            if (r0 != 0) goto L_0x0006
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0006:
            r2 = r0
            com.google.assistant.e.j.pj r0 = r11.f137331d
            if (r0 != 0) goto L_0x000d
            com.google.assistant.e.j.pj r0 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x000d:
            int r1 = r0.f137437b
            r3 = 2
            java.lang.String r4 = ""
            if (r1 != r3) goto L_0x001a
            java.lang.Object r0 = r0.f137438c
            java.lang.String r0 = (java.lang.String) r0
            r3 = r0
            goto L_0x001b
        L_0x001a:
            r3 = r4
        L_0x001b:
            int r0 = r2.f133012b
            r1 = 1
            if (r0 != r1) goto L_0x0025
            java.lang.Object r0 = r2.f133013c
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0
            goto L_0x0027
        L_0x0025:
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0027:
            java.lang.String r0 = r0.f132944b
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            r6 = 0
            r7 = 0
            java.lang.String r8 = "INVALID_ARGS"
            if (r5 == 0) goto L_0x0077
            com.google.common.f.e r11 = f259389a
            com.google.common.f.x r0 = r11.mo56224b()
            java.lang.String r2 = "Empty provider, send text message"
            r4 = 13179(0x337b, float:1.8468E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0068
            com.google.common.f.x r11 = r11.mo56225c()
            java.lang.String r12 = "Invalid args without recipient phone number."
            r13 = 13180(0x337c, float:1.8469E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r12)
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_INVALID_ARGS
            r10.mo87504g(r11, r15)
            com.google.android.apps.gsa.shared.ag.e.o r11 = r10.f259397i
            java.lang.String r12 = r14.f135936b
            com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a.m153296b(r11, r15, r12, r8)
            com.google.assistant.e.j.kf r11 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r11 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r11, r7)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        L_0x0068:
            java.lang.String[] r11 = new java.lang.String[r1]
            r11[r6] = r3
            com.google.android.apps.gsa.search.core.al.dt.b r11 = com.google.android.apps.gsa.search.core.p6519al.p6727dt.C85459c.m137059a(r11, r12)
            com.google.common.util.concurrent.cx r11 = r10.mo87501d(r11, r13)
        L_0x0074:
            r2 = r11
            goto L_0x0242
        L_0x0077:
            java.lang.String r5 = "com.google.android.talk"
            boolean r9 = com.google.common.base.C58890d.m90990e(r5, r0)
            if (r9 == 0) goto L_0x0120
            dagger.a r13 = r10.f259405r
            java.lang.String r13 = m153037q(r13)
            java.lang.String r11 = com.google.android.apps.gsa.staticplugins.accl.performers.communication.C92998ai.m153057b(r11)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x00b3
            com.google.common.f.e r11 = f259389a
            com.google.common.f.x r11 = r11.mo56225c()
            java.lang.String r12 = "Invalid args without sender Email."
            r13 = 13178(0x337a, float:1.8466E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r12)
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_INVALID_ARGS
            r10.mo87504g(r11, r15)
            com.google.android.apps.gsa.shared.ag.e.o r11 = r10.f259397i
            java.lang.String r12 = r14.f135936b
            com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a.m153296b(r11, r15, r12, r8)
            com.google.assistant.e.j.kf r11 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r11 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r11, r7)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        L_0x00b3:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x00fc
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.SENDTO"
            r0.<init>(r1)
            java.lang.String r1 = "vnd.google.android.hangouts/vnd.google.android.hangout_privileged"
            android.content.Intent r0 = r0.setType(r1)
            android.content.Intent r0 = r0.setPackage(r5)
            java.lang.String r1 = "account_name"
            android.content.Intent r13 = r0.putExtra(r1, r13)
            java.lang.String r0 = "participant_gaia"
            android.content.Intent r11 = r13.putExtra(r0, r11)
            java.lang.String r13 = "android.intent.extra.TEXT"
            android.content.Intent r11 = r11.putExtra(r13, r12)
            r12 = 32768(0x8000, float:4.5918E-41)
            android.content.Intent r11 = r11.addFlags(r12)
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r11 = r11.addFlags(r12)
            r12 = 262144(0x40000, float:3.67342E-40)
            android.content.Intent r11 = r11.addFlags(r12)
            com.google.android.libraries.gsa.conversation.h.ah r12 = r10.f259390b
            r12.mo27807a(r11)
            com.google.android.apps.gsa.x.c r11 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            goto L_0x0074
        L_0x00fc:
            com.google.common.f.e r11 = f259389a
            com.google.common.f.x r11 = r11.mo56225c()
            java.lang.String r12 = "Invalid args without recipient gaia."
            r13 = 13177(0x3379, float:1.8465E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r12)
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_INVALID_ARGS
            r10.mo87504g(r11, r15)
            com.google.android.apps.gsa.shared.ag.e.o r11 = r10.f259397i
            java.lang.String r12 = r14.f135936b
            com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a.m153296b(r11, r15, r12, r8)
            com.google.assistant.e.j.kf r11 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r11 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r11, r7)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        L_0x0120:
            java.lang.String r5 = "com.whatsapp"
            boolean r5 = com.google.common.base.C58890d.m90990e(r5, r0)
            if (r5 == 0) goto L_0x0138
            if (r13 == 0) goto L_0x0137
            com.google.common.base.b r11 = com.google.common.base.C58836b.f156633a
            r10.mo87508l(r2, r3, r12, r11)
            com.google.android.apps.gsa.x.c r11 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            goto L_0x0074
        L_0x0137:
            r13 = 0
        L_0x0138:
            java.lang.String r5 = "com.google.android.apps.dynamite"
            boolean r0 = com.google.common.base.C58890d.m90990e(r5, r0)
            if (r0 == 0) goto L_0x0229
            dagger.a r0 = r10.f259405r
            java.lang.String r0 = m153037q(r0)
            com.google.assistant.e.j.pj r2 = r11.f137331d
            if (r2 != 0) goto L_0x014c
            com.google.assistant.e.j.pj r2 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x014c:
            int r3 = r2.f137437b
            if (r3 != r1) goto L_0x0155
            java.lang.Object r1 = r2.f137438c
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0156
        L_0x0155:
            r1 = r4
        L_0x0156:
            java.lang.String r1 = com.google.common.base.C58890d.m90988c(r1)
            com.google.assistant.e.j.pj r11 = r11.f137331d
            if (r11 != 0) goto L_0x0161
            com.google.assistant.e.j.pj r2 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            goto L_0x0162
        L_0x0161:
            r2 = r11
        L_0x0162:
            int r3 = r2.f137437b
            r5 = 6
            if (r3 != r5) goto L_0x016c
            java.lang.Object r2 = r2.f137438c
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
        L_0x016c:
            if (r11 != 0) goto L_0x0170
            com.google.assistant.e.j.pj r11 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x0170:
            java.lang.String r11 = r11.f137439d
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x018b
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 != 0) goto L_0x018b
            com.google.common.d.a r2 = new com.google.common.d.a
            r2.<init>(r11)
            boolean r2 = r2.f156807c
            if (r2 == 0) goto L_0x018b
            java.lang.String r1 = com.google.common.base.C58890d.m90988c(r11)
        L_0x018b:
            boolean r11 = android.text.TextUtils.isEmpty(r1)
            if (r11 == 0) goto L_0x01b5
            com.google.common.f.e r11 = f259389a
            com.google.common.f.x r11 = r11.mo56225c()
            java.lang.String r12 = "Invalid args without recipient email."
            r13 = 13176(0x3378, float:1.8464E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r12)
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_INVALID_ARGS
            r10.mo87504g(r11, r15)
            com.google.android.apps.gsa.shared.ag.e.o r11 = r10.f259397i
            java.lang.String r12 = r14.f135936b
            com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a.m153296b(r11, r15, r12, r8)
            com.google.assistant.e.j.kf r11 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r11 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r11, r7)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        L_0x01b5:
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 != 0) goto L_0x01d5
            boolean r11 = r12.isEmpty()
            if (r11 != 0) goto L_0x01d5
            if (r13 != 0) goto L_0x01d5
            com.google.assistant.e.j.nk r11 = r10.f259392d
            if (r11 != 0) goto L_0x01c8
            goto L_0x01d5
        L_0x01c8:
            java.lang.String r12 = "chat_message_args"
            java.lang.String r13 = "assistant.api.client_op.ChatMessageArgs"
            com.google.assistant.e.j.ec r11 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41821a(r12, r13, r11)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        L_0x01d5:
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x0205
            boolean r11 = r12.isEmpty()
            if (r11 == 0) goto L_0x01ec
            com.google.android.libraries.x.a.a.b r11 = r10.f259410w
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89846n(r1)
            android.content.Intent r11 = r11.mo47369a(r0, r12)
            goto L_0x01f6
        L_0x01ec:
            com.google.android.libraries.x.a.a.b r11 = r10.f259410w
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89846n(r1)
            android.content.Intent r11 = r11.mo47370b(r0, r13, r12)
        L_0x01f6:
            com.google.android.libraries.gsa.conversation.h.ah r12 = r10.f259390b
            com.google.android.libraries.gsa.conversation.h.ag r13 = com.google.android.libraries.gsa.conversation.p1855h.C22695ah.f62473a
            r12.mo27810d(r11, r13)
            com.google.android.apps.gsa.x.c r11 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            goto L_0x0074
        L_0x0205:
            com.google.common.f.e r11 = f259389a
            com.google.common.f.x r11 = r11.mo56225c()
            java.lang.String r12 = "Invalid args without sender email."
            r13 = 13175(0x3377, float:1.8462E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r12)
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_INVALID_ARGS
            r10.mo87504g(r11, r15)
            com.google.android.apps.gsa.shared.ag.e.o r11 = r10.f259397i
            java.lang.String r12 = r14.f135936b
            com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a.m153296b(r11, r15, r12, r8)
            com.google.assistant.e.j.kf r11 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r11 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r11, r7)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        L_0x0229:
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer$ResultReceiverCallback r11 = new com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer$ResultReceiverCallback
            r11.<init>()
            r10.f259398j = r11
            com.google.common.util.concurrent.SettableFuture r0 = r11.f259412a
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r11)
            r1 = r10
            r4 = r12
            r7 = r13
            boolean r11 = r1.mo87506j(r2, r3, r4, r5, r6, r7)
            if (r11 == 0) goto L_0x025a
            r2 = r0
        L_0x0242:
            com.google.common.f.e r11 = f259389a
            com.google.common.f.x r11 = r11.mo56224b()
            java.lang.String r12 = "Send message executed."
            r13 = 13173(0x3375, float:1.846E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r12)
            r3 = 1
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_TEXT_SUCCESS
            r1 = r10
            r5 = r14
            r6 = r15
            com.google.common.util.concurrent.cx r11 = r1.m153035o(r2, r3, r4, r5, r6)
            return r11
        L_0x025a:
            com.google.common.f.e r11 = f259389a
            com.google.common.f.x r11 = r11.mo56225c()
            java.lang.String r12 = "Failed to send the message. UNKNOWN ERROR."
            r13 = 13174(0x3376, float:1.8461E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r12)
            com.google.android.apps.gsa.shared.ag.e.o r11 = r10.f259397i
            java.lang.String r12 = r14.f135936b
            java.lang.String r13 = "SEND_MSG_FAILED"
            com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a.m153296b(r11, r15, r12, r13)
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_MSG_FAILED
            r10.mo87504g(r11, r15)
            com.google.assistant.e.j.kf r11 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            java.lang.String r12 = "Unknown error"
            com.google.assistant.e.j.ec r11 = m153032b(r11, r12)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer.mo87502e(com.google.assistant.e.j.nk, java.lang.String, boolean, com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }

    /* renamed from: f */
    public final C60870cx mo87503f(C52321nk nkVar, String str, C60870cx cxVar, C51809dy dyVar, C22434e eVar) {
        C51058ev evVar;
        if (this.f259392d != null) {
            C51098gh ghVar = nkVar.f137333f;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            C51098gh ghVar2 = ghVar;
            C52374pj pjVar = nkVar.f137331d;
            if (pjVar == null) {
                pjVar = C52374pj.f137434e;
            }
            String str2 = pjVar.f137437b == 2 ? (String) pjVar.f137438c : BuildConfig.FLAVOR;
            String b = C92998ai.m153057b(this.f259392d);
            if (ghVar2.f133012b == 1) {
                evVar = (C51058ev) ghVar2.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            String str3 = evVar.f132944b;
            if (!TextUtils.isEmpty(str2) || !b.isEmpty()) {
                return m153035o(C60922j.m93045h(C60838bs.m92859i(cxVar), new C93040l(this, str3, str2, str, ghVar2, nkVar), C60826bg.f164896a), false, C89849ae.OPA_CHAT_PERFORMER_SHARE_CONTENT_SUCCESS, dyVar, eVar);
            }
            ((C59052c) ((C59052c) f259389a.mo56225c()).mo56372aa(13181)).mo56386p("Invalid args without recipient phone number or app unique id.");
            mo87504g(C89849ae.OPA_CHAT_PERFORMER_INVALID_ARGS, eVar);
            C93223a.m153296b(this.f259397i, eVar, dyVar.f135936b, "INVALID_ARGS");
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, (String) null));
        }
        ((C89859i) this.f259394f.mo27525b()).mo83702b(C89849ae.OPA_CHAT_PERFORMER_NULL_CHAT_ARGS);
        throw new RuntimeException("ChatArgs is null. Can't share URI.");
    }

    /* renamed from: g */
    public final void mo87504g(C89849ae aeVar, C22434e eVar) {
        C89857g gVar;
        C89859i iVar = (C89859i) this.f259394f.mo27525b();
        Optional a = C93223a.m153295a(eVar);
        if (a.isPresent()) {
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            String str = (String) a.get();
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            str.getClass();
            cbVar.f160062a |= 4;
            cbVar.f160127h = str;
            C89856f fVar = new C89856f();
            fVar.f246201a = aeVar;
            fVar.f246203c = (C59687cb) ajVar.build();
            gVar = fVar.mo83699a();
        } else {
            C89856f fVar2 = new C89856f();
            fVar2.f246201a = aeVar;
            gVar = fVar2.mo83699a();
        }
        iVar.mo74236a(gVar);
    }

    /* renamed from: h */
    public final void mo87505h() {
        C92996ag agVar;
        if (((C86124t) this.f259408u.mo27525b()).mo79746e(C90025cd.f248156n) && (agVar = this.f259399k) != null) {
            try {
                this.f259391c.unbindService(agVar);
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) f259389a.mo56225c()).mo56382g(e)).mo56372aa(13184)).mo56386p("Exception received during unbindService call");
            }
        }
    }

    /* renamed from: j */
    public final boolean mo87506j(C51098gh ghVar, String str, String str2, C58833ax axVar, C58833ax axVar2, boolean z) {
        C51058ev evVar;
        C51058ev evVar2;
        if (this.f259392d == null) {
            return false;
        }
        String replace = str.replace("+", BuildConfig.FLAVOR);
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        String str3 = evVar.f132944b;
        Intent addFlags = new Intent("com.google.android.voicesearch.SEND_MESSAGE_TO_CONTACTS").setPackage(str3).setType(m153036p(axVar)).putExtra("android.intent.extra.TEXT", str2).putExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_NAME", replace).putExtra("EXPECT_EXTERNAL_APP_UI", axVar.mo56113h()).putExtra("EXPECT_EXTERNAL_CONFIRMATION", z).putExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID", C92998ai.m153057b(this.f259392d)).putExtra("android.intent.extra.REFERRER_NAME", "android-app://com.google.android.googlequicksearchbox/https/www.google.com").putExtra("opa_allow_launch_intent_on_lockscreen", true).addFlags(32768).addFlags(268435456);
        int a = C52309mz.m86567a(this.f259392d.f137336i);
        if (a == 0) {
            a = 1;
        }
        C58833ax s = m153039s(a);
        if (s.mo56113h()) {
            addFlags.putExtra("FOCUS_ON_FIELD", (String) s.mo56107c());
        }
        addFlags.putExtra("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER", C92998ai.m153056a((ResultReceiver) ((C58847bk) axVar2).f156646a));
        if (axVar.mo56113h()) {
            addFlags.putExtra("android.intent.extra.STREAM", ((C73846br) axVar.mo56107c()).mo65331a()).addFlags(1);
        }
        if (!this.f259400l.mo85355d(this.f259391c, addFlags)) {
            ((C59052c) ((C59052c) f259389a.mo56225c()).mo56372aa(13186)).mo56389s("Unable to sign intent with package %s", addFlags.getPackage());
            return false;
        }
        if (!z) {
            if ("com.whatsapp".equals(str3)) {
                PackageManager packageManager = this.f259404q;
                if (C22535l.m41989a(C22535l.m41990b(addFlags, packageManager), packageManager).isEmpty()) {
                    ((C59052c) ((C59052c) f259389a.mo56225c()).mo56372aa(13185)).mo56389s("Intent not supported to send msg with package %s using private API", str3);
                    return false;
                }
            }
            if (!axVar.mo56113h()) {
                addFlags.addFlags(C89885b.HTTP_VALUE);
            }
        }
        if (!C92998ai.m153060e(addFlags, str3, this.f259404q)) {
            return false;
        }
        if (axVar.mo56113h()) {
            this.f259391c.grantUriPermission(str3, ((C73846br) axVar.mo56107c()).mo65331a(), 1);
        }
        ((C89859i) this.f259394f.mo27525b()).mo83702b(C89849ae.OPA_CHAT_PERFORMER_MSG_PRIVATE_INTENT_SENT);
        if (((C86124t) this.f259408u.mo27525b()).mo79746e(C90025cd.f248156n) && "com.whatsapp".equals(str3)) {
            Intent intent = new Intent().setAction("com.google.android.voicesearch.SEND_MESSAGE_TO_CONTACTS_SERVICE").setPackage(str3);
            for (C51098gh ghVar2 : C22535l.m41991c(intent, this.f259404q)) {
                if (ghVar2.f133012b == 1) {
                    evVar2 = (C51058ev) ghVar2.f133013c;
                } else {
                    evVar2 = C51058ev.f132941o;
                }
                if (C58890d.m90990e(str3, evVar2.f132944b)) {
                    C92996ag agVar = new C92996ag(addFlags, axVar2);
                    this.f259399k = agVar;
                    return this.f259391c.bindService(intent, agVar, 1);
                }
            }
        }
        return this.f259390b.mo27807a(addFlags);
    }

    /* renamed from: k */
    public final boolean mo87507k(C51098gh ghVar, String str, String str2, C58485gu guVar, String str3, C58833ax axVar, boolean z, boolean z2) {
        C51058ev evVar;
        if (this.f259392d == null) {
            return false;
        }
        String replace = str.replace("+", BuildConfig.FLAVOR);
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        String str4 = evVar.f132944b;
        Intent addFlags = new Intent("com.google.android.voicesearch.SEND_MESSAGE_TO_CONTACTS").setPackage(str4).setType(str3).putExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_NAME", replace).putExtra("android.intent.extra.TEXT", str2).putExtra("EXPECT_EXTERNAL_APP_UI", z2).putExtra("EXPECT_EXTERNAL_CONFIRMATION", z).putExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID", C92998ai.m153057b(this.f259392d)).putExtra("android.intent.extra.REFERRER_NAME", "android-app://com.google.android.googlequicksearchbox/https/www.google.com").putExtra("opa_allow_launch_intent_on_lockscreen", true).addFlags(32768).addFlags(268435456);
        addFlags.putExtra("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER", C92998ai.m153056a((ResultReceiver) ((C58847bk) axVar).f156646a));
        if (m153033i(str3) && str4.equals("com.whatsapp")) {
            addFlags.setClipData(new ClipData("audio attachment", new String[]{"audio/*"}, new ClipData.Item((Uri) guVar.get(0))));
        } else if (!guVar.isEmpty()) {
            if (guVar.size() == 1) {
                addFlags.putExtra("android.intent.extra.STREAM", (Parcelable) guVar.get(0));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(guVar);
                addFlags.putExtra("SEND_MULTIPLE", true).putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            }
            addFlags.addFlags(1);
        }
        if (!this.f259400l.mo85355d(this.f259391c, addFlags)) {
            ((C59052c) ((C59052c) f259389a.mo56225c()).mo56372aa(13187)).mo56389s("Unable to sign intent with package %s", addFlags.getPackage());
            return false;
        }
        if (!z && (guVar.isEmpty() || m153033i(str3))) {
            addFlags.addFlags(C89885b.HTTP_VALUE);
        }
        if (!C92998ai.m153060e(addFlags, str4, this.f259404q)) {
            return false;
        }
        Collection.EL.stream(guVar).forEach(new C93051w(this, str4));
        return this.f259390b.mo27807a(addFlags);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0041;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87508l(com.google.assistant.p3897e.p3902c.p3907c.C51098gh r5, java.lang.String r6, java.lang.String r7, com.google.common.base.C58833ax r8) {
        /*
            r4 = this;
            com.google.assistant.e.j.nk r0 = r4.f259392d
            r1 = 0
            if (r0 == 0) goto L_0x00fb
            int r0 = r5.f133012b
            r2 = 1
            if (r0 != r2) goto L_0x000f
            java.lang.Object r5 = r5.f133013c
            com.google.assistant.e.c.c.ev r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r5
            goto L_0x0011
        L_0x000f:
            com.google.assistant.e.c.c.ev r5 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0011:
            java.lang.String r5 = r5.f132944b
            com.google.assistant.e.j.nk r0 = r4.f259392d
            java.lang.String r0 = com.google.android.apps.gsa.staticplugins.accl.performers.communication.C92998ai.m153057b(r0)
            java.lang.String r3 = "com.whatsapp"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0022
            return r1
        L_0x0022:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x003b
            java.lang.String r5 = "+"
            java.lang.String r0 = ""
            java.lang.String r5 = r6.replace(r5, r0)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r5
            java.lang.String r5 = "%s@s.whatsapp.net"
            java.lang.String r0 = java.lang.String.format(r5, r6)
            goto L_0x0041
        L_0x003b:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x00fb
        L_0x0041:
            com.google.assistant.e.j.nk r5 = r4.f259392d
            int r5 = r5.f137336i
            int r5 = com.google.assistant.p3897e.p3921j.C52309mz.m86567a(r5)
            if (r5 != 0) goto L_0x004c
            r5 = 1
        L_0x004c:
            com.google.common.base.ax r5 = m153039s(r5)
            boolean r5 = r5.mo56113h()
            java.lang.String r6 = "jid"
            if (r5 == 0) goto L_0x009f
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L_0x009f
            java.lang.String r5 = "smsto:"
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r5 = r5.concat(r7)
            android.net.Uri r5 = android.net.Uri.parse(r5)
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r8 = "android.intent.action.SENDTO"
            r7.<init>(r8, r5)
            dagger.a r5 = r4.f259408u
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251299gG
            boolean r5 = r5.mo79746e(r8)
            if (r5 == 0) goto L_0x00d7
            java.lang.String r5 = "@g.us"
            boolean r5 = r0.endsWith(r5)
            if (r5 == 0) goto L_0x00d7
            java.lang.String r5 = "-"
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L_0x00d7
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r7 = "com.whatsapp.Conversation"
            r5.<init>(r7)
            android.content.Intent r7 = r5.putExtra(r6, r0)
            goto L_0x00d7
        L_0x009f:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.MAIN"
            r5.<init>(r1)
            android.content.Intent r6 = r5.putExtra(r6, r0)
            java.lang.String r0 = "android.intent.extra.TEXT"
            android.content.Intent r6 = r6.putExtra(r0, r7)
            java.lang.String r7 = m153036p(r8)
            android.content.Intent r6 = r6.setType(r7)
            java.lang.String r7 = "android.intent.action.SEND"
            r6.setAction(r7)
            boolean r6 = r8.mo56113h()
            if (r6 == 0) goto L_0x00d6
            java.lang.Object r6 = r8.mo56107c()
            com.google.android.apps.gsa.assistant.shared.br r6 = (com.google.android.apps.gsa.assistant.shared.C73846br) r6
            android.net.Uri r6 = r6.mo65331a()
            java.lang.String r7 = "android.intent.extra.STREAM"
            android.content.Intent r6 = r5.putExtra(r7, r6)
            r6.addFlags(r2)
        L_0x00d6:
            r7 = r5
        L_0x00d7:
            android.content.Intent r5 = r7.setPackage(r3)
            r6 = 32768(0x8000, float:4.5918E-41)
            android.content.Intent r5 = r5.addFlags(r6)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r5.addFlags(r6)
            dagger.a r5 = r4.f259394f
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r5 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r5
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_MSG_PUBLIC_INTENT_SENT
            r5.mo83702b(r6)
            com.google.android.libraries.gsa.conversation.h.ah r5 = r4.f259390b
            boolean r5 = r5.mo27807a(r7)
            return r5
        L_0x00fb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer.mo87508l(com.google.assistant.e.c.c.gh, java.lang.String, java.lang.String, com.google.common.base.ax):boolean");
    }
}
