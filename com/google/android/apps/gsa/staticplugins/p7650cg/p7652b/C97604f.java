package com.google.android.apps.gsa.staticplugins.p7650cg.p7652b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import androidx.core.app.C1786ac;
import androidx.core.app.C1789af;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91760f;
import com.google.android.apps.p489g.p491b.p492a.C9126d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C7947pw;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56956f;
import com.google.p4283bv.p4345d.p4350b.p4352b.C56992b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.cg.b.f */
/* compiled from: PG */
public final class C97604f extends C97599a {

    /* renamed from: b */
    private static final C59071e f272637b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cg.b.f");

    /* renamed from: c */
    private final Collection f272638c;

    public C97604f(C58485gu guVar) {
        super(guVar);
        this.f272638c = guVar;
    }

    /* renamed from: A */
    public final boolean mo85869A(CardRenderingContext cardRenderingContext) {
        return cardRenderingContext.mo49312g();
    }

    /* renamed from: C */
    public final CharSequence mo85871C(Context context) {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: D */
    public final CharSequence mo85872D(Context context) {
        Resources resources = context.getResources();
        C58485gu guVar = this.f272624a;
        guVar.getClass();
        int size = guVar.size();
        C58485gu guVar2 = this.f272624a;
        guVar2.getClass();
        return resources.getQuantityString(R.plurals.reminders, size, new Object[]{Integer.valueOf(guVar2.size())});
    }

    /* renamed from: E */
    public final CharSequence mo85873E() {
        C58485gu<C7718hj> guVar = this.f272624a;
        guVar.getClass();
        for (C7718hj hjVar : guVar) {
            if ((hjVar.f26955a & 32768) != 0) {
                C7947pw pwVar = hjVar.f26979t;
                if (pwVar == null) {
                    pwVar = C7947pw.f27896j;
                }
                return pwVar.f27900c;
            }
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: F */
    public final int mo85874F() {
        C58485gu<C7718hj> guVar = this.f272624a;
        guVar.getClass();
        boolean z = true;
        for (C7718hj hjVar : guVar) {
            if ((hjVar.f26955a & 1073741824) != 0) {
                C7874nd ndVar = hjVar.f26938J;
                if (ndVar == null) {
                    ndVar = C7874nd.f27577J;
                }
                int a = C56956f.m88243a(ndVar.f27591c);
                if (a == 0) {
                    a = 1;
                }
                if (a == 3) {
                    return 3;
                }
                if (a != 5) {
                    z = false;
                }
            }
        }
        if (z) {
            return 5;
        }
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final int mo90756G() {
        return 65544;
    }

    /* renamed from: a */
    public final int mo85875a() {
        return 2;
    }

    /* renamed from: b */
    public final int mo85876b() {
        return R.drawable.ic_reminder;
    }

    /* renamed from: e */
    public final long mo85879e() {
        C58485gu<C7718hj> guVar = this.f272624a;
        guVar.getClass();
        long j = 0;
        for (C7718hj hjVar : guVar) {
            if ((hjVar.f26955a & 1073741824) != 0) {
                C7874nd ndVar = hjVar.f26938J;
                if (ndVar == null) {
                    ndVar = C7874nd.f27577J;
                }
                if ((ndVar.f27589a & 8) != 0) {
                    j = Math.max(ndVar.f27594f, j);
                }
            }
        }
        return j;
    }

    /* renamed from: f */
    public final PendingIntent mo85880f(Context context) {
        return C91760f.m150326a(context, this.f272638c);
    }

    /* renamed from: h */
    public final C1789af mo85882h(Context context) {
        C1786ac acVar = new C1786ac();
        C58485gu<C7718hj> guVar = this.f272624a;
        guVar.getClass();
        for (C7718hj hjVar : guVar) {
            C7947pw pwVar = hjVar.f26979t;
            if (pwVar == null) {
                pwVar = C7947pw.f27896j;
            }
            if ((pwVar.f27898a & 2) != 0) {
                C7947pw pwVar2 = hjVar.f26979t;
                if (pwVar2 == null) {
                    pwVar2 = C7947pw.f27896j;
                }
                acVar.mo4992g(Html.fromHtml(pwVar2.f27900c).toString());
            }
        }
        return acVar;
    }

    /* renamed from: m */
    public final Long mo85887m() {
        C58485gu<C7718hj> guVar = this.f272624a;
        guVar.getClass();
        Long l = null;
        for (C7718hj hjVar : guVar) {
            if ((hjVar.f26955a & 1073741824) != 0) {
                C7874nd ndVar = hjVar.f26938J;
                if (ndVar == null) {
                    ndVar = C7874nd.f27577J;
                }
                if ((ndVar.f27589a & 16) != 0) {
                    long j = ndVar.f27595g;
                    if (l == null || j > l.longValue()) {
                        l = Long.valueOf(j);
                    }
                }
            }
        }
        return l;
    }

    /* renamed from: n */
    public final String mo85888n() {
        return "reminder";
    }

    /* renamed from: o */
    public final String mo85889o() {
        C58485gu<C7718hj> guVar = this.f272624a;
        guVar.getClass();
        for (C7718hj hjVar : guVar) {
            if ((hjVar.f26955a & 1073741824) != 0) {
                C7874nd ndVar = hjVar.f26938J;
                if (ndVar == null) {
                    ndVar = C7874nd.f27577J;
                }
                int i = 1;
                try {
                    C9126d dVar = (C9126d) C62942bv.parseFrom((C62942bv) C9126d.f31412c, ndVar.toByteString(), C62921ba.m95368a());
                    if ((dVar.f31414a & 1) != 0) {
                        return Integer.toString(dVar.f31415b);
                    }
                } catch (C62974ct e) {
                    C59104x d = f272637b.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "MultiReminderNotif");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(22446)).mo56386p("protobuffer parsing exception which should never happen.");
                }
                if ((ndVar.f27589a & 268435456) == 0) {
                    return "0";
                }
                int a = C56992b.m88249a(ndVar.f27580B);
                if (a != 0) {
                    i = a;
                }
                return Integer.toString(i - 1);
            }
        }
        return "0";
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ Collection mo85891q(CardRenderingContext cardRenderingContext) {
        C58485gu guVar = this.f272624a;
        guVar.getClass();
        if (!guVar.isEmpty()) {
            return C58485gu.m89846n(new C97623x(this.f272638c));
        }
        return C58485gu.m89845m();
    }

    /* renamed from: s */
    public final boolean mo85893s() {
        C58485gu<C7718hj> guVar = this.f272624a;
        guVar.getClass();
        for (C7718hj hjVar : guVar) {
            if ((hjVar.f26955a & 1073741824) != 0) {
                C7874nd ndVar = hjVar.f26938J;
                if (ndVar == null) {
                    ndVar = C7874nd.f27577J;
                }
                if (C97624y.m161829L(ndVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    public final boolean mo85896v() {
        return false;
    }

    /* renamed from: w */
    public final boolean mo85897w() {
        C58485gu<C7718hj> guVar = this.f272624a;
        guVar.getClass();
        for (C7718hj hjVar : guVar) {
            if ((hjVar.f26955a & 1073741824) != 0) {
                C7874nd ndVar = hjVar.f26938J;
                if (ndVar == null) {
                    ndVar = C7874nd.f27577J;
                }
                if (ndVar.f27614z) {
                    return true;
                }
            }
        }
        return false;
    }
}
