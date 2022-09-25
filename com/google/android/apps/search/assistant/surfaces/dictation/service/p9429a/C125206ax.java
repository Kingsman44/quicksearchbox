package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import android.os.ParcelFileDescriptor;
import p5462h.C69685i;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.ax */
/* compiled from: PG */
final class C125206ax extends C69665o implements C69615a {

    /* renamed from: a */
    public static final C125206ax f345366a = new C125206ax();

    public C125206ax() {
        super(0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        return new C69685i(new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]).getChannel(), createPipe[0]);
    }
}
