package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.text.format.DateUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14128bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14348fx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.cs */
/* compiled from: PG */
public final class C15064cs extends C0640fb {

    /* renamed from: a */
    final /* synthetic */ C15069cx f45187a;

    /* renamed from: b */
    private final ContextThemeWrapper f45188b;

    /* renamed from: c */
    private final List f45189c;

    public C15064cs(C15069cx cxVar, ContextThemeWrapper contextThemeWrapper, List list) {
        this.f45187a = cxVar;
        this.f45188b = contextThemeWrapper;
        this.f45189c = list;
    }

    public final int getItemCount() {
        return this.f45189c.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C15068cw cwVar = (C15068cw) ghVar;
        C14348fx fxVar = (C14348fx) this.f45189c.get(i);
        cwVar.f45202i = fxVar;
        cwVar.f45195b.setText(fxVar.f43416a);
        if (cwVar.f45203j.f45214k) {
            TextView textView = cwVar.f45200g;
            textView.getClass();
            textView.setText(String.valueOf(fxVar.f43421f));
        }
        C15352z zVar = cwVar.f45203j.f45212i;
        ImageView imageView = cwVar.f45194a;
        imageView.getClass();
        C14361gj gjVar = fxVar.f43419d;
        if (gjVar == null) {
            gjVar = C14361gj.f43456e;
        }
        zVar.mo22229l(imageView, gjVar, C15065ct.f45190a);
        C15352z zVar2 = cwVar.f45203j.f45212i;
        ImageView imageView2 = cwVar.f45196c;
        imageView2.getClass();
        zVar2.mo22228k(imageView2, fxVar.f43418c);
        C15069cx cxVar = cwVar.f45203j;
        if (cxVar.f45214k) {
            TextView textView2 = cwVar.f45201h;
            textView2.getClass();
            textView2.setText(DateUtils.getRelativeTimeSpanString(fxVar.f43422g, cxVar.f45213j.mo26870b(), 0, C89885b.HTTP_VALUE).toString());
            return;
        }
        ImageView imageView3 = cwVar.f45199f;
        imageView3.getClass();
        imageView3.setVisibility(true != fxVar.f43420e ? 8 : 0);
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        C15068cw cwVar = new C15068cw(this.f45187a, LayoutInflater.from(this.f45188b).inflate(true != this.f45187a.f45214k ? R.layout.message_center_unread_message_view : R.layout.message_center_unread_message_view_v2, viewGroup, false));
        cwVar.f45203j.f45210g.mo21444a(cwVar.f45197d, 108375);
        cwVar.f45197d.setOnClickListener(new C14128bb(cwVar.f45203j.f45210g, new C15066cu(cwVar)));
        C15069cx cxVar = cwVar.f45203j;
        if (cxVar.f45214k) {
            C14132bf bfVar = cxVar.f45210g;
            View view = cwVar.f45198e;
            view.getClass();
            bfVar.mo21444a(view, 159891);
            View view2 = cwVar.f45198e;
            view2.getClass();
            view2.setOnClickListener(new C14129bc(cwVar.f45203j.f45210g, Optional.empty(), new C15067cv(cwVar)));
        }
        return cwVar;
    }

    public final /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        C15068cw cwVar = (C15068cw) ghVar;
        cwVar.f45203j.f45210g.mo21447d(cwVar.f45197d);
        cwVar.f45202i = null;
    }
}
