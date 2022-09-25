package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9858c.C129872b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129959j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9864f.C129978b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9866h.C129989b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation.C130030b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation.C130044p;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation.C130047s;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.time.Duration;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.g */
/* compiled from: PG */
final /* synthetic */ class C129985g implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C129868c f356495a;

    public C129985g(C129868c cVar) {
        this.f356495a = cVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        Fragment fragment;
        C129966q qVar = (C129966q) obj;
        C129868c cVar = this.f356495a;
        if (qVar != null) {
            if (C129959j.m212139a(qVar.f356469b) == C129959j.STATE_NOT_SET) {
                C59052c cVar2 = (C59052c) C129868c.f356274a.mo56226d();
                cVar2.mo56379ah(new C59094n(38583));
                cVar2.mo56386p("Invalid State found.");
                return;
            }
            FragmentManager childFragmentManager = cVar.f356278e.getChildFragmentManager();
            C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
            String name = C129959j.m212139a(qVar.f356469b).name();
            if (childFragmentManager.f634a.mo671c(name) == null) {
                Fragment b = childFragmentManager.f634a.mo670b(R.id.assistant_interpreter_state_view);
                String tag = b != null ? b.getTag() : null;
                C59052c cVar3 = (C59052c) C129868c.f356274a.mo56224b();
                cVar3.mo56379ah(new C59094n(38581));
                cVar3.mo56354G("Going to replace fragment with tag:%s to tag:%s", tag, name);
                C0154a aVar = new C0154a(childFragmentManager);
                C129959j a = C129959j.m212139a(qVar.f356469b);
                C69664n.m101060f(a, "state.stateCase");
                int ordinal = a.ordinal();
                if (ordinal == 0) {
                    AccountId accountId = cVar.f356275b;
                    C69664n.m101061g(accountId, "accountId");
                    fragment = new C129872b();
                    C68324h.m98669f(fragment);
                    C47247a.m84047b(fragment, accountId);
                } else if (ordinal == 1) {
                    AccountId accountId2 = cVar.f356275b;
                    C69664n.m101061g(accountId2, "accountId");
                    fragment = new C129989b();
                    C68324h.m98669f(fragment);
                    C47247a.m84047b(fragment, accountId2);
                } else if (ordinal == 2) {
                    AccountId accountId3 = cVar.f356275b;
                    C69664n.m101061g(accountId3, "accountId");
                    fragment = new C130030b();
                    C68324h.m98669f(fragment);
                    C47247a.m84047b(fragment, accountId3);
                } else if (ordinal == 3) {
                    AccountId accountId4 = cVar.f356275b;
                    C69664n.m101061g(accountId4, "accountId");
                    fragment = new C129978b();
                    C68324h.m98669f(fragment);
                    C47247a.m84047b(fragment, accountId4);
                } else if (ordinal == 4) {
                    Duration duration = C130047s.f356611a;
                    AccountId accountId5 = cVar.f356275b;
                    C69664n.m101061g(accountId5, "accountId");
                    fragment = new C130044p();
                    C68324h.m98669f(fragment);
                    C47247a.m84047b(fragment, accountId5);
                } else if (ordinal != 5) {
                    throw new C69677g();
                } else {
                    throw new AssertionError("Invalid State found");
                }
                aVar.mo689v(R.id.assistant_interpreter_state_view, fragment, name);
                aVar.mo509f();
                return;
            }
            C59052c cVar4 = (C59052c) C129868c.f356274a.mo56224b();
            cVar4.mo56379ah(new C59094n(38582));
            cVar4.mo56389s("Fragment already attached for the tag:%s", name);
        }
    }
}
