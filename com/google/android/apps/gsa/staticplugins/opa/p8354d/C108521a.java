package com.google.android.apps.gsa.staticplugins.opa.p8354d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.C9397cb;
import com.google.android.apps.gsa.assist.p505d.C9406a;
import com.google.android.apps.gsa.searchplate.widget.StreamingTextView;
import com.google.android.apps.gsa.staticplugins.opa.p8354d.p8355a.C108522a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.d.a */
/* compiled from: PG */
final class C108521a implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C108523b f301939a;

    public C108521a(C108523b bVar) {
        this.f301939a = bVar;
    }

    public final boolean handleMessage(Message message) {
        View view;
        View view2;
        int i = message.what;
        if (i != 1) {
            int i2 = 8;
            if (i == 2) {
                Bundle data = message.getData();
                if (data != null) {
                    C108523b bVar = this.f301939a;
                    String string = data.getString("pending_text", BuildConfig.FLAVOR);
                    String string2 = data.getString("stable_text", BuildConfig.FLAVOR);
                    if (bVar.f301941b != null && ((!string.isEmpty() || !string2.isEmpty()) && (view = ((C9397cb) bVar.f301941b).f32620q) != null)) {
                        View findViewById = view.findViewById(R.id.qk_greeting_text);
                        if (findViewById != null) {
                            findViewById.setVisibility(8);
                        }
                        StreamingTextView streamingTextView = (StreamingTextView) view.findViewById(R.id.qk_transcription_streaming_text);
                        if (streamingTextView != null) {
                            streamingTextView.mo82923b(string2, string);
                        }
                        C108522a.m180456a(view, true);
                    }
                }
            } else if (i == 3) {
                Bundle data2 = message.getData();
                if (data2 != null) {
                    C108523b bVar2 = this.f301939a;
                    String string3 = data2.getString("final_text", BuildConfig.FLAVOR);
                    if (!(bVar2.f301941b == null || string3.isEmpty() || (view2 = ((C9397cb) bVar2.f301941b).f32620q) == null)) {
                        View findViewById2 = view2.findViewById(R.id.qk_greeting_text);
                        if (findViewById2 != null) {
                            findViewById2.setVisibility(8);
                        }
                        StreamingTextView streamingTextView2 = (StreamingTextView) view2.findViewById(R.id.qk_transcription_streaming_text);
                        if (streamingTextView2 != null) {
                            streamingTextView2.mo82924c(string3);
                        }
                        C108522a.m180456a(view2, false);
                    }
                }
            } else if (i == 5) {
                Bundle data3 = message.getData();
                C9406a aVar = this.f301939a.f301941b;
                if (!(aVar == null || data3 == null)) {
                    View view3 = ((C9397cb) aVar).f32620q;
                    boolean z = data3.getBoolean("show_qk");
                    if (view3 != null) {
                        if (true == z) {
                            i2 = 0;
                        }
                        view3.setVisibility(i2);
                    }
                    if (!z && view3 != null) {
                        View findViewById3 = view3.findViewById(R.id.qk_greeting_text);
                        if (findViewById3 != null) {
                            findViewById3.setVisibility(0);
                        }
                        StreamingTextView streamingTextView3 = (StreamingTextView) view3.findViewById(R.id.qk_transcription_streaming_text);
                        if (streamingTextView3 != null) {
                            streamingTextView3.mo82924c(BuildConfig.FLAVOR);
                        }
                        C108522a.m180456a(view3, false);
                    }
                }
            }
        } else {
            C9406a aVar2 = this.f301939a.f301941b;
            if (aVar2 != null) {
                aVar2.mo17601g();
                return true;
            }
        }
        return false;
    }
}
