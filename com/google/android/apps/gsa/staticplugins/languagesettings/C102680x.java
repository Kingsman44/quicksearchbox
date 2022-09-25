package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p395al.p408c.p414c.p416b.C8506p;
import com.google.p395al.p408c.p414c.p416b.C8508r;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.x */
/* compiled from: PG */
final class C102680x implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f286601a;

    /* renamed from: b */
    final /* synthetic */ boolean f286602b;

    /* renamed from: c */
    final /* synthetic */ C8506p f286603c;

    /* renamed from: d */
    final /* synthetic */ C102655aa f286604d;

    public C102680x(C102655aa aaVar, String str, boolean z, C8506p pVar) {
        this.f286604d = aaVar;
        this.f286601a = str;
        this.f286602b = z;
        this.f286603c = pVar;
    }

    public final void onClick(View view) {
        String str;
        ImageView imageView = (ImageView) view.findViewById(R.id.search_language_selected_check);
        String str2 = (String) this.f286604d.mo93366b().get(this.f286601a);
        str2.getClass();
        this.f286604d.f286544c.edit().putString("selected_search_language", this.f286601a).putString("hl_parameter", str2).putBoolean("interaction_with_search_language_preference", true).apply();
        int i = true != this.f286602b ? 1014 : 1015;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        String ab = this.f286604d.f286545d.mo83882ab();
        boolean J = this.f286604d.f286545d.mo83847J(ab);
        this.f286604d.f286549h.mo78313d(str2, Locale.getDefault());
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            ImageView imageView2 = (ImageView) viewGroup.getChildAt(i2).findViewById(R.id.search_language_selected_check);
            if (imageView2 != null) {
                imageView2.setImageResource(0);
            }
        }
        imageView.setImageResource(R.drawable.ic_check);
        ((ListView) this.f286604d.f286546e.findViewById(R.id.search_language_preferences_layout)).invalidateViews();
        String str3 = this.f286603c.f29515c.size() != 0 ? ((C8508r) this.f286603c.f29515c.get(0)).f29520b : null;
        this.f286604d.f286549h.mo78315f(str3);
        this.f286604d.mo93367c(this.f286601a);
        if (!(str3 == null || this.f286603c.f29515c.size() == 0)) {
            C102655aa aaVar = this.f286604d;
            String str4 = ((C8508r) this.f286603c.f29515c.get(0)).f29519a;
            if (!aaVar.f286545d.mo83823l()) {
                str = aaVar.f286543b.getString(R.string.voice_language_preference_change_no_speaker_id, new Object[]{str4, aaVar.f286547f.mo87230d()});
            } else {
                str = aaVar.f286543b.getString(R.string.voice_language_preference_change, new Object[]{str4});
            }
            Toast.makeText(aaVar.f286543b, str, 0).show();
        }
        if (J && this.f286604d.f286545d.mo83841D(ab) == null && this.f286604d.f286545d.mo83823l()) {
            C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar2.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar2.instance;
            ufVar2.f164093a |= 2;
            ufVar2.f164258m = 815;
            C9439b bVar = C9439b.HOTWORD_RETRAINING_NOTIFICATION_LANGUAGE_CHANGED;
            tzVar2.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar2.instance;
            ufVar3.f164109aP = bVar.f32835aq;
            ufVar3.f164251f |= 16;
            C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
            C102655aa aaVar2 = this.f286604d;
            aaVar2.f286544c.edit().putInt("hands_free_hotword_retraining_notification_source", 14).apply();
            aaVar2.f286547f.mo87235i();
        }
    }
}
