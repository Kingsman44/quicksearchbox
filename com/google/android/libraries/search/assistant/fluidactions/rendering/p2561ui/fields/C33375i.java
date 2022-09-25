package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.animation.TimeAnimator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16941d;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16979c;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16980d;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16983g;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16984h;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33173c;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33175e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.assistant.p3897e.p3902c.p3907c.C51158o;
import com.google.assistant.p3897e.p3902c.p3907c.C51159p;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.i */
/* compiled from: PG */
public final class C33375i extends C33376j implements C33177b {

    /* renamed from: a */
    public static final C59071e f89417a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.i");

    /* renamed from: b */
    public static final int[] f89418b = {R.attr.state_audioEmpty};

    /* renamed from: c */
    public static final int[] f89419c = {R.attr.state_audioRecording};

    /* renamed from: d */
    public static final int[] f89420d = {R.attr.state_audioRecorded};

    /* renamed from: e */
    public static final int[] f89421e = {R.attr.state_audioPreviewing};

    /* renamed from: f */
    final C68214a f89422f;

    /* renamed from: g */
    public final ImageButton f89423g;

    /* renamed from: h */
    public final Button f89424h;

    /* renamed from: i */
    public final TextView f89425i;

    /* renamed from: j */
    C51941eu f89426j;

    /* renamed from: k */
    public C33182g f89427k;

    /* renamed from: l */
    public C32942a f89428l;

    /* renamed from: m */
    public int f89429m = 1;

    /* renamed from: o */
    private final AudioRecorderField f89430o;

    /* renamed from: p */
    private final ProgressBar f89431p;

    /* renamed from: q */
    private final TextView f89432q;

    /* renamed from: r */
    private final TextView f89433r;

    /* renamed from: s */
    private TimeAnimator f89434s;

    /* renamed from: t */
    private boolean f89435t = false;

    public C33375i(AudioRecorderField audioRecorderField, C68214a aVar) {
        this.f89430o = audioRecorderField;
        this.f89422f = aVar;
        ImageButton imageButton = (ImageButton) audioRecorderField.findViewById(R.id.fa_audio_recorder_field_delete_recorded_audio_button);
        imageButton.getClass();
        this.f89423g = imageButton;
        Button button = (Button) audioRecorderField.findViewById(R.id.fa_audio_recorder_field_play_record_button);
        button.getClass();
        this.f89424h = button;
        TextView textView = (TextView) audioRecorderField.findViewById(R.id.fa_audio_recorder_field_play_record_time_text);
        textView.getClass();
        this.f89425i = textView;
        ProgressBar progressBar = (ProgressBar) audioRecorderField.findViewById(R.id.fa_audio_recorder_field_audio_playback_bar);
        progressBar.getClass();
        this.f89431p = progressBar;
        TextView textView2 = (TextView) audioRecorderField.findViewById(R.id.fa_audio_recorder_field_argument_label);
        textView2.getClass();
        this.f89433r = textView2;
        TextView textView3 = (TextView) audioRecorderField.findViewById(R.id.fa_audio_recorder_field_recording_text);
        textView3.getClass();
        this.f89432q = textView3;
    }

