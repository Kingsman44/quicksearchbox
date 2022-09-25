package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import android.car.hardware.property.CarPropertyManager;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.p6790a.C85828m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.assistant.auto.tng.p935d.p937b.p938a.C13339a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4486ci.p4487a.C58097b;
import com.google.p4486ci.p4487a.C58098c;
import com.google.p4486ci.p4487a.C58119x;
import dagger.C68214a;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.ai */
/* compiled from: PG */
public final class C117687ai {

    /* renamed from: a */
    public static final C59071e f326644a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.a.ai");

    /* renamed from: b */
    public final C22871g f326645b;

    /* renamed from: c */
    public final C86054o f326646c;

    /* renamed from: d */
    public final C58833ax f326647d;

    /* renamed from: e */
    public final C21370a f326648e;

    /* renamed from: f */
    public final C85710c f326649f;

    /* renamed from: g */
    public final C86124t f326650g;

    /* renamed from: h */
    public final C68214a f326651h;

    /* renamed from: i */
    public final C117685ag f326652i = new C117685ag();

    /* renamed from: j */
    public final AtomicBoolean f326653j = new AtomicBoolean(false);

    /* renamed from: k */
    public final AtomicBoolean f326654k = new AtomicBoolean(false);

    /* renamed from: l */
    public final Executor f326655l;

    /* renamed from: m */
    public final C58833ax f326656m;

    /* renamed from: n */
    public C117683ae f326657n;

    /* renamed from: o */
    public CarPropertyManager.CarPropertyEventCallback f326658o;

    /* renamed from: p */
    public final C58119x f326659p;

    /* renamed from: q */
    private final C68214a f326660q;

    public C117687ai(C22871g gVar, C86054o oVar, C58833ax axVar, C68214a aVar, C21370a aVar2, C85710c cVar, C86124t tVar, C58833ax axVar2, C68214a aVar3) {
        C58528ij.m90013M(291504647, 322964416, 356517120, 354419973);
        this.f326645b = gVar;
        this.f326646c = oVar;
        this.f326659p = new C58119x();
        this.f326647d = axVar;
        this.f326660q = aVar;
        this.f326648e = aVar2;
        this.f326649f = cVar;
        this.f326650g = tVar;
        this.f326651h = aVar3;
        this.f326656m = axVar2;
        this.f326655l = new C117690d(gVar);
    }

    /* renamed from: b */
    public static Map m195602b(List list) {
        return (Map) IntStream.CC.range(0, list.size()).collect(C117693g.f326669a, new C117694h(list), C117695i.f326671a);
    }

    /* renamed from: a */
    public final C60870cx mo103431a(File file, String str, Query query, String str2) {
        if (TextUtils.isEmpty(str)) {
            mo103432c((C58097b) null, file, (C60870cx) null);
            return C60856cj.m92899h(new IllegalArgumentException("Empty OAuth token."));
        }
        try {
            C60870cx b = ((C85828m) this.f326660q.mo27525b()).mo79467b(query);
            C60870cx d = ((C42876ab) this.f326647d.mo56107c()).mo46042d();
            return C60856cj.m92895d(d, b).mo57335b(new C117708v(this, d, new C58098c(file), file, b, str2, str), this.f326655l);
        } catch (IOException e) {
            mo103432c((C58097b) null, file, (C60870cx) null);
            return C60856cj.m92899h(new IOException("IO exception during reading file", e));
        }
    }

    /* renamed from: c */
    public final void mo103432c(C58097b bVar, File file, C60870cx cxVar) {
        if (this.f326656m.mo56113h() && this.f326650g.mo79746e(C90086ek.f250434d) && this.f326658o != null) {
            C90875ai.m148465b(C117712z.f326713a, ((C13339a) this.f326656m.mo56107c()).mo21030b(), this.f326645b, "clean up listener").mo85223a(C117679aa.f326633a);
        }
        if (cxVar != null && !cxVar.isDone()) {
            cxVar.cancel(false);
        }
        ((C89037bh) this.f326651h.mo27525b()).mo27383i();
        if (file == null) {
            ((C59052c) ((C59052c) f326644a.mo56226d()).mo56372aa(18598)).mo56386p("Attempt to delete a null file object.");
        } else if (!file.delete()) {
            ((C59052c) ((C59052c) f326644a.mo56225c()).mo56372aa(18597)).mo56386p("Could not delete audio file after uploading");
        }
        if (bVar == null) {
            try {
                ((C59052c) ((C59052c) f326644a.mo56226d()).mo56372aa(18596)).mo56386p("Attempt to close a null dataStream object.");
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f326644a.mo56225c()).mo56382g(e)).mo56372aa(18595)).mo56386p("Failed to close data stream used for upload.");
            }
        } else {
            bVar.close();
        }
    }
}
