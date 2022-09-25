package com.google.android.libraries.home.p1958f.p1959a;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.C2384o;
import androidx.p104d.p105a.C2169h;
import androidx.p116i.p117a.C2296b;
import androidx.p116i.p117a.C2298d;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.gsa.assistant.settings.features.p5777z.p5780c.C73553a;
import com.google.android.apps.gsa.assistant.settings.features.p5777z.p5780c.C73555c;
import com.google.android.apps.gsa.assistant.settings.features.p5777z.p5780c.C73556f;
import com.google.android.apps.gsa.assistant.settings.features.p5777z.p5780c.C73557g;
import com.google.android.apps.gsa.assistant.settings.features.z.c.e;
import com.google.android.apps.gsa.assistant.settings.shared.C73794z;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.p1536a.p1537a.C18510a;
import com.google.android.libraries.assistant.p1535p.p1536a.p1537a.C18512c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2877e.C37185a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.assistant.p3861at.C50179nm;
import com.google.assistant.p3861at.C50181no;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3861at.aer;
import com.google.common.android.concurrent.C58277b;
import com.google.common.android.concurrent.C58279d;
import com.google.common.android.concurrent.C58280e;
import com.google.common.android.concurrent.C58284i;
import com.google.common.android.concurrent.C58285j;
import com.google.common.android.concurrent.FutureCallbackRegistry;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p3186j$.util.Objects;
import p5462h.C69613f;
import p5462h.C69702k;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69762k;
import p5462h.p5483m.C69763l;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.home.f.a.ah */
/* compiled from: PG */
public final class C23782ah extends C23793h {

    /* renamed from: e */
    public static final C59071e f65161e = C59071e.m91331h();

    /* renamed from: o */
    private static final C69762k f65162o = new C69762k("\\s+");

    /* renamed from: f */
    public C37215b f65163f;

    /* renamed from: g */
    public C18512c f65164g;

    /* renamed from: h */
    public FutureCallbackRegistry f65165h;

    /* renamed from: i */
    public SearchView f65166i;

    /* renamed from: j */
    public final C23781ag f65167j = new C23781ag(this);

    /* renamed from: k */
    public C73794z f65168k;

    /* renamed from: l */
    public C73557g f65169l;

    /* renamed from: m */
    public C73555c f65170m;

    /* renamed from: n */
    public C73556f f65171n;

    /* renamed from: p */
    private final C69613f f65172p;

    /* renamed from: q */
    private final C23806u f65173q = new C23806u(this);

    public C23782ah() {
        C23779ae aeVar = new C23779ae(this);
        int i = C69649af.f186028a;
        this.f65172p = C2298d.m6235a(this, new C69657g(C23784aj.class), new C23780af(aeVar));
    }

    /* renamed from: A */
    private final C23784aj m44286A() {
        return (C23784aj) this.f65172p.mo5768a();
    }

