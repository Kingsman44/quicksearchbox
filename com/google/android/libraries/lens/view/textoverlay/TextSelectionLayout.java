package com.google.android.libraries.lens.view.textoverlay;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Size;
import android.widget.FrameLayout;
import com.google.android.libraries.lens.common.text.selection.p2006a.C24146d;
import com.google.android.libraries.lens.common.text.selection.p2009ui.C24178s;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;

/* compiled from: PG */
public final class TextSelectionLayout extends FrameLayout {

    /* renamed from: a */
    public C28088u f76383a;

    public TextSelectionLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C28088u uVar = this.f76383a;
        if (uVar != null) {
            C28093z zVar = uVar.f76443a;
            if (i <= 0) {
                ((C58970a) ((C58970a) C28093z.f76448a.mo56226d()).mo56372aa(50199)).mo56386p("The view hasn't been measured yet");
            } else {
                zVar.f76462o = new C28066aa(new RectF(0.0f, 0.0f, (float) i, (float) i2));
                zVar.mo33556h();
            }
            C28079l lVar = zVar.f76450c;
            lVar.f76425m = C58833ax.m90834k(new Size(i, i2));
            lVar.mo33542i();
            C24178s sVar = zVar.f76456i;
            if (sVar != null) {
                C58485gu guVar = sVar.f66070c;
                C58480gp e = C58485gu.m89837e();
                int size = guVar.size();
                for (int i5 = 0; i5 < size; i5++) {
                    e.mo55395g(zVar.mo33551b(((C24146d) guVar.get(i5)).mo29551d()));
                }
                zVar.f76453f.execute(C47810es.m84977q(new C28081n(zVar, e)));
            }
        }
    }

    public TextSelectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextSelectionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
