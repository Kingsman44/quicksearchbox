package com.google.android.libraries.social.peoplekit.common.p3280b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.support.p033v7.widget.C0640fb;
import android.util.Log;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42023p;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.p3273a.p3274a.C41979ar;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.List;

/* renamed from: com.google.android.libraries.social.peoplekit.common.b.c */
/* compiled from: PG */
final class C42083c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Dialog f110001a;

    /* renamed from: b */
    final /* synthetic */ C42084d f110002b;

    public C42083c(C42084d dVar, Dialog dialog) {
        this.f110002b = dVar;
        this.f110001a = dialog;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f110001a.dismiss();
        if (Log.isLoggable("HideSuggestion", 6)) {
            String str = true != this.f110002b.f110004b ? "unhide" : "hide";
            String message = th.getMessage();
            Log.e("HideSuggestion", "Could not " + str + " a suggestion: " + message, th);
        }
        C42084d dVar = this.f110002b;
        C42086f fVar = dVar.f110006d;
        boolean z = dVar.f110004b;
        C42087a.m73676b(fVar.f110014a);
        C0391l lVar = new C0391l(fVar.f110015b);
        boolean e = C42086f.m73670e(th);
        lVar.mo1307l(e ? R.string.peoplekit_hide_suggestion_network_error_title : z ? R.string.peoplekit_hide_suggestion_hide_error_title : R.string.peoplekit_hide_suggestion_unhide_error_title);
        lVar.mo1300f(e ? R.string.peoplekit_hide_suggestion_network_error_text : z ? R.string.peoplekit_hide_suggestion_hide_error_text : R.string.peoplekit_hide_suggestion_unhide_error_text);
        lVar.setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
        C0392m create = lVar.create();
        fVar.mo44595a(create);
        create.show();
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144484y));
        peopleKitVisualElementPath.mo44564a(fVar.f110019f.f109973a);
        fVar.f110018e.mo44577c(-1, peopleKitVisualElementPath);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144485z));
        peopleKitVisualElementPath.mo44564a(this.f110002b.f110006d.f110019f.f109973a);
        this.f110002b.f110006d.f110018e.mo44577c(1, peopleKitVisualElementPath);
        Dialog dialog = this.f110001a;
        if (dialog != null && dialog.isShowing()) {
            Context context = this.f110002b.f110006d.f110015b;
            if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                this.f110001a.dismiss();
            }
        }
        C42084d dVar = this.f110002b;
        C42081a aVar = dVar.f110006d.f110020g;
        if (aVar == null) {
            return;
        }
        if (dVar.f110004b) {
            C41979ar arVar = (C41979ar) aVar;
            arVar.mo44438b((List) null);
            ((C0640fb) aVar).mObservable.mo2879a();
            arVar.f109590o.mo44479a();
            ((C42023p) arVar.f109587l).f109744u = true;
            return;
        }
        C41979ar arVar2 = (C41979ar) aVar;
        arVar2.mo44438b((List) null);
        ((C0640fb) aVar).mObservable.mo2879a();
        arVar2.f109590o.mo44479a();
        ((C42023p) arVar2.f109587l).f109744u = true;
    }
}
