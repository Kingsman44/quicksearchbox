package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114800ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate.f */
/* compiled from: PG */
public final class C114964f {

    /* renamed from: a */
    public static final C59071e f319014a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate.f");

    /* renamed from: b */
    public static final int f319015b = ((int) TimeUnit.SECONDS.toMillis(2));

    /* renamed from: c */
    public final Activity f319016c;

    /* renamed from: d */
    public final C114959a f319017d;

    /* renamed from: e */
    public final C114839ci f319018e;

    /* renamed from: f */
    public final C68214a f319019f;

    /* renamed from: g */
    public final C114800ax f319020g;

    /* renamed from: h */
    private final boolean f319021h;

    /* renamed from: i */
    private final C28292j f319022i;

    /* renamed from: j */
    private final List f319023j = new ArrayList();

    /* renamed from: k */
    private final C86124t f319024k;

    public C114964f(Activity activity, C114959a aVar, C114839ci ciVar, C86124t tVar, C68214a aVar2, C114800ax axVar, boolean z) {
        this.f319016c = activity;
        this.f319021h = z;
        this.f319017d = aVar;
        this.f319018e = ciVar;
        this.f319024k = tVar;
        this.f319019f = aVar2;
        this.f319020g = axVar;
        this.f319022i = new C28292j(57847);
    }

    /* renamed from: a */
    public final View mo101752a() {
        View view;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f319024k.mo79746e(C90014bt.f247289eO)) {
            view = LayoutInflater.from(this.f319016c).inflate(R.layout.zero_state_v2_like_rate_view, (ViewGroup) null);
        } else {
            view = LayoutInflater.from(this.f319016c).inflate(R.layout.zero_state_like_rate_view, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(R.id.question);
        if (this.f319024k.mo79746e(C90080ee.f249825x)) {
            textView.setText(((C73841bf) this.f319019f.mo27525b()).mo65322a().getString(R.string.like_rate_question_short));
        } else {
            textView.setText(((C73841bf) this.f319019f.mo27525b()).mo65322a().getString(R.string.like_rate_question));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.button1);
        textView2.setText(((C73841bf) this.f319019f.mo27525b()).mo65322a().getString(R.string.like_rate_no));
        textView2.setOnClickListener(new C89943l(new C114963e(this, view)));
        TextView textView3 = (TextView) view.findViewById(R.id.button2);
        textView3.setText(((C73841bf) this.f319019f.mo27525b()).mo65322a().getString(R.string.like_rate_yes));
        textView3.setOnClickListener(new C89943l(new C114963e(this, view)));
        C28295m.m52919e(view, this.f319022i);
        C28292j jVar = new C28292j(57848);
        jVar.mo33795i(5);
        C28295m.m52919e(textView2, jVar);
        this.f319023j.add(C28293k.m52908e(jVar, new C28293k[0]));
        C28292j jVar2 = new C28292j(57849);
        jVar2.mo33795i(5);
        C28295m.m52919e(textView3, jVar2);
        this.f319023j.add(C28293k.m52908e(jVar2, new C28293k[0]));
        return view;
    }

    /* renamed from: b */
    public final C28293k mo101753b() {
        return C28293k.m52907d(this.f319022i, this.f319023j);
    }

    /* renamed from: c */
    public final boolean mo101754c() {
        if (this.f319021h) {
            C114959a aVar = this.f319017d;
            return aVar.f318995d.mo26870b() - aVar.f318992a.getLong(TextUtils.concat(new CharSequence[]{"opa_zero_state_last_click_like_rate_card_ve_", aVar.f318993b.mo79659F(), "_", ((bm) aVar.f318996e.mo27525b()).b()}).toString(), 0) >= TimeUnit.HOURS.toMillis(aVar.f318994c.mo79743a(C90014bt.f247839oz));
        }
    }
}
