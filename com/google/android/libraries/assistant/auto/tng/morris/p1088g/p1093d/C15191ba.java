package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14348fx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14426iu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14574og;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.ba */
/* compiled from: PG */
public final class C15191ba {

    /* renamed from: a */
    public TextView f45598a;

    /* renamed from: b */
    public ImageView f45599b;

    /* renamed from: c */
    public ImageView f45600c;

    /* renamed from: d */
    public C14574og f45601d;

    /* renamed from: e */
    private final C14986h f45602e;

    /* renamed from: f */
    private final C15352z f45603f;

    /* renamed from: g */
    private final C14132bf f45604g;

    /* renamed from: h */
    private TextView f45605h;

    public C15191ba(C14986h hVar, C15352z zVar, C14132bf bfVar) {
        this.f45602e = hVar;
        this.f45603f = zVar;
        this.f45604g = bfVar;
    }

    /* renamed from: a */
    public final void mo22068a(C14574og ogVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        C14348fx fxVar;
        if (this.f45598a == null) {
            LayoutInflater.from(contextThemeWrapper).inflate(true != ogVar.f44069b ? R.layout.message_read : R.layout.message_read_large, viewGroup, true);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.message_read_container);
            this.f45604g.mo21444a(viewGroup2, 116579);
            viewGroup2.getClass();
            this.f45598a = (TextView) viewGroup2.findViewById(R.id.incoming_message_sender_name);
            this.f45605h = (TextView) viewGroup2.findViewById(R.id.message_app_name);
            this.f45599b = (ImageView) viewGroup2.findViewById(R.id.incoming_message_sender_avatar);
            this.f45600c = (ImageView) viewGroup2.findViewById(R.id.message_app_icon);
        }
        C14348fx fxVar2 = ogVar.f44068a;
        if (fxVar2 == null) {
            fxVar2 = C14348fx.f43414h;
        }
        C14574og ogVar2 = this.f45601d;
        if (ogVar2 == null || (fxVar = ogVar2.f44068a) == null || fxVar.f43417b != fxVar2.f43417b) {
            TextView textView = this.f45598a;
            textView.getClass();
            textView.setText(fxVar2.f43416a);
            TextView textView2 = this.f45605h;
            textView2.getClass();
            textView2.setText(this.f45603f.mo22227h(fxVar2.f43418c));
            C15352z zVar = this.f45603f;
            ImageView imageView = this.f45599b;
            imageView.getClass();
            C14361gj gjVar = fxVar2.f43419d;
            if (gjVar == null) {
                gjVar = C14361gj.f43456e;
            }
            zVar.mo22229l(imageView, gjVar, C15189az.f45595a);
            C15352z zVar2 = this.f45603f;
            ImageView imageView2 = this.f45600c;
            imageView2.getClass();
            zVar2.mo22228k(imageView2, fxVar2.f43418c);
            C14986h hVar = this.f45602e;
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14426iu iuVar = (C14426iu) C14427iv.f43643o.createBuilder();
            iuVar.copyOnWrite();
            ((C14427iv) iuVar.instance).f43645a = 17;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14427iv ivVar = (C14427iv) iuVar.build();
            ivVar.getClass();
            lfVar.f43801d = ivVar;
            lfVar.f43800c = 5;
            hVar.mo21875g((C14492lf) gtVar.build());
            this.f45601d = ogVar;
        }
    }
}
