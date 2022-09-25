package com.google.android.apps.gsa.staticplugins.opa.appactions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.shared.appactions.ChatBubbleDialogLayout;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.assistant.shared.appactions.v;
import com.google.android.apps.gsa.assistant.shared.appactions.w;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8288a.C107229a;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8288a.C107231c;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107271b;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d.C107277a;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d.C107279c;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d.C107290n;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e.C107298a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36265d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3825an.p3830c.p3831a.C49255aa;
import com.google.assistant.p3861at.C49823ah;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49837av;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.y */
/* compiled from: PG */
public final class C107324y extends C107251at implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C107238ag f298667a;

    /* renamed from: c */
    private Context f298668c;

    /* renamed from: d */
    private final C2393x f298669d = new C2393x(this);

    /* renamed from: e */
    private boolean f298670e;

    @Deprecated
    public C107324y() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C107324y m178154a(C107271b bVar) {
        C107324y yVar = new C107324y();
        C68324h.m98669f(yVar);
        C47243l.m84039a(yVar, bVar);
        return yVar;
    }

    /* renamed from: b */
    public final C107238ag mo17754z() {
        C107238ag agVar = this.f298667a;
        if (agVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f298670e) {
            return agVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo95874d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f298668c == null) {
            this.f298668c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f298668c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f298669d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C107323x.m178153a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C107238ag b = mo17754z();
            b.f298448h.mo65295b(C89849ae.APP_ACTIONS_SHORTCUTS_CONTENT_PAGE_CREATED);
            b.f298459s = b.f298451k.mo95906a(b.f298442b, new C107233ab(b), new C107234ac(b), new C107235ad(b));
            b.f298449i.mo50429i(b.f298459s);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C107323x.m178153a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C107238ag b;
        View inflate;
        boolean z;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            b = mo17754z();
            inflate = layoutInflater.inflate(R.layout.fragment_app_shortcut, viewGroup, false);
            b.f298454n.f76997b.mo33800a(C28427h.m53115a(105508)).mo33809b(inflate);
            ChatBubbleDialogLayout findViewById = inflate.findViewById(R.id.chat_bubble_dialog_layout);
            if (b.f298457q.mo79746e(C90019by.f248055E)) {
                findViewById.g();
                findViewById.f();
                findViewById.findViewById(R.id.assistant_shortcuts_header).setVisibility(0);
                findViewById.h(R.id.header_view_flipper, 0);
                findViewById.h(R.id.button_view_flipper, 0);
                findViewById.e(true);
                ((LinearLayout.LayoutParams) ((LinearLayout) findViewById.findViewById(R.id.shortcut_container)).getLayoutParams()).height = findViewById.a(R.dimen.chat_bubble_dialog_shortcut_container_height_loading);
                findViewById.findViewById(R.id.edit_icon).setVisibility(8);
                ((ImageView) findViewById.findViewById(R.id.opa_logo)).setAlpha(0.3f);
                ((ImageView) findViewById.findViewById(R.id.user_avatar)).setImageResource(R.drawable.user_avatar_loading);
            } else {
                C107237af afVar = new C107237af(b);
                v e = w.e();
                C49823ah ahVar = (C49823ah) C49826ak.f129462q.createBuilder();
                ahVar.copyOnWrite();
                C49826ak akVar = (C49826ak) ahVar.instance;
                akVar.f129472i = C49255aa.m85392a(5);
                akVar.f129464a |= 64;
                e.d((C49826ak) ahVar.build());
                e.b(0);
                findViewById.b(afVar, e.a());
            }
            b.f298460t = findViewById;
            C107271b bVar = b.f298450j;
            int i = bVar.f298569a;
            if ((i & 2) != 0) {
                C36265d dVar = bVar.f298571c;
                if (dVar == null) {
                    dVar = C36265d.f94713k;
                }
                b.f298461u = b.f298447g.mo95896a(dVar);
                C49837av avVar = (C49837av) C49838aw.f129504g.createBuilder();
                String str = dVar.f94720f;
                avVar.copyOnWrite();
                C49838aw awVar = (C49838aw) avVar.instance;
                str.getClass();
                awVar.f129506a = 8 | awVar.f129506a;
                awVar.f129509d = str;
                b.f298462v = C58833ax.m90834k((C49838aw) avVar.build());
                ChatBubbleDialogLayout chatBubbleDialogLayout = b.f298460t;
                chatBubbleDialogLayout.getClass();
                C107237af afVar2 = new C107237af(b);
                v e2 = w.e();
                C49826ak akVar2 = dVar.f94716b;
                if (akVar2 == null) {
                    akVar2 = C49826ak.f129462q;
                }
                e2.d(akVar2);
                if (b.f298457q.mo79746e(C90019by.f248053C)) {
                    C49826ak akVar3 = dVar.f94716b;
                    if (akVar3 == null) {
                        akVar3 = C49826ak.f129462q;
                    }
                    z = akVar3.f129465b.isEmpty();
                } else {
                    z = true;
                }
                e2.b(z ^ true ? 1 : 0);
                chatBubbleDialogLayout.b(afVar2, e2.a());
                b.f298448h.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_CONTENT_PAGE_LOADED);
            } else if ((i & 1) != 0) {
                b.f298461u = b.f298445e.mo95841a(new Intent().setData(Uri.parse(bVar.f298570b)));
                C107279c cVar = b.f298446f;
                C107308i iVar = b.f298461u;
                iVar.getClass();
                new C90873ag(b.f298443c.mo95893a(cVar.mo95892b(iVar)), b.f298444d, "sendShortcutPageRequest", new C107325z(b)).mo85223a(new C107232aa(b));
            } else {
                b.f298448h.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_CONTENT_PAGE_ERROR);
                b.mo95843b();
            }
        } catch (C107229a e3) {
            ((C59052c) ((C59052c) ((C59052c) C107238ag.f298441a.mo56225c()).mo56382g(e3)).mo56372aa(23552)).mo56386p("App shortcut deeplink is invalid");
            b.f298448h.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_CONTENT_PAGE_ERROR);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C107323x.m178153a(th, th2);
            }
            throw th;
        }
        C47831fm.m85019n();
        return inflate;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f298670e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C107323x.m178153a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C107323x.m178153a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f298670e) {
                super.onAttach(context);
                if (this.f298667a == null) {
                    Object jN = mo95875f().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C107324y) {
                        C107324y yVar = (C107324y) fragment;
                        C68225k.m98532d(yVar);
                        this.f298667a = new C107238ag(yVar, (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b(), (C107290n) ((C74178nm) jN).f207130a.d.f201706eF.mo17428b(), new C107231c(), ((C74178nm) jN).f207130a.d.mo67680J(), (C107277a) ((C74178nm) jN).f207130a.d.f201707eG.mo17428b(), new C107298a(), (C73812a) ((C74178nm) jN).f207130a.b.f200258gG.mo17428b(), (C46439e) ((C74178nm) jN).f207139f.mo17428b(), C68219e.m98518a(((C74178nm) jN).f207130a.a.f202324I), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b(), ((C74178nm) jN).mo70076r(), (C91189au) ((C74178nm) jN).f207130a.a.f202737ci.mo17428b(), (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), (C107264bc) ((C74178nm) jN).f207126W.mo17428b(), ((C74178nm) jN).mo70020C(), ((C74178nm) jN).mo70019B());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f298669d));
                    } else {
                        String obj = C107238ag.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C107323x.m178153a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
