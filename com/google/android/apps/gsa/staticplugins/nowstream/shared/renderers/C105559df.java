package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.df */
/* compiled from: PG */
public final /* synthetic */ class C105559df implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105574du f294490a;

    public /* synthetic */ C105559df(C105574du duVar) {
        this.f294490a = duVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105574du duVar = this.f294490a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        TextView textView = ((C105499b) duVar.f294521j).f294307f;
        Resources resources = duVar.f294513b.getResources();
        int i = R.color.dark_reaction_text_color;
        textView.setTextColor(resources.getColor(booleanValue ? R.color.dark_reaction_text_color : R.color.reaction_text_color));
        TextView textView2 = ((C105499b) duVar.f294521j).f294308g;
        Resources resources2 = duVar.f294513b.getResources();
        if (true != booleanValue) {
            i = R.color.reaction_text_color;
        }
        textView2.setTextColor(resources2.getColor(i));
        ImageView imageView = ((C105499b) duVar.f294521j).f294316o;
        int i2 = true != booleanValue ? R.drawable.circle_more : R.drawable.dark_circle_more;
        imageView.setImageResource(i2);
        ((C105499b) duVar.f294521j).f294317p.setImageResource(true != booleanValue ? R.drawable.circle_less : R.drawable.dark_circle_less);
        ((C105499b) duVar.f294521j).f294309h.setBackgroundColor(duVar.f294513b.getResources().getColor(true != booleanValue ? R.color.reaction_mid_line : R.color.dark_reaction_mid_line));
        ((C105499b) duVar.f294521j).f294313l.setImageResource(i2);
        ImageView imageView2 = ((C105499b) duVar.f294521j).f294315n;
        int i3 = true != booleanValue ? R.drawable.circle_neutral : R.drawable.dark_circle_neutral;
        imageView2.setImageResource(i3);
        ((C105499b) duVar.f294521j).f294314m.setImageResource(i3);
        ((C105499b) duVar.f294521j).f294312k.setImageResource(true != booleanValue ? R.drawable.circle_white : R.drawable.dark_circle_white);
        ((C105499b) duVar.f294521j).f294318q.setImageResource(true != booleanValue ? R.drawable.rectangle_neutral : R.drawable.dark_rectangle_neutral);
        ((C105499b) duVar.f294521j).f294319r.setImageResource(true != booleanValue ? R.drawable.rectangle_white : R.drawable.dark_rectangle_white);
    }
}
