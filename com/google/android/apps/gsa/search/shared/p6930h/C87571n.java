package com.google.android.apps.gsa.search.shared.p6930h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53284ie;
import com.google.assistant.p3994s.p3995a.C53286ig;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.search.shared.h.n */
/* compiled from: PG */
public final class C87571n {

    /* renamed from: a */
    private static final C59071e f236591a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.h.n");

    /* renamed from: b */
    private final C58833ax f236592b;

    /* renamed from: c */
    private final C90021c f236593c;

    public C87571n(C58833ax axVar, C90021c cVar) {
        this.f236592b = axVar;
        this.f236593c = cVar;
    }

    /* renamed from: c */
    public static Intent m142339c(Context context, String str, boolean z, C60218r rVar) {
        C53287ih d;
        Intent intent = new Intent();
        if (!(rVar == null || (d = m142340d(m142343g(str))) == null)) {
            C53275hw hwVar = (C53275hw) d.toBuilder();
            hwVar.copyOnWrite();
            C53287ih ihVar = (C53287ih) hwVar.instance;
            ihVar.f139704j = rVar;
            ihVar.f139695a |= 512;
            str = m142341e(m142342f((C53287ih) hwVar.build()));
        }
        if (str != null) {
            try {
                intent = Intent.parseUri(str, 0);
            } catch (URISyntaxException e) {
                ((C59052c) ((C59052c) ((C59052c) f236591a.mo56226d()).mo56382g(e)).mo56372aa(9821)).mo56386p("#getZeroStateIntent(): Failed to parse url.");
            }
        }
        intent.setClassName(context, "com.google.android.apps.gsa.staticplugins.opa.ZeroStateActivity");
        if (z) {
            intent.setFlags(603979776);
        } else {
            intent.setFlags(268468224);
        }
        return intent;
    }

