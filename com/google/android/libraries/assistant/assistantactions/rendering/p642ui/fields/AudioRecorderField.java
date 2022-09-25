package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.animation.ObjectAnimator;
import android.animation.TimeAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C1877c;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p637a.C11280a;
import com.google.android.libraries.assistant.assistantactions.rendering.p637a.C11281b;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.assistant.p3897e.p3902c.p3907c.C51158o;
import com.google.assistant.p3897e.p3902c.p3907c.C51159p;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import dagger.p5294a.C68219e;
import java.util.Locale;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.AudioRecorderField */
/* compiled from: PG */
public class AudioRecorderField extends C11407n {

    /* renamed from: a */
    public static final C59071e f36893a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.AudioRecorderField");

    /* renamed from: t */
    private static final int[] f36894t = {R.attr.state_audioEmpty};

    /* renamed from: u */
    private static final int[] f36895u = {R.attr.state_audioRecording};

    /* renamed from: v */
    private static final int[] f36896v = {R.attr.state_audioRecorded};

    /* renamed from: w */
    private static final int[] f36897w = {R.attr.state_audioPreviewing};

    /* renamed from: A */
    private TextView f36898A;

    /* renamed from: B */
    private TextView f36899B;

    /* renamed from: b */
    public TextView f36900b;

    /* renamed from: c */
    public ProgressBar f36901c;

    /* renamed from: d */
    public ObjectAnimator f36902d;

    /* renamed from: e */
    public boolean f36903e;

    /* renamed from: f */
    public TimeAnimator f36904f;

    /* renamed from: g */
    public int f36905g = 0;

    /* renamed from: h */
    C11280a f36906h;

    /* renamed from: i */
    public int f36907i = 1;

    /* renamed from: x */
    private ImageButton f36908x;

    /* renamed from: y */
    private Button f36909y;

    /* renamed from: z */
    private ProgressBar f36910z;

