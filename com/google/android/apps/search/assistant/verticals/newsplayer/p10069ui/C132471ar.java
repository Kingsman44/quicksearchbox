package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.content.Context;
import android.os.Handler;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.p265e.C5114a;
import com.google.android.apps.search.assistant.verticals.newsplayer.media.C132446a;
import com.google.android.googlequicksearchbox.R;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.ar */
/* compiled from: PG */
final class C132471ar {

    /* renamed from: a */
    final /* synthetic */ C132478ay f361568a;

    /* renamed from: b */
    private final TextView f361569b;

    /* renamed from: c */
    private final TextView f361570c;

    /* renamed from: d */
    private final SeekBar f361571d;

    /* renamed from: e */
    private final View f361572e;

    /* renamed from: f */
    private final Button f361573f;

    public C132471ar(C132478ay ayVar, View view) {
        this.f361568a = ayVar;
        this.f361569b = (TextView) view.findViewById(R.id.assistant_news_player_position);
        this.f361570c = (TextView) view.findViewById(R.id.assistant_news_player_duration);
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.assistant_news_player_progress_bar);
        this.f361571d = seekBar;
        this.f361572e = view.findViewById(R.id.assistant_news_player_progress_bar_layout);
        Button button = (Button) view.findViewById(R.id.assistant_news_player_skip_intro_button);
        this.f361573f = button;
        seekBar.setOnSeekBarChangeListener(new C132469ap(this));
        C132446a q = ayVar.f361586a.mo110715q();
        q.f361493a.mo1040h(new C132470aq(this), (Handler) null);
        if (button != null) {
            button.setOnClickListener(new C132468ao(this));
        }
    }

    /* renamed from: a */
    public final void mo110758a(C62910ar arVar, C62910ar arVar2) {
        View view;
        if (!this.f361568a.f361586a.mo110714p() || (view = this.f361572e) == null || this.f361573f == null) {
            View view2 = this.f361572e;
            if (!(view2 == null || this.f361573f == null)) {
                view2.setVisibility(0);
                this.f361573f.setVisibility(8);
            }
            this.f361570c.setText(DateUtils.formatElapsedTime(arVar2.f169860a));
            if (C62948a.m95453d(arVar2) > 0) {
                this.f361571d.setMax((int) C62948a.m95453d(arVar2));
            }
            this.f361569b.setText(DateUtils.formatElapsedTime(arVar.f169860a));
            this.f361571d.setProgress(Math.max((int) Math.min(C62948a.m95453d(arVar), C62948a.m95453d(arVar2)), 0));
            Context context = this.f361568a.f361595j;
            String format = String.format("%s %s", new Object[]{C5114a.m13987a(context, R.string.assistant_news_player_accessibility_time_elapsed, new Object[0]), C132484bd.m215391a(context, arVar)});
            Context context2 = this.f361568a.f361595j;
            String format2 = String.format("%s %s", new Object[]{C5114a.m13987a(context2, R.string.assistant_news_player_accessibility_duration, new Object[0]), C132484bd.m215391a(context2, arVar2)});
            this.f361569b.setContentDescription(format);
            this.f361570c.setContentDescription(format2);
            this.f361571d.setContentDescription(String.format("%s; %s; %s;", new Object[]{this.f361568a.f361595j.getResources().getString(R.string.assistant_news_player_progress_bar_descriptor), format, format2}));
            return;
        }
        view.setVisibility(8);
        this.f361573f.setVisibility(0);
    }
}
