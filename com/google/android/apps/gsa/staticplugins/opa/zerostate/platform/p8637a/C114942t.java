package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.p033v7.widget.C0551bu;
import android.support.p033v7.widget.C0552bv;
import android.support.p033v7.widget.C0569cl;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0642fd;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114735e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114756j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28291i;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.material.bottomsheet.C44565p;
import com.google.assistant.p3994s.p3995a.C53064aa;
import com.google.assistant.p3994s.p3995a.C53070ag;
import com.google.assistant.p3994s.p3995a.C53469y;
import com.google.assistant.p3994s.p3995a.C53470z;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p5027o.C64968c;
import com.google.protos.p4985f.p5027o.C64969d;
import dagger.C68214a;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.t */
/* compiled from: PG */
public final class C114942t extends C0642fd implements C114906ae {

    /* renamed from: a */
    public final C44565p f318900a;

    /* renamed from: b */
    public final C114931i f318901b;

    /* renamed from: c */
    public final C114919ar f318902c;

    /* renamed from: d */
    public final C114756j f318903d;

    /* renamed from: e */
    public EditText f318904e;

    /* renamed from: f */
    public EditText f318905f;

    /* renamed from: g */
    public Button f318906g;

    /* renamed from: h */
    public C53070ag f318907h;

    /* renamed from: i */
    public boolean f318908i;

    /* renamed from: j */
    private final C68214a f318909j;

    /* renamed from: k */
    private final Context f318910k;

    /* renamed from: l */
    private final C114935m f318911l;

    /* renamed from: m */
    private final C68214a f318912m;

    /* renamed from: n */
    private final C114742l f318913n;

    /* renamed from: o */
    private final C68214a f318914o;

    /* renamed from: p */
    private LinearLayoutManager f318915p;

    /* renamed from: q */
    private C28293k f318916q;

    public C114942t(C68214a aVar, Context context, C114931i iVar, C114935m mVar, C114919ar arVar, C68214a aVar2, C114742l lVar, C68214a aVar3, C44565p pVar, C114756j jVar) {
        this.f318909j = aVar;
        this.f318910k = context;
        this.f318901b = iVar;
        this.f318911l = mVar;
        this.f318902c = arVar;
        this.f318912m = aVar2;
        this.f318913n = lVar;
        this.f318914o = aVar3;
        this.f318900a = pVar;
        this.f318903d = jVar;
    }

