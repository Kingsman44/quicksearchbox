package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13337u;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14527mn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14528mo;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.f */
/* compiled from: PG */
final class C15086f extends C0640fb {

    /* renamed from: a */
    final /* synthetic */ C15089i f45262a;

    /* renamed from: b */
    private final ContextThemeWrapper f45263b;

    /* renamed from: c */
    private final List f45264c;

    public C15086f(C15089i iVar, ContextThemeWrapper contextThemeWrapper, List list) {
        this.f45262a = iVar;
        this.f45263b = contextThemeWrapper;
        this.f45264c = list;
    }

    public final int getItemCount() {
        return this.f45264c.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        String str;
        int i2;
        C15087g gVar = (C15087g) ghVar;
        C14528mo moVar = (C14528mo) this.f45264c.get(i);
        ContextThemeWrapper contextThemeWrapper = this.f45263b;
        gVar.f45269e = moVar;
        C14361gj gjVar = moVar.f43915e;
        if (gjVar == null) {
            gjVar = C14361gj.f43456e;
        }
        if (Objects.equals(gjVar, C14361gj.f43456e)) {
            gVar.f45265a.setImageResource(R.drawable.caller_avatar);
        } else {
            ImageView imageView = gVar.f45265a;
            C14361gj gjVar2 = moVar.f43915e;
            if (gjVar2 == null) {
                gjVar2 = C14361gj.f43456e;
            }
            imageView.setImageBitmap(C15375c.m31983a(gjVar2));
        }
        TextView textView = gVar.f45266b;
        if (moVar.f43912b.isEmpty()) {
            str = moVar.f43911a;
        } else {
            str = moVar.f43912b;
        }
        textView.setText(str);
        C63042fg fgVar = moVar.f43914d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        if (fgVar.f170154a <= 0) {
            gVar.f45267c.setVisibility(8);
        } else {
            gVar.f45267c.setVisibility(0);
            TextView textView2 = gVar.f45267c;
            C63042fg fgVar2 = moVar.f43914d;
            if (fgVar2 == null) {
                fgVar2 = C63042fg.f170152c;
            }
            textView2.setText(C13337u.m29582a(gVar.f45270f.f45274b, C62953e.m95478c(fgVar2)));
        }
        int a = C14527mn.m30632a(moVar.f43913c);
        if (a != 0 && a == 2) {
            gVar.f45268d.setVisibility(8);
        } else {
            gVar.f45268d.setVisibility(0);
            ImageView imageView2 = gVar.f45268d;
            int a2 = C14527mn.m30632a(moVar.f43913c);
            if (a2 == 0) {
                a2 = 1;
            }
            int i3 = a2 - 2;
            imageView2.setImageResource(i3 != 2 ? i3 != 3 ? R.drawable.call_received : R.drawable.call_missed : R.drawable.call_made);
            int i4 = moVar.f43913c;
            int a3 = C14527mn.m30632a(i4);
            if (a3 != 0 && a3 == 5) {
                gVar.f45268d.setContentDescription(gVar.f45270f.f45274b.getString(R.string.call_center_recent_missed_call_description));
            } else {
                int a4 = C14527mn.m30632a(i4);
                if (a4 != 0 && a4 == 4) {
                    gVar.f45268d.setContentDescription(gVar.f45270f.f45274b.getString(R.string.call_center_recent_outgoing_call_description));
                } else {
                    gVar.f45268d.setContentDescription(gVar.f45270f.f45274b.getString(R.string.call_center_recent_received_call_description));
                }
            }
        }
        int a5 = C14527mn.m30632a(moVar.f43913c);
        if (a5 != 0 && a5 == 5) {
            i2 = contextThemeWrapper.getResources().getColor(R.color.missed_calls_text_color);
        } else {
            i2 = contextThemeWrapper.getResources().getColor(R.color.call_center_recent_call_text_dark);
        }
        gVar.f45266b.setTextColor(i2);
        gVar.f45267c.setTextColor(i2);
        C15352z.m31957j(gVar.f45268d, i2);
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        C15087g gVar = new C15087g(this.f45262a, LayoutInflater.from(this.f45263b).inflate(R.layout.call_center_recent_call, viewGroup, false));
        gVar.f45270f.f45276d.mo21444a(gVar.itemView, 107807);
        gVar.itemView.setOnClickListener(new C14129bc(gVar.f45270f.f45276d, Optional.empty(), gVar));
        return gVar;
    }

    public final /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        C15087g gVar = (C15087g) ghVar;
        gVar.f45270f.f45276d.mo21447d(gVar.itemView);
        gVar.f45269e = null;
    }
}
