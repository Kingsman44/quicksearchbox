package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import java.util.Calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.bz */
/* compiled from: PG */
public final /* synthetic */ class C105525bz implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105530cd f294407a;

    public /* synthetic */ C105525bz(C105530cd cdVar) {
        this.f294407a = cdVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105530cd cdVar = this.f294407a;
        if (((Boolean) obj).booleanValue()) {
            ViewGroup viewGroup = cdVar.f294414c;
            Context context = cdVar.f294412a;
            Integer valueOf = Integer.valueOf(R.string.no_cards_greeting_morning);
            Integer valueOf2 = Integer.valueOf(R.string.no_cards_greeting_afternoon);
            Integer valueOf3 = Integer.valueOf(R.string.no_cards_greeting_evening);
            Integer valueOf4 = Integer.valueOf(R.string.no_cards_greeting_night);
            Integer valueOf5 = Integer.valueOf(R.string.no_cards_greeting_dead_of_night);
            int i = Calendar.getInstance().get(11);
            if (i >= 2 && i < 5) {
                valueOf = valueOf5;
            } else if (i < 5 || i >= 12) {
                valueOf = (i < 12 || i >= 17) ? (i < 17 || i >= 20) ? valueOf4 : valueOf3 : valueOf2;
            }
            C91985d.m150960g(viewGroup, R.id.no_cards_title, context.getString(valueOf.intValue()));
            return;
        }
        cdVar.f294414c.findViewById(R.id.no_cards_title).setVisibility(8);
    }
}
