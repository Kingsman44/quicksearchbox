package com.google.android.libraries.onegoogle.accountmenu;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.w */
/* compiled from: PG */
final class C30796w implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C30799z f83101a;

    public C30796w(C30799z zVar) {
        this.f83101a = zVar;
    }

    public final void onViewAttachedToWindow(View view) {
        C30306o i = this.f83101a.f83105a.mo35858i();
        i.f81934a.f81880a.add(this.f83101a.f83107c);
        C30799z zVar = this.f83101a;
        SelectedAccountDisc selectedAccountDisc = zVar.f83106b;
        selectedAccountDisc.f81902c.f81550d.add(zVar.f83109e);
        if (this.f83101a.f83105a.mo35866q().mo56113h()) {
            ((C30313v) this.f83101a.f83105a.mo35866q().mo56107c()).f81975a.add(this.f83101a.f83108d);
        }
        this.f83101a.mo36486e();
        C30799z zVar2 = this.f83101a;
        boolean z = false;
        if (zVar2.f83105a.mo35866q().mo56113h() && ((C30313v) this.f83101a.f83105a.mo35866q().mo56107c()).f81976b) {
            z = true;
        }
        zVar2.mo36485d(z);
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.f83101a.f83105a.mo35866q().mo56113h()) {
            ((C30313v) this.f83101a.f83105a.mo35866q().mo56107c()).f81975a.remove(this.f83101a.f83108d);
        }
        C30306o i = this.f83101a.f83105a.mo35858i();
        i.f81934a.f81880a.remove(this.f83101a.f83107c);
        C30799z zVar = this.f83101a;
        SelectedAccountDisc selectedAccountDisc = zVar.f83106b;
        selectedAccountDisc.f81902c.f81550d.remove(zVar.f83109e);
    }
}
