package com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter;

import android.content.Context;
import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import androidx.activity.C0800m;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127679ab;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127691g;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127701q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
import com.google.assistant.p4008y.p4009a.C53542ab;
import com.google.assistant.p4008y.p4009a.C53616y;
import com.google.assistant.p4008y.p4009a.C53617z;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.x */
/* compiled from: PG */
public final class C127869x {

    /* renamed from: a */
    public static final C59071e f351929a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.x");

    /* renamed from: b */
    public final AccountId f351930b;

    /* renamed from: c */
    public final C46175b f351931c;

    /* renamed from: d */
    public final C46801dp f351932d;

    /* renamed from: e */
    public final Bundle f351933e;

    /* renamed from: f */
    public final Context f351934f;

    /* renamed from: g */
    public final C28306ab f351935g;

    /* renamed from: h */
    public final C28310af f351936h;

    /* renamed from: i */
    public final C37215b f351937i;

    /* renamed from: j */
    public LinearLayoutManager f351938j;

    /* renamed from: k */
    public final C127865t f351939k;

    /* renamed from: l */
    public C46755l f351940l;

    /* renamed from: m */
    public final C127691g f351941m;

    /* renamed from: n */
    public final C127701q f351942n;

    /* renamed from: o */
    public final C127868w f351943o;

    /* renamed from: p */
    public final C46792di f351944p = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59104x d = C127869x.f351929a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OlcFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(37636)).mo56386p("Couldn't load OneLearningCenterData from LearningCenter DataSource. Falling back to hard-coded cards");
            C37215b bVar = C127869x.this.f351937i;
            bVar.getClass();
            bVar.mo19974a(C37176a.f97062eU);
            C127869x xVar = C127869x.this;
            C46755l lVar = xVar.f351940l;
            lVar.getClass();
            lVar.mo50772a(xVar.mo108256a());
            C37215b bVar2 = C127869x.this.f351937i;
            bVar2.getClass();
            bVar2.mo19974a(C37176a.f97066eY);
            C127869x.this.mo108257b();
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            C53542ab abVar = (C53542ab) obj;
            if (abVar.f140511a.size() > 0) {
                C58976aa aaVar = C58975e.f156826a;
                C46755l lVar = C127869x.this.f351940l;
                lVar.getClass();
                lVar.mo50772a(abVar.f140511a);
                C127869x xVar = C127869x.this;
                int i = xVar.f351946r;
                if (i != 0) {
                    if (i - 1 != 0) {
                        C37215b bVar = xVar.f351937i;
                        bVar.getClass();
                        bVar.mo19974a(C37176a.f97115fU);
                    } else {
                        C37215b bVar2 = xVar.f351937i;
                        bVar2.getClass();
                        bVar2.mo19974a(C37176a.f97065eX);
                    }
                }
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
                C37215b bVar3 = C127869x.this.f351937i;
                bVar3.getClass();
                bVar3.mo19974a(C37176a.f97064eW);
                C127869x xVar2 = C127869x.this;
                C46755l lVar2 = xVar2.f351940l;
                lVar2.getClass();
                lVar2.mo50772a(xVar2.mo108256a());
                C37215b bVar4 = C127869x.this.f351937i;
                bVar4.getClass();
                bVar4.mo19974a(C37176a.f97066eY);
            }
            C127869x.this.mo108257b();
        }

        /* renamed from: c */
        public final void mo18079c() {
            C127869x xVar = C127869x.this;
            Bundle bundle = xVar.f351933e;
            bundle.getClass();
            if (bundle.getBoolean("olc.use_spinner")) {
                C127868w wVar = xVar.f351943o;
                wVar.getClass();
                wVar.requireView().findViewById(R.id.assistant_learning_center_fragment_progress_bar).setVisibility(0);
                xVar.f351943o.requireView().findViewById(R.id.assistant_learning_center_recycler_view).setVisibility(8);
            }
        }
    };

    /* renamed from: q */
    public final C0800m f351945q = new C127871y(this);

    /* renamed from: r */
    public int f351946r;

    /* renamed from: s */
    public final C127679ab f351947s;

    /* renamed from: t */
    private int f351948t = 0;

    public C127869x(C127868w wVar, AccountId accountId, C46175b bVar, C46801dp dpVar, Context context, C28306ab abVar, C28310af afVar, C127865t tVar, C127691g gVar, C37215b bVar2, C127701q qVar, C127679ab abVar2) {
        this.f351943o = wVar;
        Bundle arguments = wVar.getArguments();
        this.f351933e = arguments == null ? new Bundle() : arguments;
        this.f351930b = accountId;
        this.f351931c = bVar;
        this.f351932d = dpVar;
        this.f351934f = context;
        this.f351935g = abVar;
        this.f351936h = afVar;
        this.f351939k = tVar;
        this.f351941m = gVar;
        this.f351937i = bVar2;
        this.f351942n = qVar;
        this.f351947s = abVar2;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: a */
    public final List mo108256a() {
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList();
        try {
            Context context = this.f351934f;
            context.getClass();
            this.f351948t = (context.getResources().getConfiguration().uiMode & 48) == 32 ? R.raw.assistant_learning_center_dark_mode_olc_card : R.raw.assistant_learning_center_olc_card;
            InputStream openRawResource = this.f351934f.getResources().openRawResource(this.f351948t);
            C62921ba a = C62921ba.m95368a();
            C53616y yVar = (C53616y) C53617z.f140728c.createBuilder();
            C63088z byteString = ((C54201r) C62942bv.parseFrom((C62942bv) C54201r.f142243f, openRawResource, a)).toByteString();
            yVar.copyOnWrite();
            C53617z zVar = (C53617z) yVar.instance;
            byteString.getClass();
            zVar.f140730a |= 1;
            zVar.f140731b = byteString;
            arrayList.add((C53617z) yVar.build());
        } catch (IOException | NullPointerException e) {
            C59104x c = f351929a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OlcFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(37644)).mo56386p("Error while loading OLC data.");
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo108257b() {
        Bundle bundle = this.f351933e;
        bundle.getClass();
        if (bundle.getBoolean("olc.use_spinner")) {
            C127868w wVar = this.f351943o;
            wVar.getClass();
            wVar.requireView().findViewById(R.id.assistant_learning_center_fragment_progress_bar).setVisibility(8);
            this.f351943o.requireView().findViewById(R.id.assistant_learning_center_recycler_view).setVisibility(0);
        }
    }
}
