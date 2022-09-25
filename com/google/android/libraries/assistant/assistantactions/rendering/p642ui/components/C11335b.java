package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.p299c.p300a.C5862k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11305c;
import com.google.common.p4526f.C59071e;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.components.b */
/* compiled from: PG */
public final class C11335b {

    /* renamed from: b */
    private static final C59071e f36873b = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.components.b");

    /* renamed from: a */
    public boolean f36874a;

    /* renamed from: b */
    public final void mo19807b(C6007z zVar, Context context, int i) {
        if (i != 1) {
            int argb = Color.argb(0, PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID);
            Resources.Theme theme = context.getTheme();
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(R.attr.circle_crop_border_color, typedValue, true)) {
                argb = typedValue.data;
            }
            C6007z zVar2 = (C6007z) zVar.mo11969V(new C11305c(Math.round(theme.resolveAttribute(R.attr.circle_crop_border_thickness, typedValue, true) ? typedValue.getDimension(context.getResources().getDisplayMetrics()) : 0.0f), argb));
            return;
        }
        C6007z zVar3 = (C6007z) zVar.mo11969V(new C5862k());
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0104 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.C6007z mo19806a(android.content.Context r7, com.google.assistant.p3897e.p3902c.p3907c.C51012dc r8, boolean r9, android.graphics.drawable.Drawable r10) {
        /*
            r6 = this;
            int r0 = r8.f132816b
            int r0 = com.google.assistant.p3897e.p3902c.p3907c.C51014de.m86008a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r0 = 1
        L_0x000a:
            int r0 = r0 + -1
            r2 = 0
            if (r0 == 0) goto L_0x0035
            r9 = 3
            if (r0 == r9) goto L_0x0015
        L_0x0012:
            r8 = r2
            goto L_0x00dc
        L_0x0015:
            int r9 = r8.f132815a
            r9 = r9 & 2
            if (r9 == 0) goto L_0x0012
            java.lang.String r8 = r8.f132817c
            long r8 = java.lang.Long.parseLong(r8)
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.CONTENT_URI
            android.net.Uri r8 = android.content.ContentUris.withAppendedId(r0, r8)
            com.bumptech.glide.manager.r r9 = com.bumptech.glide.C5543d.m14323c(r7)
            com.bumptech.glide.ad r9 = r9.mo12423b(r7)
            com.bumptech.glide.z r8 = r9.mo11870h(r8)
            goto L_0x00dc
        L_0x0035:
            if (r9 == 0) goto L_0x0068
            int r9 = r8.f132815a
            r9 = r9 & 32
            if (r9 == 0) goto L_0x0068
            java.lang.String r9 = r8.f132821g
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0048 }
            android.graphics.drawable.Drawable r9 = r0.getApplicationIcon(r9)     // Catch:{ NameNotFoundException -> 0x0048 }
            goto L_0x0058
        L_0x0048:
            r0 = move-exception
            com.google.common.f.e r3 = f36873b
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Invalid package name: %s"
            r5 = 43182(0xa8ae, float:6.0511E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56389s(r4, r9)
            r9 = r2
        L_0x0058:
            if (r9 == 0) goto L_0x0068
            com.bumptech.glide.manager.r r8 = com.bumptech.glide.C5543d.m14323c(r7)
            com.bumptech.glide.ad r8 = r8.mo12423b(r7)
            com.bumptech.glide.z r8 = r8.mo11869g(r9)
            goto L_0x00dc
        L_0x0068:
            int r9 = r8.f132815a
            r0 = r9 & 2
            if (r0 == 0) goto L_0x00c5
            java.lang.String r9 = r8.f132817c
            java.lang.String r0 = "iris_confirmation_light.png"
            boolean r0 = r9.endsWith(r0)
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "iris_confirmation_dark.png"
            boolean r0 = r9.endsWith(r0)
            if (r0 == 0) goto L_0x0081
            goto L_0x009f
        L_0x0081:
            java.lang.String r0 = "cancel_grey600_24dp.png"
            boolean r9 = r9.endsWith(r0)
            if (r9 == 0) goto L_0x009d
            com.bumptech.glide.manager.r r9 = com.bumptech.glide.C5543d.m14323c(r7)
            com.bumptech.glide.ad r9 = r9.mo12423b(r7)
            r0 = 2131231543(0x7f080337, float:1.807917E38)
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            com.bumptech.glide.z r9 = r9.mo11869g(r0)
            goto L_0x00b2
        L_0x009d:
            r9 = r2
            goto L_0x00b2
        L_0x009f:
            com.bumptech.glide.manager.r r9 = com.bumptech.glide.C5543d.m14323c(r7)
            com.bumptech.glide.ad r9 = r9.mo12423b(r7)
            r0 = 2131233139(0x7f080973, float:1.8082407E38)
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            com.bumptech.glide.z r9 = r9.mo11869g(r0)
        L_0x00b2:
            if (r9 != 0) goto L_0x00c3
            com.bumptech.glide.manager.r r9 = com.bumptech.glide.C5543d.m14323c(r7)
            com.bumptech.glide.ad r9 = r9.mo12423b(r7)
            java.lang.String r8 = r8.f132817c
            com.bumptech.glide.z r8 = r9.mo11873k(r8)
            goto L_0x00dc
        L_0x00c3:
            r8 = r9
            goto L_0x00dc
        L_0x00c5:
            r9 = r9 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0012
            com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a r9 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a
            java.lang.String r8 = r8.f132824j
            r9.<init>(r7, r8, r8)
            com.bumptech.glide.manager.r r8 = com.bumptech.glide.C5543d.m14323c(r7)
            com.bumptech.glide.ad r8 = r8.mo12423b(r7)
            com.bumptech.glide.z r8 = r8.mo11869g(r9)
        L_0x00dc:
            if (r8 != 0) goto L_0x00ec
            r6.f36874a = r1
            com.bumptech.glide.manager.r r8 = com.bumptech.glide.C5543d.m14323c(r7)
            com.bumptech.glide.ad r7 = r8.mo12423b(r7)
            com.bumptech.glide.z r8 = r7.mo11869g(r2)
        L_0x00ec:
            if (r10 == 0) goto L_0x0104
            com.bumptech.glide.f.a r7 = r8.mo11954G(r10)
            com.bumptech.glide.z r7 = (com.bumptech.glide.C6007z) r7
            com.bumptech.glide.f.a r7 = r7.mo11953F(r10)
            com.bumptech.glide.z r7 = (com.bumptech.glide.C6007z) r7
            com.bumptech.glide.f.a r7 = r7.mo11964Q(r10)
            com.bumptech.glide.z r7 = (com.bumptech.glide.C6007z) r7
            r8 = 0
            r6.f36874a = r8
            return r7
        L_0x0104:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.C11335b.mo19806a(android.content.Context, com.google.assistant.e.c.c.dc, boolean, android.graphics.drawable.Drawable):com.bumptech.glide.z");
    }
}
