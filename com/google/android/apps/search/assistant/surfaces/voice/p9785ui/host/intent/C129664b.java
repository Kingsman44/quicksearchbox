package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129541aa;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129687u;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129688v;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.common.p4522b.C58334be;
import com.google.common.p4522b.C58458fu;
import java.util.Map;
import java.util.NoSuchElementException;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.b */
/* compiled from: PG */
public final class C129664b {

    /* renamed from: a */
    private static final C58334be f355872a;

    static {
        Map i = C69505av.m100867i(new C69685i(C129687u.DEFAULT_ACTIVITY, "com.google.android.apps.search.assistant.surfaces.voice.ui.host.activity.defaultactivity.FragmentHostDefaultActivity"), new C69685i(C129687u.FULLSCREEN_ACTIVITY, "com.google.android.apps.search.assistant.surfaces.voice.ui.host.activity.fullscreenactivity.FragmentHostFullScreenActivity"), new C69685i(C129687u.TRANSIENT_ACTIVITY, "com.google.android.apps.search.assistant.surfaces.voice.ui.host.activity.transientactivity.FragmentHostTransientActivity"));
        C58458fu fuVar = new C58458fu(i.size());
        fuVar.putAll(i);
        f355872a = fuVar;
    }

    /* renamed from: a */
    public static final Intent m211715a(Context context, AccountId accountId, C129669g gVar) {
        C129688v vVar;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(accountId, "accountId");
        C129541aa aaVar = gVar.f355877a;
        if (aaVar.f355593a == 1) {
            vVar = (C129688v) aaVar.f355594b;
        } else {
            vVar = C129688v.f355911c;
        }
        C69664n.m101060f(vVar, "args.host.activity");
        C129687u a = C129687u.m211745a(vVar.f355914b);
        if (a == null) {
            a = C129687u.TYPE_UNSPECIFIED;
        }
        if (a != C129687u.TYPE_UNSPECIFIED) {
            C58334be beVar = f355872a;
            C129687u a2 = C129687u.m211745a(vVar.f355914b);
            if (a2 == null) {
                a2 = C129687u.TYPE_UNSPECIFIED;
            }
            String str = (String) beVar.get(a2);
            if (str == null) {
                C129687u a3 = C129687u.m211745a(vVar.f355914b);
                if (a3 == null) {
                    a3 = C129687u.TYPE_UNSPECIFIED;
                }
                new StringBuilder("No activity for type = ").append(a3);
                throw new NoSuchElementException("No activity for type = ".concat(String.valueOf(a3)));
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, str));
            intent.addFlags(268533760);
            C45963aa.m82131a(intent, accountId);
            Bundle bundle = new Bundle();
            gVar.mo109180a(bundle);
            Intent putExtras = intent.putExtras(bundle);
            C69664n.m101060f(putExtras, "createBasicIntent(args.h… args.updateBundle(it) })");
            return putExtras;
        }
        throw new IllegalArgumentException("Activity type should be specified.");
    }

    /* renamed from: b */
    public static final void m211716b(Fragment fragment, C129541aa aaVar, C129676j jVar) {
        C69664n.m101061g(fragment, "<this>");
        C69664n.m101061g(aaVar, "host");
        C69664n.m101061g(jVar, "destination");
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            new C129669g(aaVar, jVar, (NavigatorArgs$Transition) null, (C34053bp) null).mo109180a(arguments);
        }
    }
}
