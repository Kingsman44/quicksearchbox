package com.google.android.apps.gsa.staticplugins.p8774u.p8777c;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.c.h */
/* compiled from: PG */
public final /* synthetic */ class C117511h implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C117517n f326193a;

    /* renamed from: b */
    public final /* synthetic */ FrameLayout f326194b;

    public /* synthetic */ C117511h(C117517n nVar, FrameLayout frameLayout) {
        this.f326193a = nVar;
        this.f326194b = frameLayout;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C117517n nVar = this.f326193a;
        FrameLayout frameLayout = this.f326194b;
        Integer num = (Integer) obj;
        if (num.intValue() != 0) {
            if (frameLayout.findViewById(R.id.bottomsheet_content) != null) {
                frameLayout.removeAllViews();
            }
            View inflate = LayoutInflater.from(nVar.f326202b).inflate(num.intValue(), frameLayout, true);
            TextView textView = (TextView) inflate.findViewById(R.id.bottomsheet_dialog_title);
            TextView textView2 = (TextView) inflate.findViewById(R.id.bottomsheet_dialog_message);
            Button button = (Button) inflate.findViewById(R.id.bottomsheet_dialog_positive_button);
            Button button2 = (Button) inflate.findViewById(R.id.bottomsheet_dialog_negative_button);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.bottomsheet_dialog_icon);
            C23251a aVar = ((C117503ah) nVar.f326201a).f326170g;
            aVar.mo28726b(new C117512i(textView));
            if (((C58833ax) aVar.f63720e).mo56113h() && textView != null) {
                textView.setText((CharSequence) ((C58833ax) aVar.f63720e).mo56107c());
                textView.setVisibility(0);
            }
            C23251a aVar2 = ((C117503ah) nVar.f326201a).f326167d;
            Objects.requireNonNull(textView2);
            aVar2.mo28726b(new C117513j(textView2));
            if (!((String) aVar2.f63720e).isEmpty()) {
                textView2.setText((CharSequence) aVar2.f63720e);
            }
            C23251a aVar3 = ((C117503ah) nVar.f326201a).f326168e;
            Objects.requireNonNull(button2);
            aVar3.mo28726b(new C117514k(button2));
            if (!((String) aVar3.f63720e).isEmpty()) {
                button2.setText((CharSequence) aVar3.f63720e);
            }
            C23251a aVar4 = ((C117503ah) nVar.f326201a).f326169f;
            Objects.requireNonNull(button);
            aVar4.mo28726b(new C117514k(button));
            if (!((String) aVar4.f63720e).isEmpty()) {
                button.setText((CharSequence) aVar4.f63720e);
            }
            C23251a aVar5 = ((C117503ah) nVar.f326201a).f326164a;
            Objects.requireNonNull(imageView);
            aVar5.mo28726b(new C117515l(imageView));
            if (!((String) aVar5.f63720e).isEmpty()) {
                imageView.setContentDescription((CharSequence) aVar5.f63720e);
            }
            C23251a aVar6 = ((C117503ah) nVar.f326201a).f326165b;
            aVar6.mo28726b(new C117516m(nVar, imageView));
            if (((Integer) aVar6.f63720e).intValue() != 0) {
                imageView.setImageDrawable(nVar.f326202b.getDrawable(((Integer) aVar6.f63720e).intValue()));
            }
            inflate.findViewById(R.id.bottomsheet_dialog_positive_button).setOnClickListener(new C117508e(nVar));
            inflate.findViewById(R.id.bottomsheet_dialog_negative_button).setOnClickListener(new C117509f(nVar));
            ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.bottomsheet_dialog_close_button);
            if (imageButton != null) {
                imageButton.setOnClickListener(new C117510g(nVar));
            }
        }
    }
}
