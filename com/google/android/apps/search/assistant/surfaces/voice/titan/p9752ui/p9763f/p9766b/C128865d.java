package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9763f.p9766b;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128836k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.f.b.d */
/* compiled from: PG */
final class C128865d implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C128866e f354180a;

    /* renamed from: b */
    private final float f354181b = ((float) m210309c(R.integer.assistant_greeting_mid_text_size));

    /* renamed from: c */
    private final int f354182c = m210309c(R.integer.assistant_greeting_mid_line_height);

    /* renamed from: d */
    private final float f354183d = ((float) m210309c(R.integer.assistant_greeting_near_text_size));

    /* renamed from: e */
    private final int f354184e = m210309c(R.integer.assistant_greeting_near_line_height);

    public C128865d(C128866e eVar) {
        this.f354180a = eVar;
    }

    /* renamed from: c */
    private final int m210309c(int i) {
        return this.f354180a.f354185a.requireContext().getResources().getInteger(i);
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C128836k kVar = (C128836k) obj;
        C69664n.m101061g(kVar, "data");
        View findViewById = this.f354180a.f354185a.requireView().findViewById(R.id.assistant_voice_plate_greeting);
        C69664n.m101060f(findViewById, "fragment.requireView().f…ant_voice_plate_greeting)");
        TextView textView = (TextView) findViewById;
        C128836k kVar2 = C128836k.NEAR;
        int ordinal = kVar.ordinal();
        if (ordinal == 0) {
            textView.setTextSize(this.f354183d);
            textView.setLineHeight(this.f354184e);
        } else if (ordinal == 1) {
            textView.setTextSize(this.f354181b);
            textView.setLineHeight(this.f354182c);
        }
    }
}
