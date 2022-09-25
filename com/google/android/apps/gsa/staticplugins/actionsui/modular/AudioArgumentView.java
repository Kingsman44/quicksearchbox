package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.ObjectAnimator;
import android.animation.TimeAnimator;
import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.AudioArgument;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55136he;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class AudioArgumentView extends C93666w {

    /* renamed from: A */
    private static final int[] f260992A = {R.attr.state_audioPaused};

    /* renamed from: B */
    private static final int[] f260993B = {R.attr.state_promptedArgument};

    /* renamed from: a */
    public static final C59071e f260994a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actionsui.modular.AudioArgumentView");

    /* renamed from: w */
    private static final int[] f260995w = {R.attr.state_audioEmpty};

    /* renamed from: x */
    private static final int[] f260996x = {R.attr.state_audioRecording};

    /* renamed from: y */
    private static final int[] f260997y = {R.attr.state_audioFilled};

    /* renamed from: z */
    private static final int[] f260998z = {R.attr.state_audioPlaying};

    /* renamed from: C */
    private ImageButton f260999C;

    /* renamed from: D */
    private Button f261000D;

    /* renamed from: E */
    private TextView f261001E;

    /* renamed from: F */
    private TextView f261002F;

    /* renamed from: b */
    public TextView f261003b;

    /* renamed from: c */
    public ProgressBar f261004c;

    /* renamed from: d */
    public ProgressBar f261005d;

    /* renamed from: e */
    public ObjectAnimator f261006e;

    /* renamed from: f */
    public boolean f261007f;

    /* renamed from: g */
    public C93532aj f261008g;

    /* renamed from: h */
    public TimeAnimator f261009h;

    /* renamed from: i */
    public long f261010i;

    /* renamed from: v */
    public int f261011v;

    public AudioArgumentView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final String mo87855a() {
        Argument argument = this.f261447m;
        if (argument == null) {
            return null;
        }
        return (String) ((AudioArgument) argument).f236203n;
    }

    /* renamed from: b */
    public final void mo87856b() {
        this.f261005d.setProgress(0);
        this.f261004c.setProgress(0);
    }

    /* renamed from: c */
    public final boolean mo87857c() {
        AudioArgument audioArgument = (AudioArgument) this.f261447m;
        audioArgument.getClass();
        return !TextUtils.isEmpty((CharSequence) audioArgument.f236203n);
    }

    /* renamed from: e */
    public final void mo87731e(boolean z) {
    }

    /* renamed from: f */
    public final void mo87732f() {
        Integer num;
        C93595cs csVar;
        C55136he heVar = ((AudioArgument) this.f261447m).f236145f;
        if (!(heVar == null || this.f261002F == null || (csVar = this.f261444j) == null)) {
            String a = csVar.mo88004a(heVar);
            if (!TextUtils.isEmpty(a)) {
                this.f261002F.setText(Html.fromHtml(a));
            }
        }
        int i = this.f261011v;
        int i2 = 4;
        if (i == 1) {
            i = true != mo87857c() ? 2 : 4;
            this.f261011v = i;
        }
        if (i == 4) {
            Argument argument = this.f261447m;
            if (argument == null) {
                num = null;
            } else {
                num = ((AudioArgument) argument).f236152j;
            }
            if (num != null) {
                Time time = new Time();
                time.set((long) num.intValue());
                this.f261003b.setText(time.format("%M:%S"));
            }
        }
        int i3 = this.f261011v;
        int i4 = i3 - 1;
        if (i3 != 0) {
            if (i4 == 1) {
                this.f261000D.setContentDescription(getResources().getString(R.string.record_audio));
            } else if (i4 == 2) {
                this.f261000D.setContentDescription(getResources().getString(R.string.recording_audio));
            } else if (i4 == 3) {
                this.f261000D.setContentDescription(getResources().getString(R.string.playback_audio));
            } else if (i4 == 4) {
                this.f261000D.setContentDescription(getResources().getString(R.string.pause_audio_playback));
            } else if (i4 == 5) {
                this.f261000D.setContentDescription(getResources().getString(R.string.resume_audio_playback));
            }
            this.f261001E.setVisibility(this.f261011v == 3 ? 0 : 4);
            this.f261004c.setVisibility(this.f261011v == 3 ? 4 : 0);
            ImageButton imageButton = this.f260999C;
            int i5 = this.f261011v;
            if (!(i5 == 2 || i5 == 3)) {
                i2 = 0;
            }
            imageButton.setVisibility(i2);
            refreshDrawableState();
            return;
        }
        throw null;
    }

    /* renamed from: n */
    public final List mo87858n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C93530ah(this));
        arrayList.add(new C93531ai(this));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        boolean z = this.f261452r;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1 + (z ? 1 : 0));
        int i2 = this.f261011v;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 1) {
                mergeDrawableStates(onCreateDrawableState, f260995w);
            } else if (i3 == 2) {
                mergeDrawableStates(onCreateDrawableState, f260996x);
            } else if (i3 == 3) {
                mergeDrawableStates(onCreateDrawableState, f260997y);
            } else if (i3 == 4) {
                mergeDrawableStates(onCreateDrawableState, f260998z);
            } else if (i3 == 5) {
                mergeDrawableStates(onCreateDrawableState, f260992A);
            }
            if (z) {
                mergeDrawableStates(onCreateDrawableState, f260993B);
            }
            return onCreateDrawableState;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        C93595cs csVar;
        super.onDetachedFromWindow();
        if (mo87857c() && (csVar = this.f261444j) != null) {
            csVar.mo88005b(8, mo87855a(), 1);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f260999C = (ImageButton) findViewById(R.id.audio_delete_recorded_audio_button);
        this.f261000D = (Button) findViewById(R.id.audio_play_record_button);
        this.f261003b = (TextView) findViewById(R.id.audio_play_record_time_text);
        this.f261004c = (ProgressBar) findViewById(R.id.action_audio_playback_bar);
        this.f261005d = (ProgressBar) findViewById(R.id.audio_recording_activity_bar);
        this.f261002F = (TextView) findViewById(R.id.argument_label);
        this.f261001E = (TextView) findViewById(R.id.action_audio_recording_text);
        this.f260999C.setOnClickListener(new C93525ac(this));
        this.f261000D.setOnClickListener(new C93526ad(this));
    }

    public AudioArgumentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioArgumentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f261011v = 1;
    }
}
