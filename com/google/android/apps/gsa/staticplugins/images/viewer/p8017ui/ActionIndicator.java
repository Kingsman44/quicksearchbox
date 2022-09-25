package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65939q;
import com.google.protos.p5146w.p5149b.p5157c.C65960j;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ActionIndicator */
/* compiled from: PG */
public class ActionIndicator extends LinearLayout {

    /* renamed from: a */
    public ImageView f285413a;

    /* renamed from: b */
    public TextView f285414b;

    public ActionIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static boolean m169567a(C65930h hVar) {
        boolean z;
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C65939q.f179347b);
        hVar.mo58887l(r0);
        if (hVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C65939q.f179347b);
            hVar.mo58887l(r02);
            Object l = hVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            int i = ((C65960j) obj).f179412a;
            if (!((i & 2) == 0 && (i & 1) == 0 && (i & 4) == 0)) {
                z = true;
                return !hVar.f179309h || z;
            }
        }
        z = false;
        if (!hVar.f179309h) {
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f285413a = (ImageView) findViewById(R.id.image_action_icon);
        this.f285414b = (TextView) findViewById(R.id.image_action_text);
    }
}
