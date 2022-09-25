package com.google.android.libraries.lens.view.filters.p2097a;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.utils.C28135x;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28458c;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.filters.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C25855ae implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C25864an f70241a;

    public /* synthetic */ C25855ae(C25864an anVar) {
        this.f70241a = anVar;
    }

    public final void onClick(View view) {
        C25864an anVar = this.f70241a;
        anVar.f70270n.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(anVar.f70260d));
        Stream stream = DesugarArrays.stream((T[]) anVar.f70268l.mo30538h());
        C25851aa aaVar = anVar.f70266j;
        Objects.requireNonNull(aaVar);
        if (stream.anyMatch(new C25859ai(aaVar))) {
            C25504aj ajVar = anVar.f70268l;
            ajVar.mo30534d(ajVar.mo30538h(), new C25852ab(anVar), 82677);
            return;
        }
        AlertDialog create = new AlertDialog.Builder(anVar.f70264h).create();
        ViewGroup e = C28135x.m52429e(anVar.f70259c);
        LayoutInflater layoutInflater = anVar.f70259c;
        View inflate = layoutInflater.inflate(R.layout.location_permission_dialog, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.message)).setText(layoutInflater.getContext().getString(R.string.lens_location_permission_dialog_text));
        C28135x.m52428d(e, inflate);
        TextView a = C28135x.m52425a(e);
        a.setText(layoutInflater.getContext().getString(R.string.lens_location_permission_dialog_title));
        a.setGravity(8388611);
        a.setCompoundDrawablesWithIntrinsicBounds(R.drawable.quantum_ic_location_on_googblue_24, 0, 0, 0);
        a.setCompoundDrawablePadding(24);
        C28135x.m52427c(e).setText(layoutInflater.getContext().getString(R.string.lens_location_permission_dialog_positive_button));
        C28135x.m52426b(e).setText(layoutInflater.getContext().getString(R.string.lens_location_permission_dialog_negative_button));
        C28135x.m52427c(e).setOnClickListener(new C25860aj(anVar, e, create));
        C28135x.m52426b(e).setOnClickListener(new C25861ak(anVar, e, create));
        create.setOnShowListener(new C28458c(anVar.f70266j, new C25862al(anVar, create, e)));
        create.setView(e);
        create.setCanceledOnTouchOutside(false);
        create.setCancelable(false);
        create.show();
    }
}
