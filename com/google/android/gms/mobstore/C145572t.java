package com.google.android.gms.mobstore;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.p10813i.C144352a;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.mobstore.t */
/* compiled from: PG */
public final class C145572t extends C143847s {
    public C145572t(Context context) {
        super(context, (Activity) null, C145564l.f393602a, C143724i.f389627f, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo121456a(Uri uri) {
        DeleteFileRequest deleteFileRequest = new DeleteFileRequest(uri);
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145567o(deleteFileRequest);
        dcVar.f389862c = new Feature[]{C144352a.f390914f};
        dcVar.f389863d = 7802;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo121457b(Uri uri, int i) {
        OpenFileDescriptorRequest openFileDescriptorRequest = new OpenFileDescriptorRequest(uri, i);
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145566n(openFileDescriptorRequest);
        dcVar.f389862c = i == 1 ? new Feature[]{C144352a.f390914f} : null;
        dcVar.f389863d = 7801;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: c */
    public final C146006ab mo121458c(Uri uri, Uri uri2) {
        RenameRequest renameRequest = new RenameRequest(uri, uri2);
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145565m(renameRequest);
        dcVar.f389862c = new Feature[]{C144352a.f390915g};
        dcVar.f389861b = false;
        dcVar.f389863d = 7803;
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