    public AudioRecorderField(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static String m26976a(long j) {
        Duration ofMillis = Duration.ofMillis(j);
        return String.format(Locale.US, "%02d:%02d", new Object[]{Integer.valueOf(ofMillis.toMinutesPart()), Integer.valueOf(ofMillis.toSecondsPart())});
    }

    /* renamed from: b */
    public final void mo19809b() {
        C51159p pVar;
        super.mo19809b();
        C51941eu euVar = this.f37153l.f36729a;
        if (euVar.f136277e == 23) {
            pVar = (C51159p) euVar.f136278f;
        } else {
            pVar = C51159p.f133168f;
        }
        int a = C51158o.m86046a(pVar.f133173d);
        if (a == 0) {
            a = 1;
        }
        mo19814f(a);
    }

    /* renamed from: c */
    public final String mo19811c() {
        C51159p pVar;
        if (!mo19813e()) {
            return BuildConfig.FLAVOR;
        }
        C51941eu euVar = this.f37153l.f36729a;
        if (euVar.f136277e == 23) {
            pVar = (C51159p) euVar.f136278f;
        } else {
            pVar = C51159p.f133168f;
        }
        return pVar.f133172c;
    }

    /* renamed from: d */
    public final void mo19812d() {
        this.f36901c.setProgress(0);
    }

    /* renamed from: e */
    public final boolean mo19813e() {
        C51159p pVar;
        C11295c cVar = this.f37153l;
        if (cVar == null) {
            return false;
        }
        C51941eu euVar = cVar.f36729a;
        if (euVar.f136277e == 23) {
            pVar = (C51159p) euVar.f136278f;
        } else {
            pVar = C51159p.f133168f;
        }
        if (!pVar.f133172c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo19814f(int i) {
        C51159p pVar;
        C51159p pVar2;
        C11295c cVar = this.f37153l;
        if (cVar != null && this.f37154m != null && this.f37152k != null) {
            this.f36907i = i;
            TextView textView = this.f36899B;
            if (textView != null) {
                C51941eu euVar = cVar.f36729a;
                if (euVar.f136277e == 23) {
                    pVar2 = (C51159p) euVar.f136278f;
                } else {
                    pVar2 = C51159p.f133168f;
                }
                textView.setText(pVar2.f133171b);
            }
            int i2 = this.f36907i;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    this.f36909y.setContentDescription(getResources().getString(R.string.fluid_action_stop_recording_audio));
                } else if (i3 == 1) {
                    this.f36909y.setContentDescription(getResources().getString(R.string.fluid_action_recording_audio));
                } else if (i3 == 2) {
                    this.f36909y.setContentDescription(getResources().getString(R.string.fluid_action_playback_audio));
                } else if (i3 == 3) {
                    this.f36909y.setContentDescription(getResources().getString(R.string.fluid_action_pause_audio_playback));
                }
                int i4 = this.f36907i;
                if (i4 == 3) {
                    int i5 = this.f36905g;
                    if (i5 > 0) {
                        this.f36900b.setText(m26976a((long) i5));
                    } else if (!mo19813e() || mo19811c().isEmpty()) {
                        this.f36900b.setText("00:00");
                    } else {
                        C60856cj.m92911t(this.f36906h.f36701a.mo19399b(new C11367b(this)), new C11398e(this), this.f36906h.f36701a);
                    }
                } else if (i4 == 1) {
                    this.f36900b.setText("00:00");
                }
                int i6 = 0;
                this.f36898A.setVisibility(this.f36907i == 2 ? 0 : 4);
                this.f36901c.setVisibility(this.f36907i == 2 ? 4 : 0);
                C11295c cVar2 = this.f37153l;
                if (cVar2 != null) {
                    C51941eu euVar2 = cVar2.f36729a;
                    if (euVar2.f136277e == 23) {
                        pVar = (C51159p) euVar2.f136278f;
                    } else {
                        pVar = C51159p.f133168f;
                    }
                    if (pVar.f133174e) {
                        this.f36908x.setVisibility(8);
                        refreshDrawableState();
                        return;
                    }
                }
                ImageButton imageButton = this.f36908x;
                int i7 = this.f36907i;
                if (i7 == 1 || i7 == 2) {
                    i6 = 4;
                }
                imageButton.setVisibility(i6);
                refreshDrawableState();
                return;
            }
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        int i2 = this.f36907i;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                mergeDrawableStates(onCreateDrawableState, f36894t);
            } else if (i3 == 1) {
                mergeDrawableStates(onCreateDrawableState, f36895u);
            } else if (i3 == 2) {
                mergeDrawableStates(onCreateDrawableState, f36896v);
            } else if (i3 == 3) {
                mergeDrawableStates(onCreateDrawableState, f36897w);
            }
            return onCreateDrawableState;
        }
        throw null;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36906h = (C11280a) C68219e.m98519c(C11281b.f36702a).mo17428b();
        this.f36908x = (ImageButton) findViewById(R.id.audio_delete_recorded_audio_button);
        this.f36909y = (Button) findViewById(R.id.audio_play_record_button);
        this.f36900b = (TextView) findViewById(R.id.audio_play_record_time_text);
        this.f36901c = (ProgressBar) findViewById(R.id.action_audio_playback_bar);
        this.f36899B = (TextView) findViewById(R.id.argument_label);
        this.f36898A = (TextView) findViewById(R.id.action_audio_recording_text);
        this.f36910z = (ProgressBar) findViewById(R.id.audio_recording_activity_bar);
        if (this.f37160s == 2) {
            if (C11307e.m26914g(getContext())) {
                this.f36910z.setBackground(C1877c.m5125a(getContext(), R.drawable.fluid_action_card_activity_bar_iris_dark));
            } else {
                this.f36910z.setBackground(C1877c.m5125a(getContext(), R.drawable.fluid_action_card_activity_bar_iris_light));
            }
            refreshDrawableState();
        }
        this.f36908x.setOnClickListener(new C11399f(this));
        this.f36909y.setOnClickListener(new C11400g(this));
    }

    public AudioRecorderField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AudioRecorderField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AudioRecorderField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
