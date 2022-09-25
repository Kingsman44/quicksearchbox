package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ProgressBar;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.g */
/* compiled from: PG */
final class C11400g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AudioRecorderField f37139a;

    public C11400g(AudioRecorderField audioRecorderField) {
        this.f37139a = audioRecorderField;
    }

    public final void onClick(View view) {
        AudioRecorderField audioRecorderField = this.f37139a;
        int i = audioRecorderField.f36907i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            audioRecorderField.f37152k.mo19727j();
        } else if (i2 != 2) {
            if (i2 == 3 && audioRecorderField.mo19813e()) {
                AudioRecorderField audioRecorderField2 = this.f37139a;
                audioRecorderField2.f37152k.mo19728k(audioRecorderField2.mo19811c());
                AudioRecorderField audioRecorderField3 = this.f37139a;
                ObjectAnimator objectAnimator = audioRecorderField3.f36902d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                audioRecorderField3.mo19814f(3);
            }
        } else if (audioRecorderField.mo19813e()) {
            AudioRecorderField audioRecorderField4 = this.f37139a;
            audioRecorderField4.f37152k.mo19721d(audioRecorderField4.mo19811c());
            AudioRecorderField audioRecorderField5 = this.f37139a;
            ProgressBar progressBar = audioRecorderField5.f36901c;
            audioRecorderField5.f36902d = ObjectAnimator.ofInt(progressBar, "progress", new int[]{0, progressBar.getMax()});
            audioRecorderField5.f36902d.setDuration((long) audioRecorderField5.f36905g);
            audioRecorderField5.f36902d.removeAllUpdateListeners();
            audioRecorderField5.f36902d.addUpdateListener(new C11401h(audioRecorderField5));
            audioRecorderField5.f36902d.addListener(new C11402i(audioRecorderField5));
            audioRecorderField5.f36902d.start();
            audioRecorderField5.mo19814f(4);
        }
    }
}
