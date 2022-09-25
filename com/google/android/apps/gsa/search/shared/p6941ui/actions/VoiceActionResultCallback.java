package com.google.android.apps.gsa.search.shared.p6941ui.actions;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.C87420h;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.actions.VoiceActionResultCallback */
/* compiled from: PG */
public class VoiceActionResultCallback implements Parcelable, C91096f {
    public static final Parcelable.Creator CREATOR = new C88520n();

    /* renamed from: a */
    private static final C59071e f239221a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.ui.actions.VoiceActionResultCallback");

    /* renamed from: b */
    private final int f239222b;

    /* renamed from: c */
    private final C58833ax f239223c;

    public VoiceActionResultCallback(int i, C58833ax axVar) {
        this.f239222b = i;
        this.f239223c = axVar;
    }

    /* renamed from: b */
    private final void m142876b(C87420h hVar, Intent intent) {
        if (this.f239222b != 1) {
            C59104x d = f239221a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ActivityResultHandler");
            ((C59052c) ((C59052c) d).mo56372aa(9787)).mo56387q("Can't handle result: %d", this.f239222b);
            return;
        }
        Uri data = intent.getData();
        try {
            hVar.mo81196b(ContentUris.parseId(data));
        } catch (NumberFormatException | UnsupportedOperationException e) {
            C59104x d2 = f239221a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ActivityResultHandler");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(9786)).mo56389s("Unexpected contact selection data: %s", data);
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        if (i != -1) {
            return true;
        }
        if (this.f239223c.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            m142876b((C87420h) this.f239223c.mo56107c(), intent);
        } else if (context instanceof C87420h) {
            m142876b((C87420h) context, intent);
        } else {
            C59104x d = f239221a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ActivityResultHandler");
            ((C59052c) ((C59052c) d).mo56372aa(9788)).mo56389s("Not a supported context: %s", context);
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f239222b);
    }
}
