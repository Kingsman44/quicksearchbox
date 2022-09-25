package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8671d.C115975a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.l */
/* compiled from: PG */
public final class C115992l extends C22939d {

    /* renamed from: a */
    public final C115975a f321649a;

    /* renamed from: b */
    private final Context f321650b;

    /* renamed from: c */
    private boolean f321651c = false;

    public C115992l(C22945j jVar, C115975a aVar, Context context) {
        super(jVar);
        this.f321649a = aVar;
        this.f321650b = context;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f321650b).inflate(R.layout.fingerprint_authentication, (ViewGroup) null, false);
        mo28295iC(frameLayout);
        View findViewById = frameLayout.findViewById(R.id.payments_auth_container);
        findViewById.getClass();
        C28295m.m52919e(findViewById, new C28292j(37470));
        View findViewById2 = frameLayout.findViewById(R.id.payments_auth_fingerprint_dialog);
        findViewById2.getClass();
        C28292j jVar = new C28292j(35522);
        jVar.mo33794h(2);
        C28295m.m52919e(findViewById2, jVar);
        ((C115980ac) this.f321649a).f321615f.mo28685c(new C115991k((ChildStub) frameLayout.findViewById(R.id.payments_auth_password_dialog_stub), findViewById));
        if (!((Boolean) ((C115980ac) this.f321649a).f321616g.f63720e).booleanValue() && !((Boolean) ((C115980ac) this.f321649a).f321614e.f63720e).booleanValue()) {
            Button button = (Button) frameLayout.findViewById(R.id.payments_auth_fingerprint_switch_to_password_button);
            button.getClass();
            C28292j jVar2 = new C28292j(35524);
            jVar2.mo33795i(5);
            C28295m.m52919e(button, jVar2);
            button.setOnClickListener(new C89943l(new C115977a(this)));
            Button button2 = (Button) frameLayout.findViewById(R.id.payments_auth_fingerprint_cancel_button);
            button2.getClass();
            C28292j jVar3 = new C28292j(35523);
            jVar3.mo33795i(5);
            C28295m.m52919e(button2, jVar3);
            button2.setOnClickListener(new C89943l(new C115982b(this)));
            ((C115980ac) this.f321649a).f321612c.mo28726b(new C115983c(frameLayout));
            ((C115980ac) this.f321649a).f321617h.mo28726b(new C115984d(frameLayout));
            ((C115980ac) this.f321649a).f321618i.mo28726b(new C115985e(frameLayout));
            ((C115980ac) this.f321649a).f321610a.mo28726b(new C115986f(frameLayout));
            ((C115980ac) this.f321649a).f321616g.mo28726b(new C115987g(this, findViewById2));
            View findViewById3 = frameLayout.findViewById(R.id.payments_auth_fingerprint_background);
            findViewById3.getClass();
            TextView textView = (TextView) frameLayout.findViewById(R.id.payments_auth_fingerprint_try_again_message);
            textView.getClass();
            ((C115980ac) this.f321649a).f321619j.mo28726b(new C115988h(textView));
            ((C115980ac) this.f321649a).f321613d.mo28726b(new C115989i(textView));
            ((C115980ac) this.f321649a).f321611b.mo28726b(new C115990j(findViewById3));
            if (!this.f321651c) {
                C60321oe a = C28285c.m52874a(findViewById, 1411);
                if (a != null) {
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a = 2 | ufVar.f164093a;
                    ufVar.f164258m = 1411;
                    C89949q.m146525j((C60555uf) tzVar.build(), a, (C63196b) null, (String) null);
                }
                this.f321651c = true;
            }
        }
    }
}
