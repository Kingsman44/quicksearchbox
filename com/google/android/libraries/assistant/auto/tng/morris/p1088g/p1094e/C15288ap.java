package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e;

import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.p265e.C5114a;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.assistant.p3994s.p3995a.C53437nw;
import com.google.protobuf.C63042fg;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.e.ap */
/* compiled from: PG */
public final /* synthetic */ class C15288ap implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15294av f45905a;

    /* renamed from: b */
    public final /* synthetic */ ContextThemeWrapper f45906b;

    /* renamed from: c */
    public final /* synthetic */ C53435nu f45907c;

    public /* synthetic */ C15288ap(C15294av avVar, ContextThemeWrapper contextThemeWrapper, C53435nu nuVar) {
        this.f45905a = avVar;
        this.f45906b = contextThemeWrapper;
        this.f45907c = nuVar;
    }

    public final void run() {
        String str;
        C15294av avVar = this.f45905a;
        ContextThemeWrapper contextThemeWrapper = this.f45906b;
        C53435nu nuVar = this.f45907c;
        long b = avVar.f45927o.mo26870b();
        C53437nw nwVar = nuVar.f140247l;
        if (nwVar == null) {
            nwVar = C53437nw.f140250i;
        }
        C63042fg fgVar = nwVar.f140257f;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        int millis = (int) ((b - Duration.ofSeconds(fgVar.f170154a).plus(Duration.ofNanos((long) fgVar.f170155b)).toMillis()) / 60000);
        if (millis == 0) {
            str = contextThemeWrapper.getString(R.string.destination_suggestion_just_now_text);
        } else {
            str = C5114a.m13987a(contextThemeWrapper, R.string.destination_suggestion_sub_text, "minute", Integer.valueOf(millis));
        }
        TextView textView = avVar.f45918f;
        textView.getClass();
        textView.setText(str);
        ViewGroup viewGroup = avVar.f45916d;
        viewGroup.getClass();
        TextView textView2 = avVar.f45917e;
        textView2.getClass();
        viewGroup.setContentDescription(contextThemeWrapper.getString(R.string.destination_suggestion_content_description, new Object[]{textView2.getText(), str}));
    }
}