    /* renamed from: a */
    public static String m61970a(C62910ar arVar) {
        return String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(C62948a.m95454e(arVar)), Long.valueOf((C62948a.m95453d(arVar) / 1000) - (C62948a.m95454e(arVar) * 60))});
    }

    /* renamed from: k */
    private final void m61971k() {
        ProgressBar progressBar = this.f89431p;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }

    /* renamed from: b */
    public final void mo38561b(C33176f fVar) {
        C33173c cVar;
        C33175e eVar;
        if (fVar.f88736a == 2) {
            C33175e eVar2 = (C33175e) fVar.f88737b;
            if (eVar2.f88732a == 1) {
                cVar = (C33173c) eVar2.f88733b;
            } else {
                cVar = C33173c.f88726c;
            }
            if (cVar.f88728a != 1) {
                if (fVar.f88736a == 2) {
                    eVar = (C33175e) fVar.f88737b;
                } else {
                    eVar = C33175e.f88730c;
                }
                if (eVar.f88732a == 4 && this.f89429m == 2 && this.f89435t) {
                    this.f89435t = false;
                    TimeAnimator timeAnimator = this.f89434s;
                    if (timeAnimator != null) {
                        timeAnimator.end();
                    }
                    m61971k();
                    mo38820j(1);
                }
            } else if (this.f89429m == 1) {
                m61971k();
                this.f89425i.setText("00:00");
                this.f89435t = true;
                if (this.f89434s == null) {
                    this.f89434s = new TimeAnimator();
                }
                this.f89434s.setTimeListener(new C33372f(this));
                this.f89434s.start();
                mo38820j(2);
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo38563d(boolean z) {
    }

    /* renamed from: e */
    public final void mo38564e(C33180e eVar) {
        C51159p pVar;
        TextView textView;
        C51159p pVar2;
        C51941eu euVar = this.f89426j;
        if (euVar == null || this.f89427k == null) {
            ((C59052c) ((C59052c) f89417a.mo56226d()).mo56372aa(51004)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89426j = euVar2;
            this.f89427k.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89426j;
        if (euVar3.f136277e == 23) {
            pVar = (C51159p) euVar3.f136278f;
        } else {
            pVar = C51159p.f133168f;
        }
        C51941eu euVar4 = this.f89426j;
        if (!(euVar4 == null || (textView = this.f89433r) == null)) {
            if (euVar4.f136277e == 23) {
                pVar2 = (C51159p) euVar4.f136278f;
            } else {
                pVar2 = C51159p.f133168f;
            }
            textView.setText(pVar2.f133171b);
        }
        int a = C51158o.m86046a(pVar.f133173d);
        if (a == 0) {
            a = 1;
        }
        mo38820j(a);
        if (mo38819i()) {
            C16983g gVar = (C16983g) C16984h.f49615b.createBuilder();
            C16979c cVar = (C16979c) C16980d.f49601e.createBuilder();
            String str = pVar.f133172c;
            cVar.copyOnWrite();
            str.getClass();
            ((C16980d) cVar.instance).f49603a = str;
            gVar.mo23168a(cVar);
            ((C16941d) this.f89422f.mo27525b()).mo23097g(new C33373g(this));
            ((C16941d) this.f89422f.mo27525b()).mo23095e((C16984h) gVar.build());
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void mo38565f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38566g() {
    }

    /* renamed from: h */
    public final void mo38818h(C16988l lVar) {
        C62910ar arVar = lVar.f49628e;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        String a = m61970a(arVar);
        if (!a.contentEquals(this.f89425i.getText())) {
            this.f89425i.setText(a);
            this.f89431p.setMax((int) C62948a.m95453d(arVar));
        }
        C62910ar arVar2 = lVar.f49627d;
        if (arVar2 == null) {
            arVar2 = C62910ar.f169858c;
        }
        this.f89431p.setProgress((int) C62948a.m95453d(arVar2), C62948a.m95453d(arVar2) != 0);
    }

    /* renamed from: i */
    public final boolean mo38819i() {
        C51159p pVar;
        C51941eu euVar = this.f89426j;
        if (euVar == null) {
            return false;
        }
        if (euVar.f136277e == 23) {
            pVar = (C51159p) euVar.f136278f;
        } else {
            pVar = C51159p.f133168f;
        }
        return !pVar.f133172c.isEmpty();
    }

    /* renamed from: j */
    public final void mo38820j(int i) {
        C51159p pVar;
        int i2 = 4;
        if ((i != 3 && i != 4) || i != this.f89429m) {
            this.f89429m = i;
            int i3 = i - 1;
            if (i3 == 0) {
                this.f89424h.setContentDescription(this.f89430o.getResources().getString(R.string.fa_audio_recorder_stop_recording_audio));
            } else if (i3 == 2) {
                this.f89424h.setContentDescription(this.f89430o.getResources().getString(R.string.fa_audio_recorder_playback_audio));
            } else if (i3 != 3) {
                this.f89424h.setContentDescription(this.f89430o.getResources().getString(R.string.fa_audio_recorder_recording_audio));
            } else {
                this.f89424h.setContentDescription(this.f89430o.getResources().getString(R.string.fa_audio_recorder_pause_audio_playback));
            }
            if (this.f89429m == 1) {
                this.f89425i.setText("00:00");
            }
            this.f89432q.setVisibility(this.f89429m == 2 ? 0 : 4);
            this.f89431p.setVisibility(this.f89429m == 2 ? 4 : 0);
            C51941eu euVar = this.f89426j;
            if (euVar != null) {
                if (euVar.f136277e == 23) {
                    pVar = (C51159p) euVar.f136278f;
                } else {
                    pVar = C51159p.f133168f;
                }
                if (pVar.f133174e) {
                    this.f89423g.setVisibility(8);
                    this.f89430o.refreshDrawableState();
                }
            }
            ImageButton imageButton = this.f89423g;
            int i4 = this.f89429m;
            if (!(i4 == 1 || i4 == 2)) {
                i2 = 0;
            }
            imageButton.setVisibility(i2);
            this.f89430o.refreshDrawableState();
        }
    }
}
