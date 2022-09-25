package com.google.android.apps.gsa.staticplugins.p7872dw.p7875c;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.staticplugins.dw.c.d */
/* compiled from: PG */
public final /* synthetic */ class C100256d implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C100274v f280383a;

    public /* synthetic */ C100256d(C100274v vVar) {
        this.f280383a = vVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C100274v vVar = this.f280383a;
        Boolean bool = (Boolean) obj;
        vVar.f280415o.setEnabled(bool.booleanValue());
        if (bool.booleanValue()) {
            vVar.f280415o.getIcon().setAlpha(PrivateKeyType.INVALID);
            vVar.f280415o.setTitle(R.string.menu_send_button_content_description);
        } else if (((Integer) ((C100253a) vVar.f280403c).f280374d.f63720e).intValue() != 7) {
            vVar.f280415o.getIcon().setAlpha(130);
            vVar.f280415o.setTitle(R.string.no_option_selected_content_description);
        } else {
            vVar.f280415o.getIcon().setAlpha(130);
            vVar.f280415o.setTitle(R.string.other_reason_not_fill_in_content_description);
        }
    }
}