    /* renamed from: d */
    public static C53287ih m142340d(String str) {
        if (str != null) {
            try {
                return (C53287ih) C62942bv.parseFrom((C62942bv) C53287ih.f139693l, C59326i.f157517e.mo56826f().mo56836k(str), C62921ba.m95368a());
            } catch (C62974ct | IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f236591a.mo56226d()).mo56382g(e)).mo56372aa(9825)).mo56386p("#decodeZeroStateDeepLinkData(): Could not Base64-decode the ZeroStateDeepLinkData.");
                return null;
            }
        } else {
            ((C59052c) ((C59052c) f236591a.mo56226d()).mo56372aa(9824)).mo56386p("#decodeZeroStateDeepLinkData(): base64EncodedString is null");
            return null;
        }
    }

    /* renamed from: e */
    public static String m142341e(String str) {
        if (str == null) {
            return null;
        }
        return "googleassistant://zerostate?data=".concat(str);
    }

    /* renamed from: f */
    public static String m142342f(C53287ih ihVar) {
        if (ihVar == null) {
            return null;
        }
        C59326i f = C59326i.f157517e.mo56826f();
        byte[] byteArray = ihVar.toByteArray();
        return f.mo56837l(byteArray, byteArray.length);
    }

    /* renamed from: g */
    public static String m142343g(String str) {
        if (C58837ba.m90859h(str) || !str.startsWith("googleassistant://zerostate?data=")) {
            return null;
        }
        return str.replace("googleassistant://zerostate?data=", BuildConfig.FLAVOR);
    }

    /* renamed from: o */
    private static Bundle m142344o(String str) {
        String g = m142343g(str);
        if (g == null) {
            ((C59052c) ((C59052c) f236591a.mo56226d()).mo56372aa(9823)).mo56386p("#buildOpaExtras(): Failed to parse the url.");
            return null;
        }
        C53287ih d = m142340d(g);
        if (d == null) {
            ((C59052c) ((C59052c) f236591a.mo56226d()).mo56372aa(9822)).mo56386p("#buildOpaExtras(): Failed to parse the url.");
            return null;
        }
        C87565h hVar = new C87565h();
        boolean z = true;
        hVar.f236499C = true;
        int a = C53284ie.m86806a(d.f139698d);
        if (a == 0 || a != 3) {
            z = false;
        }
        hVar.f236519W = z;
        hVar.f236520X = g;
        hVar.f236560f = 6;
        return hVar.mo81685a();
    }

    /* renamed from: p */
    private static boolean m142345p(Intent intent) {
        if (intent.getComponent() == null) {
            return false;
        }
        ComponentName component = intent.getComponent();
        component.getClass();
        return component.getClassName().equals("com.google.android.apps.gsa.staticplugins.opa.ZeroStateActivity");
    }

    /* renamed from: q */
    private static boolean m142346q(C53287ih ihVar, C90021c cVar) {
        if (ihVar == null) {
            return false;
        }
        int b = C53286ig.m86808b(ihVar.f139703i);
        if (b != 0 && b == 32) {
            return false;
        }
        return cVar.mo79746e(C90014bt.f247381gA);
    }

    /* renamed from: a */
    public final Intent mo81694a(Context context, C53287ih ihVar) {
        return m142339c(context, m142341e(m142342f(ihVar)), m142346q(ihVar, this.f236593c), (C60218r) null);
    }

    /* renamed from: b */
    public final Intent mo81695b(Context context, String str, C60218r rVar) {
        return m142339c(context, str, m142346q(m142340d(m142343g(str)), this.f236593c), rVar);
    }

    /* renamed from: h */
    public final boolean mo81696h(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (m142345p(intent)) {
            return true;
        }
        Uri data = intent.getData();
        return data != null && mo81697i(data.toString());
    }

    /* renamed from: i */
    public final boolean mo81697i(String str) {
        return str != null && str.startsWith("googleassistant://zerostate?data=");
    }

    /* renamed from: j */
    public final void mo81698j(Context context, C53287ih ihVar) {
        String e = m142341e(m142342f(ihVar));
        if (this.f236593c.mo79746e(C90014bt.f247287eM)) {
            mo81702n(context, e, (C60218r) null);
        } else {
            mo81701m(context, m142344o(e));
        }
    }

    /* renamed from: k */
    public final void mo81699k(Context context, C53287ih ihVar, Bundle bundle) {
        if (this.f236593c.mo79746e(C90014bt.f247287eM)) {
            mo81702n(context, m142341e(m142342f(ihVar)), (C60218r) null);
            return;
        }
        C87565h hVar = new C87565h(bundle);
        hVar.f236520X = m142342f(ihVar);
        mo81701m(context, hVar.mo81685a());
    }

    /* renamed from: l */
    public final void mo81700l(Context context, Intent intent, C60218r rVar) {
        if (m142345p(intent)) {
            new C91093c(context).mo65089a(intent);
            return;
        }
        Uri data = intent.getData();
        if (data != null) {
            String uri = data.toString();
            if (this.f236593c.mo79746e(C90014bt.f247287eM)) {
                mo81702n(context, uri, rVar);
            } else {
                mo81701m(context, m142344o(uri));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo81701m(Context context, Bundle bundle) {
        if (bundle == null) {
            ((C59052c) ((C59052c) f236591a.mo56226d()).mo56372aa(9827)).mo56386p("#maybeOpenZeroStateInOpaActivity(): opaExtras is null.");
        } else if (!this.f236592b.mo56113h()) {
            ((C59052c) ((C59052c) f236591a.mo56226d()).mo56372aa(9826)).mo56386p("#maybeOpenZeroStateInOpaActivity(): opaStarter not present.");
        } else {
            ((C87568k) this.f236592b.mo56107c()).mo81689c(context, bundle, 268468224);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo81702n(Context context, String str, C60218r rVar) {
        if (C58837ba.m90859h(str)) {
            ((C59052c) ((C59052c) f236591a.mo56226d()).mo56372aa(9828)).mo56386p("#maybeOpenZeroStateInStandaloneActivity(): url is null or empty.");
            return;
        }
        Intent b = mo81695b(context, str, rVar);
        if (b != null) {
            new C91093c(context).mo65089a(b);
        }
    }
}
