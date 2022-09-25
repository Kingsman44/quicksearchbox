package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.fe */
/* compiled from: PG */
public final class C108343fe extends C108232bc {

    /* renamed from: a */
    public final boolean f301376a;

    /* renamed from: b */
    public final C91097g f301377b;

    /* renamed from: c */
    private final Context f301378c;

    public C108343fe(C91097g gVar, Context context, boolean z) {
        super((byte[]) null);
        this.f301378c = context;
        this.f301376a = z;
        this.f301377b = gVar;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 58164;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 16;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C28292j jVar = this.f301030l;
        if (jVar != null) {
            return C28293k.m52908e(jVar, new C28293k[0]);
        }
        return C28293k.f76979c;
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        LinearLayout linearLayout = blVar.f301097x;
        if (linearLayout != null) {
            TextView textView = (TextView) linearLayout.findViewById(R.id.message_read_text);
            Resources resources = this.f301378c.getResources();
            int i = 1;
            if (true != this.f301376a) {
                i = 2;
            }
            textView.setText(resources.getQuantityString(R.plurals.message_notifications_been_read, i));
            Button button = (Button) blVar.f301097x.findViewById(R.id.launch_read_messages_button);
            String string = this.f301378c.getResources().getString(R.string.read_messages_btn_text);
            button.setText(string);
            button.setOnClickListener(new C108342fd(this, string));
        }
    }
}
