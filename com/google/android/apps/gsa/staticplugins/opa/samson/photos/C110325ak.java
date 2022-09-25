package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.graphics.Point;
import android.text.format.DateUtils;
import android.widget.RelativeLayout;
import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.C110117c;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;
import org.p5633c.p5634a.C72210d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.ak */
/* compiled from: PG */
public final /* synthetic */ class C110325ak implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C110332ar f307490a;

    public /* synthetic */ C110325ak(C110332ar arVar) {
        this.f307490a = arVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        String str;
        C110117c cVar;
        C110332ar arVar = this.f307490a;
        Long l = (Long) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (arVar.f307516k) {
            str = C114874f.m190405e(arVar.f307525t.getContext(), new C72210d((Object) l), false, false);
        } else {
            str = DateUtils.formatDateTime(arVar.f307525t.getContext(), l.longValue(), 1);
        }
        arVar.f307525t.setText(str);
        if (!arVar.f307516k) {
            C110356bo boVar = arVar.f307524s;
            long longValue = l.longValue();
            boVar.f307574e.mo28212l("resetPositionProvider", new C110354bm(boVar));
            long j = boVar.f307576g;
            if (j == 0) {
                boVar.f307576g = longValue;
            } else if (longValue - j >= TimeUnit.MINUTES.toMillis(1)) {
                if (!(boVar.f307573d.getWidth() == 0 || boVar.f307573d.getHeight() == 0)) {
                    boVar.f307574e.mo28212l("setNewLayoutPosition", new C110355bn(boVar));
                }
                boVar.f307576g = longValue;
            }
        } else if (arVar.f307530y != null && (cVar = arVar.f307528w) != null) {
            Point a = cVar.mo98399a();
            float f = ((float) a.x) * arVar.f307529x;
            float f2 = ((float) a.y) * arVar.f307529x;
            RelativeLayout relativeLayout = arVar.f307530y;
            relativeLayout.getClass();
            relativeLayout.setTranslationX(f);
            RelativeLayout relativeLayout2 = arVar.f307530y;
            relativeLayout2.getClass();
            relativeLayout2.setTranslationY(f2);
        }
    }
}
