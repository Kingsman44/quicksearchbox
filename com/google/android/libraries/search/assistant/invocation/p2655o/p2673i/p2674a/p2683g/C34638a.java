package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2683g;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.io.IOException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.g.a */
/* compiled from: PG */
public final class C34638a {

    /* renamed from: a */
    private static final C59071e f91973a = C59071e.m91331h();

    /* renamed from: b */
    private final Context f91974b;

    public C34638a(Context context) {
        C69664n.m101061g(context, "context");
        this.f91974b = context;
    }

    /* renamed from: a */
    public final void mo39455a(String str) {
        C69664n.m101061g(str, "uri");
        try {
            ParcelFileDescriptor openFileDescriptor = this.f91974b.getContentResolver().openFileDescriptor(Uri.parse(str), C33259r.f88929b);
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
            }
        } catch (IOException e) {
            C59052c cVar = (C59052c) ((C59052c) f91973a.mo56226d()).mo56382g(e);
            cVar.mo56379ah(new C59094n(51417));
            cVar.mo56389s("Failed to open/close legacy hotword uri(%s).", str);
        }
    }
}
