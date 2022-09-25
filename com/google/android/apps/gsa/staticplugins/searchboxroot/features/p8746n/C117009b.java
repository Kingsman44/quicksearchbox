package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.LauncherApps;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Process;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6944c.p6949c.C88596l;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p6990an.C89231v;
import com.google.android.apps.gsa.shared.p6990an.C89232w;
import com.google.android.apps.gsa.shared.p6990an.C89234y;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.appactions.p11035a.C147827ac;
import com.google.android.libraries.appactions.p11035a.C147839g;
import com.google.android.libraries.appactions.p11035a.C147840h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.shared.suggestion.C41677c;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54760h;
import com.google.p4129b.p4136c.C54761i;
import com.google.p4129b.p4136c.C54773u;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.b */
/* compiled from: PG */
public final class C117009b extends C88596l {

    /* renamed from: c */
    private static final C59071e f324827c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.b");

    /* renamed from: b */
    public final Context f324828b;

    /* renamed from: d */
    private final C117022i f324829d;

    /* renamed from: e */
    private final C22871g f324830e;

    /* renamed from: f */
    private final C58881cr f324831f;

    /* renamed from: g */
    private final C68214a f324832g;

    public C117009b(Context context, C117022i iVar, C22871g gVar, C58881cr crVar, C68214a aVar) {
        this.f324828b = context;
        this.f324829d = iVar;
        this.f324830e = gVar;
        this.f324831f = crVar;
        this.f324832g = aVar;
    }

    /* renamed from: e */
    private static Optional m194457e(String str, C54759g gVar, C58495hd hdVar, C58485gu guVar) {
        C54760h hVar = (C54760h) C54761i.f143683c.createBuilder();
        hVar.copyOnWrite();
        C54761i iVar = (C54761i) hVar.instance;
        gVar.getClass();
        C62971cq cqVar = iVar.f143685a;
        if (!cqVar.mo58948c()) {
            iVar.f143685a = C62942bv.mutableCopy(cqVar);
        }
        iVar.f143685a.add(gVar);
        hVar.copyOnWrite();
        C54761i iVar2 = (C54761i) hVar.instance;
        C62971cq cqVar2 = iVar2.f143686b;
        if (!cqVar2.mo58948c()) {
            iVar2.f143686b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) guVar, (List) iVar2.f143686b);
        C147827ac acVar = new C147827ac();
        acVar.mo124501b(str, (C54761i) hVar.build());
        C147839g gVar2 = new C147839g(acVar.mo124500a());
        C54773u uVar = gVar.f143681a;
        if (uVar == null) {
            uVar = C54773u.f143704c;
        }
        Optional b = gVar2.mo124517b(str, uVar.f143706a, hdVar, Optional.empty());
        if (b.isEmpty()) {
            return Optional.empty();
        }
        C147840h hVar2 = (C147840h) b.get();
        try {
            Intent parseUri = Intent.parseUri(hVar2.mo124506a(), 7);
            parseUri.putExtra("actions.fulfillment.extra.ACTION_TOKEN", BuildConfig.FLAVOR);
            if (!str.isEmpty()) {
                parseUri.setPackage(str);
            }
            if (hVar2.mo124508c()) {
                parseUri.addFlags(805306368);
            } else {
                parseUri.addFlags(268468224);
            }
            return Optional.m71637of(parseUri);
        } catch (URISyntaxException e) {
            C59104x d = f324827c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "sb.r.AppShrctClkHdlr");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(32548)).mo56389s("#getFulfillAppActionUrl: exception %s", e);
            return Optional.empty();
        }
    }

    /* renamed from: f */
    private final void m194458f() {
        this.f324830e.mo28212l("ShowToast", new C116991a(this));
    }

    /* renamed from: a */
    public final int mo82254a() {
        return 173;
    }

    /* renamed from: b */
    public final C89234y mo82255b(Suggestion suggestion, String str, C60455qr qrVar, Query query, Bundle bundle) {
        Query query2 = query;
        C41677c cVar = suggestion.f108907B.f109021o;
        if (cVar == null) {
            cVar = C41677c.f108996h;
        }
        C41677c cVar2 = cVar;
        String str2 = cVar2.f109004g;
        String str3 = cVar2.f109001d;
        if (!str2.isEmpty()) {
            Optional optional = (Optional) this.f324831f.mo6453a();
            if (optional.isPresent()) {
                try {
                    ((LauncherApps) optional.get()).startShortcut(str3, str2, (Rect) null, (Bundle) null, Process.myUserHandle());
                    this.f324829d.mo103102a(suggestion, query2.f252749G, 6, qrVar != null ? (C60456qs) qrVar.build() : null, query.mo84474eb());
                    return new C89231v();
                } catch (ActivityNotFoundException e) {
                    m194458f();
                    ((C89911f) this.f324832g.mo27525b()).mo83755a(e, 183018465, 29).mo83721a();
                    C59104x d = f324827c.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "sb.r.AppShrctClkHdlr");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(32547)).mo56389s("#startShortcut: exception %s", e);
                }
            }
        }
        String str4 = cVar2.f109001d;
        C54759g gVar = cVar2.f109000c;
        if (gVar == null) {
            gVar = C54759g.f143679c;
        }
        Optional e2 = m194457e(str4, gVar, C58495hd.m89898l(Collections.unmodifiableMap(cVar2.f108999b)), C58485gu.m89842j(cVar2.f109003f));
        if (e2.isEmpty()) {
            m194458f();
            return new C89231v();
        }
        this.f324829d.mo103102a(suggestion, query2.f252749G, 6, qrVar != null ? (C60456qs) qrVar.build() : null, query.mo84474eb());
        return new C89232w((Intent) e2.get());
    }
}
