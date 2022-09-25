package com.google.android.apps.search.webglide.webcontent;

import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.webglide.webcontent.l */
/* compiled from: PG */
final class C142253l implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C142255n f385918a;

    /* renamed from: b */
    final /* synthetic */ ImageButton f385919b;

    /* renamed from: c */
    final /* synthetic */ C28439i f385920c;

    public C142253l(C142255n nVar, ImageButton imageButton, C28439i iVar) {
        this.f385918a = nVar;
        this.f385919b = imageButton;
        this.f385920c = iVar;
    }

    public final void onClick(View view) {
        this.f385918a.mo117094a(this.f385919b);
        C142255n nVar = this.f385918a;
        ImageButton imageButton = this.f385919b;
        C28439i iVar = this.f385920c;
        C69664n.m101060f(iVar, "overflowMenuButtonCVE");
        PopupMenu popupMenu = new PopupMenu(nVar.f385926d.getContext(), imageButton);
        popupMenu.getMenuInflater().inflate(R.menu.webglide_popup_menu, popupMenu.getMenu());
        popupMenu.setForceShowIcon(true);
        C28313c a = nVar.f385927e.f76990a.mo33805a(C28427h.m53115a(153839));
        C28452b bVar = new C28452b(iVar);
        bVar.mo33907a(Integer.valueOf(R.id.webglide_feedback), a);
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(nVar.f385929g.mo51611a(new C142254m(nVar, bVar), "Clicked Send Feedback button in popup menu."));
    }
}
