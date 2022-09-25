package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.now.shared.p6421ui.C83423l;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104478n;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.cx */
/* compiled from: PG */
final class C104768cx implements C83423l {

    /* renamed from: a */
    final /* synthetic */ C104769cy f291805a;

    public C104768cx(C104769cy cyVar) {
        this.f291805a = cyVar;
    }

    /* renamed from: a */
    public final void mo76758a(Drawable drawable) {
        if (!this.f291805a.f63126Q.mo28316z()) {
            C59104x d = C104769cy.f291806c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ModuleRenderer");
            ((C59052c) ((C59052c) d).mo56372aa(22047)).mo56386p("Key listener called when not bound");
            int i = C90755l.f253831a;
            return;
        }
        C104478n nVar = this.f291805a.f291807d;
        if (nVar == null || ((Integer) ((C23249a) nVar.mo94223m()).mo28725a()).intValue() == 0) {
            Bitmap bitmap = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
            if (bitmap != null) {
                this.f291805a.f63126Q.mo28345s("EVENT_KEY_COLOR_IMAGE_DOWNLOADED", "ModuleRenderer", bitmap);
            }
        }
    }
}