    /* renamed from: B */
    private final void m44287B(C69626l lVar) {
        boolean z;
        PreferenceScreen gi = mo8412gi();
        C69664n.m101060f(gi, "preferenceScreen");
        Iterator b = C23800o.m44334b(gi);
        while (b.hasNext()) {
            Preference preference = (Preference) b.next();
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                Iterator b2 = C23800o.m44334b(preferenceGroup);
                while (true) {
                    z = false;
                    while (true) {
                        if (!b2.hasNext()) {
                            break;
                        }
                        Preference preference2 = (Preference) b2.next();
                        C69664n.m101060f(preference2, "preference");
                        preference2.mo8348O(((Boolean) lVar.mo5761a(preference2)).booleanValue());
                        if (z || preference2.f12754z) {
                            z = true;
                        }
                    }
                }
                preferenceGroup.mo8348O(z);
                break;
            }
        }
    }

    /* renamed from: fZ */
    public final void mo8407fZ(Bundle bundle, String str) {
        mo8413j(this.f12807b.mo8432e(requireContext()));
    }

    /* renamed from: k */
    public final boolean mo8414k(Preference preference) {
        if (!(preference instanceof C23801p)) {
            return false;
        }
        C50181no noVar = ((C23801p) preference).f65215a;
        int i = noVar.f130449d;
        int a = C50179nm.m85783a(i);
        int i2 = 1;
        if (a == 0) {
            a = 1;
        }
        int i3 = a - 1;
        if (i3 == 1) {
            C69664n.m101061g(noVar, "provider");
            C23797l lVar = new C23797l();
            Bundle bundle = new Bundle(1);
            C23787b.m44307b(bundle, noVar);
            lVar.setArguments(bundle);
            lVar.showNow(getParentFragmentManager(), (String) null);
        } else if (i3 != 2) {
            int a2 = C50179nm.m85783a(i);
            if (a2 != 0) {
                i2 = a2;
            }
            throw new IllegalArgumentException("Unexpected AuthStatus " + Integer.toString(i2 - 1) + " for provider " + noVar.f130446a);
        } else {
            C37215b n = mo29128n();
            C37252a g = C37185a.f98331b.mo40813g();
            C23774a.m44277a(g, noVar);
            n.mo19974a(g);
            mo29135u(noVar);
        }
        return true;
    }

    /* renamed from: n */
    public final C37215b mo29128n() {
        C37215b bVar = this.f65163f;
        if (bVar != null) {
            return bVar;
        }
        C69664n.m101065k("appFlowLogger");
        return null;
    }

    /* renamed from: o */
    public final C60870cx mo29129o(aer aer) {
        C73556f z = mo29140z();
        l lVar = z.f194571c;
        Account a = z.f194570b.a();
        acx acx = aer.f129128c;
        if (acx == null) {
            acx = acx.f128971H;
        }
        return C60922j.m93044g(C60922j.m93044g(lVar.d(a, acx, 10, C73556f.f194569a, z.getClass().getSimpleName()), e.a, C60826bg.f164896a), C23802q.f65217a, C60826bg.f164896a);
    }

    public final void onCreate(Bundle bundle) {
        C18512c cVar;
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        C2384o lifecycle = getLifecycle();
        Objects.requireNonNull(this);
        C58279d dVar = new C58279d(this);
        C58881cr a = C58886cw.m90973a(new C58280e(this));
        C58277b bVar = C58277b.f155819a;
        int i = C58284i.f155826b;
        FutureCallbackRegistry futureCallbackRegistry = new FutureCallbackRegistry(lifecycle, dVar, a, bVar);
        futureCallbackRegistry.mo54847b(R.id.link_callback, this.f65173q);
        futureCallbackRegistry.mo54847b(R.id.unlink_callback, this.f65167j);
        this.f65165h = futureCallbackRegistry;
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("AccountLinkingFlow")) {
            C18510a aVar = (C18510a) C18512c.f52464c.createBuilder();
            C69664n.m101060f(aVar, "newBuilder()");
            C69664n.m101061g(aVar, "builder");
            aVar.copyOnWrite();
            C18512c cVar2 = (C18512c) aVar.instance;
            cVar2.f52466a = 1;
            cVar2.f52467b = true;
            C62942bv build = aVar.build();
            C69664n.m101060f(build, "_builder.build()");
            cVar = (C18512c) build;
        } else {
            MessageLite c = ProtoParsers.m95520c(getArguments(), "AccountLinkingFlow", C18512c.f52464c, C62921ba.m95368a());
            C69664n.m101060f(c, "{\n        ProtoParsers.g…istry()\n        )\n      }");
            cVar = (C18512c) c;
        }
        this.f65164g = cVar;
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C69664n.m101061g(menu, "menu");
        C69664n.m101061g(menuInflater, "menuInflater");
        menuInflater.inflate(R.menu.provider_list_menu, menu);
        View actionView = menu.findItem(R.id.provider_search).getActionView();
        C69664n.m101059e(actionView, "null cannot be cast to non-null type android.support.v7.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        searchView.setOnQueryTextListener(new C23809x(this));
        this.f65166i = searchView;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C69664n.m101061g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.provider_list, viewGroup, false);
        View findViewById = inflate.findViewById(16908290);
        C69664n.m101060f(findViewById, "view.findViewById(android.R.id.content)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        viewGroup2.removeAllViews();
        viewGroup2.addView(super.onCreateView(layoutInflater, viewGroup2, bundle));
        C69664n.m101060f(inflate, "view");
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C69664n.m101061g(view, "view");
        super.onViewCreated(view, bundle);
        ((ViewStub) view.findViewById(R.id.empty_provider_list)).setOnInflateListener(new C23811z(this));
        m44286A().f65178b.mo5704e(getViewLifecycleOwner(), new C23775aa(this));
        C2296b.m6233a(this, "confirmUnlinkProvider", new C23776ab(this));
        C2296b.m6233a(this, "linkedProviderAction", new C23777ac(this));
        C2296b.m6233a(this, "zeroDevicesSynced", new C23778ad(this));
        C69702k kVar = (C69702k) m44286A().f65178b.mo3842a();
        if (kVar == null || !C69702k.m101125b(kVar.f186073a)) {
            mo29138x();
        }
    }

    /* renamed from: p */
    public final void mo29130p(int i, List list) {
        if (!list.isEmpty()) {
            PreferenceCategory preferenceCategory = new PreferenceCategory(requireContext());
            preferenceCategory.mo8346M(i);
            mo8412gi().mo8379af(preferenceCategory);
            preferenceCategory.f12757c = false;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Context requireContext = requireContext();
                C69664n.m101060f(requireContext, "requireContext()");
                preferenceCategory.mo8379af(new C23801p(this, requireContext, (C50181no) it.next()));
            }
        }
    }

    /* renamed from: q */
    public final void mo29131q(C50181no noVar) {
        C69664n.m101061g(noVar, "provider");
        C23789d dVar = new C23789d();
        Bundle bundle = new Bundle(1);
        C23787b.m44307b(bundle, noVar);
        dVar.setArguments(bundle);
        dVar.showNow(getParentFragmentManager(), (String) null);
    }

    /* renamed from: r */
    public final void mo29132r() {
        Fragment c = getParentFragmentManager().f634a.mo671c("progressDialog");
        if (c != null) {
            C0154a aVar = new C0154a(getParentFragmentManager());
            aVar.mo516m(c);
            aVar.mo509f();
        }
    }

    /* renamed from: s */
    public final void mo29133s(CharSequence charSequence) {
        if (C69764m.m101229h(charSequence)) {
            m44287B(C23803r.f65218a);
            return;
        }
        String ag = C69540x.m100851ag(f65162o.mo61433a(C69764m.m101197q(charSequence), 0), ".*", (CharSequence) null, (CharSequence) null, new C23805t(C69762k.f186138a), 30);
        C69763l lVar = C69763l.IGNORE_CASE;
        C69664n.m101061g(ag, "pattern");
        C69664n.m101061g(lVar, "option");
        int i = lVar.f186148h;
        if ((i & 2) != 0) {
            i |= 64;
        }
        Pattern compile = Pattern.compile(ag, i);
        C69664n.m101060f(compile, "compile(pattern, ensureUnicodeCase(option.value))");
        m44287B(new C23804s(new C69762k(compile)));
    }

    /* renamed from: t */
    public final void mo29134t(int i, C50181no noVar) {
        C0167am requireActivity = requireActivity();
        Intent intent = new Intent();
        C73794z y = mo29139y();
        requireActivity.setResult(i, intent.putExtra("AccountKey", y.f195094b.mo79689w(mo29139y().f195093a.b())).putExtra("ProviderId", noVar.f130446a));
        requireActivity.finish();
    }

    /* renamed from: u */
    public final void mo29135u(C50181no noVar) {
        C73555c cVar = this.f65170m;
        if (cVar == null) {
            C69664n.m101065k("accountLinkingDelegate");
            cVar = null;
        }
        C60870cx h = C60922j.m93045h(C60846c.m92878g(C60838bs.m92859i(C2169h.m6027a(new C73553a(cVar, noVar))), Throwable.class, new C23807v(this, noVar), C60826bg.f164896a), new C23808w(this, noVar), C60826bg.f164896a);
        FutureCallbackRegistry futureCallbackRegistry = this.f65165h;
        if (futureCallbackRegistry == null) {
            C69664n.m101065k("futureCallbackRegistry");
            futureCallbackRegistry = null;
        }
        futureCallbackRegistry.mo54846a(new C58285j(h), this.f65173q, new ProtoParsers.InternalDontUse((byte[]) null, noVar));
    }

    /* renamed from: v */
    public final void mo29136v(C62722b bVar, ProtoParsers.ParcelableProto parcelableProto) {
        C37215b n = mo29128n();
        C37252a i = C37185a.f98334e.mo40815i(bVar);
        C23774a.m44277a(i, C23800o.m44333a(parcelableProto));
        n.mo19974a(i);
        C37215b n2 = mo29128n();
        C37252a c = C37185a.f98335f.mo40805c(bVar);
        C23774a.m44277a(c, C23800o.m44333a(parcelableProto));
        n2.mo19974a(c);
    }

    /* renamed from: w */
    public final void mo29137w(CharSequence charSequence) {
        C69664n.m101061g(charSequence, "message");
        C23798m mVar = new C23798m();
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("message", charSequence);
        mVar.setArguments(bundle);
        mVar.setCancelable(false);
        mVar.showNow(getParentFragmentManager(), "progressDialog");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: kotlinx.coroutines.aw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29138x() {
        /*
            r7 = this;
            com.google.android.libraries.home.f.a.aj r0 = r7.m44286A()
            com.google.android.apps.gsa.assistant.settings.features.z.c.f r1 = r7.mo29140z()
            java.lang.String r2 = "assistantSettingsSender"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            kotlinx.coroutines.cp r2 = r0.f65177a
            if (r2 == 0) goto L_0x001a
            boolean r2 = r2.mo62867mj()
            r3 = 1
            if (r2 == r3) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            return
        L_0x001a:
            androidx.lifecycle.ag r2 = r0.f65178b
            r3 = 0
            r2.mo5706i(r3)
            if (r0 != 0) goto L_0x0027
            java.lang.String r2 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101064j(r2)
        L_0x0027:
            java.lang.String r2 = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY"
            java.lang.Object r4 = r0.mo5766r(r2)
            kotlinx.coroutines.aw r4 = (kotlinx.coroutines.C71422aw) r4
            if (r4 != 0) goto L_0x004e
            androidx.lifecycle.f r4 = new androidx.lifecycle.f
            kotlinx.coroutines.ds r5 = new kotlinx.coroutines.ds
            r5.<init>()
            kotlinx.coroutines.de r6 = kotlinx.coroutines.C71613bn.m104563a()
            kotlinx.coroutines.de r6 = r6.mo62770h()
            h.c.o r5 = kotlinx.coroutines.C71641cn.m104621a(r5, r6)
            r4.<init>(r5)
            java.lang.Object r2 = r0.mo5767s(r2, r4)
            r4 = r2
            kotlinx.coroutines.aw r4 = (kotlinx.coroutines.C71422aw) r4
        L_0x004e:
            com.google.android.libraries.home.f.a.ai r2 = new com.google.android.libraries.home.f.a.ai
            r2.<init>(r1, r0, r3)
            r1 = 3
            kotlinx.coroutines.cp r1 = kotlinx.coroutines.C71803m.m105043d(r4, r3, r3, r2, r1)
            r0.f65177a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.p1958f.p1959a.C23782ah.mo29138x():void");
    }

    /* renamed from: y */
    public final C73794z mo29139y() {
        C73794z zVar = this.f65168k;
        if (zVar != null) {
            return zVar;
        }
        C69664n.m101065k("accountProvider");
        return null;
    }

    /* renamed from: z */
    public final C73556f mo29140z() {
        C73556f fVar = this.f65171n;
        if (fVar != null) {
            return fVar;
        }
        C69664n.m101065k("assistantSettingsSender");
        return null;
    }
}