    /* renamed from: h */
    public final View mo101694h() {
        C53064aa aaVar;
        C53064aa aaVar2;
        ColorStateList colorStateList;
        C53064aa aaVar3;
        View inflate = View.inflate(this.f318910k, R.layout.zero_state_fab_add_list_items_sheet, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.zero_state_fab_list_title_edit_text);
        this.f318904e = editText;
        editText.setHint(((C73841bf) this.f318914o.mo27525b()).mo65322a().getString(R.string.zero_state_fab_list_title_edit_hint));
        boolean z = true;
        this.f318904e.setVisibility(true != mo101733p() ? 0 : 8);
        EditText editText2 = this.f318904e;
        editText2.getClass();
        editText2.addTextChangedListener(new C114941s(this));
        EditText editText3 = (EditText) inflate.findViewById(R.id.zero_state_fab_add_item_edit_text);
        this.f318905f = editText3;
        Resources a = ((C73841bf) this.f318914o.mo27525b()).mo65322a();
        boolean p = mo101733p();
        int i = R.string.zero_state_fab_add_list_item_edit_hint;
        if (p) {
            C53070ag agVar = this.f318907h;
            agVar.getClass();
            if (agVar.f139076b == 2) {
                aaVar3 = (C53064aa) agVar.f139077c;
            } else {
                aaVar3 = C53064aa.f139063d;
            }
            C64969d dVar = aaVar3.f139066b;
            if (dVar == null) {
                dVar = C64969d.f175948d;
            }
            int a2 = C64968c.m96488a(dVar.f175952c);
            if (a2 != 0 && a2 == 2) {
                i = R.string.zero_state_fab_add_shopping_item_edit_hint;
            }
        }
        editText3.setHint(a.getString(i));
        EditText editText4 = this.f318905f;
        editText4.getClass();
        editText4.setOnEditorActionListener(new C114939q(this));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.zero_state_fab_add_item_button);
        mo101731n(imageView, false);
        imageView.setOnClickListener(new C89943l(new C114938p(this)));
        EditText editText5 = this.f318905f;
        editText5.getClass();
        editText5.addTextChangedListener(new C114940r(this, imageView));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.zero_state_fab_add_list_items_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        this.f318915p = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        C114931i iVar = this.f318901b;
        C53070ag agVar2 = this.f318907h;
        agVar2.getClass();
        if (agVar2.f139076b == 2) {
            aaVar = (C53064aa) agVar2.f139077c;
        } else {
            aaVar = C53064aa.f139063d;
        }
        C53470z zVar = aaVar.f139067c;
        if (zVar == null) {
            zVar = C53470z.f140330c;
        }
        C62971cq cqVar = zVar.f140332a;
        iVar.f318881b.clear();
        iVar.f318881b.addAll(cqVar);
        iVar.f318884e = C28293k.m52908e(new C28292j(81092), new C28293k[0]);
        this.f318901b.mObservable.registerObserver(this);
        C114935m mVar = this.f318911l;
        C53070ag agVar3 = this.f318907h;
        agVar3.getClass();
        if (agVar3.f139076b == 2) {
            aaVar2 = (C53064aa) agVar3.f139077c;
        } else {
            aaVar2 = C53064aa.f139063d;
        }
        C53470z zVar2 = aaVar2.f139067c;
        if (zVar2 == null) {
            zVar2 = C53470z.f140330c;
        }
        C53469y yVar = zVar2.f140333b;
        if (yVar == null) {
            yVar = C53469y.f140323e;
        }
        mVar.f318893c = yVar;
        mVar.mObservable.mo2879a();
        recyclerView.setAdapter(new C0552bv(C0551bu.f2144a, Arrays.asList(new C0640fb[]{this.f318901b, this.f318911l})));
        recyclerView.addItemDecoration$ar$ds(new C0569cl(recyclerView.getContext(), 1));
        Button button = (Button) inflate.findViewById(R.id.zero_state_fab_save_button);
        this.f318906g = button;
        button.getClass();
        button.setText(((C73841bf) this.f318914o.mo27525b()).mo65322a().getString(R.string.zero_state_fab_save_button_title));
        Button button2 = this.f318906g;
        button2.getClass();
        if (C90962a.m148577a(this.f318902c.f318856a)) {
            colorStateList = this.f318910k.getResources().getColorStateList(R.color.zero_state_fab_save_button_text_color_dark_mode);
        } else {
            colorStateList = this.f318910k.getResources().getColorStateList(R.color.zero_state_fab_save_button_text_color);
        }
        button2.setTextColor(colorStateList);
        Button button3 = this.f318906g;
        button3.getClass();
        if (this.f318901b.getItemCount() <= 0) {
            z = false;
        }
        button3.setEnabled(z);
        Button button4 = this.f318906g;
        button4.getClass();
        button4.setOnClickListener(new C89943l(new C114937o(this)));
        C28293k kVar = this.f318901b.f318884e;
        this.f318916q = kVar;
        kVar.getClass();
        C28295m.m52919e(recyclerView, ((C28257a) kVar).f76908a);
        C28293k kVar2 = this.f318916q;
        kVar2.getClass();
        C28293k a3 = C114919ar.m190496a(imageView, 96731, kVar2);
        this.f318916q = a3;
        Button button5 = this.f318906g;
        button5.getClass();
        a3.getClass();
        this.f318916q = C114919ar.m190496a(button5, 96733, a3);
        C28291i iVar2 = new C28291i(recyclerView, this.f318913n);
        iVar2.f76970d = this.f318901b;
        iVar2.mo33786b();
        recyclerView.getViewTreeObserver().dispatchOnGlobalLayout();
        this.f318908i = false;
        return inflate;
    }

    /* renamed from: i */
    public final View mo101695i() {
        return mo101733p() ? this.f318905f : this.f318904e;
    }

    /* renamed from: j */
    public final C28293k mo101696j() {
        return this.f318916q;
    }

    /* renamed from: k */
    public final void mo101730k() {
        EditText editText = this.f318905f;
        editText.getClass();
        if (!editText.getText().toString().isEmpty()) {
            C114931i iVar = this.f318901b;
            EditText editText2 = this.f318905f;
            editText2.getClass();
            iVar.f318881b.add(0, editText2.getText().toString());
            iVar.notifyItemInserted(0);
            iVar.mObservable.mo2881c(0, iVar.f318881b.size(), (Object) null);
            LinearLayoutManager linearLayoutManager = this.f318915p;
            linearLayoutManager.getClass();
            linearLayoutManager.scrollToPositionWithOffset(0, 0);
            EditText editText3 = this.f318905f;
            editText3.getClass();
            editText3.setText((CharSequence) null);
        }
    }

    /* renamed from: l */
    public final void mo101697l() {
        this.f318901b.mObservable.unregisterObserver(this);
        if (!this.f318908i) {
            ((C114735e) this.f318912m.mo27525b()).mo101557e(C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_DISMISSED);
        }
    }

    /* renamed from: m */
    public final void mo101698m(C53070ag agVar) {
        this.f318907h = agVar;
    }

    /* renamed from: n */
    public final void mo101731n(ImageView imageView, boolean z) {
        imageView.setEnabled(z);
        ((C91189au) this.f318909j.mo27525b()).mo85421i(true != z ? "https://www.gstatic.com/images/icons/material/system_gm/2x/add_circle_grey600_24dp.png" : "https://www.gstatic.com/images/icons/material/system_gm/2x/add_circle_googblue_24dp.png", imageView);
    }

    /* renamed from: o */
    public final boolean mo101732o() {
        if (mo101733p()) {
            if (this.f318901b.getItemCount() <= 0) {
                EditText editText = this.f318905f;
                editText.getClass();
                if (!editText.getText().toString().isEmpty()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        EditText editText2 = this.f318904e;
        editText2.getClass();
        return !editText2.getText().toString().isEmpty();
    }

    /* renamed from: p */
    public final boolean mo101733p() {
        C53064aa aaVar;
        C53070ag agVar = this.f318907h;
        agVar.getClass();
        if (agVar.f139076b == 2) {
            aaVar = (C53064aa) agVar.f139077c;
        } else {
            aaVar = C53064aa.f139063d;
        }
        return (aaVar.f139065a & 1) != 0;
    }

    /* renamed from: b */
    public final void mo2832b(int i, int i2) {
        Button button = this.f318906g;
        button.getClass();
        button.setEnabled(mo101732o());
    }
}
