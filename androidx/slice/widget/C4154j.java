package androidx.slice.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.C4106e;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.SliceSpec;
import androidx.slice.p194a.C4094a;
import androidx.slice.p194a.C4101h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.slice.widget.j */
/* compiled from: PG */
public final class C4154j extends C4130ah {

    /* renamed from: a */
    public C4160p f13378a;

    /* renamed from: b */
    public C4160p f13379b;

    /* renamed from: c */
    public ArrayList f13380c = new ArrayList();

    /* renamed from: d */
    public List f13381d;

    /* renamed from: e */
    private C4094a f13382e;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: androidx.slice.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: androidx.slice.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: androidx.slice.a.a} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a2, code lost:
        if (androidx.slice.p194a.C4101h.m11759l(r4, "text", (java.lang.String) null) != null) goto L_0x00a5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4154j(androidx.slice.Slice r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r20.<init>(r21)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f13380c = r2
            androidx.slice.SliceItem r2 = r0.f13268m
            if (r2 == 0) goto L_0x01e6
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r2 = "slice"
            java.lang.String r3 = "actions"
            androidx.slice.SliceItem r4 = androidx.slice.p194a.C4101h.m11758k(r1, r2, r3)
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]
            r7 = 0
            r6[r7] = r3
            r8 = 1
            java.lang.String r9 = "shortcut"
            r6[r8] = r9
            r10 = 0
            if (r4 == 0) goto L_0x0030
            java.util.List r4 = androidx.slice.p194a.C4101h.m11752e(r4, r2, r6, r10)
            goto L_0x0031
        L_0x0030:
            r4 = r10
        L_0x0031:
            if (r4 == 0) goto L_0x0054
            java.util.ArrayList r6 = new java.util.ArrayList
            int r11 = r4.size()
            r6.<init>(r11)
            r11 = 0
        L_0x003d:
            int r12 = r4.size()
            if (r11 >= r12) goto L_0x0055
            java.lang.Object r12 = r4.get(r11)
            androidx.slice.SliceItem r12 = (androidx.slice.SliceItem) r12
            androidx.slice.a.a r13 = new androidx.slice.a.a
            r13.<init>(r12)
            r6.add(r13)
            int r11 = r11 + 1
            goto L_0x003d
        L_0x0054:
            r6 = r10
        L_0x0055:
            r0.f13381d = r6
            r4 = 8
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r6 = "list_item"
            r4[r7] = r6
            r4[r8] = r9
            r4[r5] = r3
            r11 = 3
            java.lang.String r12 = "keywords"
            r4[r11] = r12
            r13 = 4
            java.lang.String r14 = "ttl"
            r4[r13] = r14
            r15 = 5
            java.lang.String r16 = "last_updated"
            r4[r15] = r16
            r17 = 6
            java.lang.String r13 = "horizontal"
            r4[r17] = r13
            r17 = 7
            java.lang.String r19 = "selection_option"
            r4[r17] = r19
            androidx.slice.SliceItem r4 = androidx.slice.p194a.C4101h.m11748a(r1, r2, r10, r4)
            java.lang.String r17 = "see_more"
            if (r4 == 0) goto L_0x00a4
            java.lang.String r15 = r4.f13092b
            boolean r15 = r2.equals(r15)
            if (r15 == 0) goto L_0x00a4
            java.lang.String[] r15 = new java.lang.String[r11]
            r15[r7] = r3
            r15[r8] = r12
            r15[r5] = r17
            boolean r15 = r4.mo8600h(r15)
            if (r15 != 0) goto L_0x00a4
            java.lang.String r15 = "text"
            androidx.slice.SliceItem r15 = androidx.slice.p194a.C4101h.m11759l(r4, r15, r10)
            if (r15 != 0) goto L_0x00a5
        L_0x00a4:
            r4 = r10
        L_0x00a5:
            if (r4 == 0) goto L_0x00b3
            androidx.slice.widget.p r15 = new androidx.slice.widget.p
            r15.<init>(r4, r7)
            r0.f13378a = r15
            java.util.ArrayList r4 = r0.f13380c
            r4.add(r15)
        L_0x00b3:
            java.lang.String[] r4 = new java.lang.String[r8]
            r4[r7] = r17
            androidx.slice.SliceItem r4 = androidx.slice.p194a.C4101h.m11760m(r1, r10, r10, r4)
            java.lang.String r15 = "action"
            if (r4 == 0) goto L_0x00ec
            java.lang.String r10 = r4.f13092b
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L_0x00ec
            androidx.slice.Slice r10 = r4.mo8596d()
            androidx.slice.SliceItem[] r10 = r10.f13088d
            java.util.List r10 = java.util.Arrays.asList(r10)
            int r11 = r10.size()
            if (r11 != r8) goto L_0x00ed
            java.lang.Object r11 = r10.get(r7)
            androidx.slice.SliceItem r11 = (androidx.slice.SliceItem) r11
            java.lang.String r11 = r11.f13092b
            boolean r11 = r15.equals(r11)
            if (r11 == 0) goto L_0x00ed
            java.lang.Object r4 = r10.get(r7)
            androidx.slice.SliceItem r4 = (androidx.slice.SliceItem) r4
            goto L_0x00ed
        L_0x00ec:
            r4 = 0
        L_0x00ed:
            r10 = -1
            if (r4 == 0) goto L_0x00f7
            androidx.slice.widget.p r11 = new androidx.slice.widget.p
            r11.<init>(r4, r10)
            r0.f13379b = r11
        L_0x00f7:
            androidx.slice.SliceItem[] r1 = r1.f13088d
            java.util.List r1 = java.util.Arrays.asList(r1)
            r4 = 0
        L_0x00fe:
            int r11 = r1.size()
            if (r4 >= r11) goto L_0x0178
            java.lang.Object r11 = r1.get(r4)
            androidx.slice.SliceItem r11 = (androidx.slice.SliceItem) r11
            java.lang.String r10 = r11.f13092b
            r21 = r1
            r5 = 5
            java.lang.String[] r1 = new java.lang.String[r5]
            r1[r7] = r3
            r1[r8] = r17
            r19 = 2
            r1[r19] = r12
            r19 = 3
            r1[r19] = r14
            r18 = 4
            r1[r18] = r16
            boolean r1 = r11.mo8600h(r1)
            if (r1 != 0) goto L_0x0171
            boolean r1 = r15.equals(r10)
            if (r1 != 0) goto L_0x0133
            boolean r1 = r2.equals(r10)
            if (r1 == 0) goto L_0x0171
        L_0x0133:
            androidx.slice.widget.p r1 = r0.f13378a
            if (r1 != 0) goto L_0x014c
            java.lang.String[] r1 = r11.f13091a
            boolean r1 = androidx.slice.C4093a.m11737a(r1, r6)
            if (r1 != 0) goto L_0x014c
            androidx.slice.widget.p r1 = new androidx.slice.widget.p
            r1.<init>(r11, r7)
            r0.f13378a = r1
            java.util.ArrayList r10 = r0.f13380c
            r10.add(r7, r1)
            goto L_0x0171
        L_0x014c:
            java.lang.String[] r1 = r11.f13091a
            boolean r1 = androidx.slice.C4093a.m11737a(r1, r6)
            if (r1 == 0) goto L_0x0171
            java.lang.String[] r1 = r11.f13091a
            boolean r1 = androidx.slice.C4093a.m11737a(r1, r13)
            if (r1 == 0) goto L_0x0167
            java.util.ArrayList r1 = r0.f13380c
            androidx.slice.widget.e r10 = new androidx.slice.widget.e
            r10.<init>(r11, r4)
            r1.add(r10)
            goto L_0x0171
        L_0x0167:
            java.util.ArrayList r1 = r0.f13380c
            androidx.slice.widget.p r10 = new androidx.slice.widget.p
            r10.<init>(r11, r4)
            r1.add(r10)
        L_0x0171:
            int r4 = r4 + 1
            r1 = r21
            r5 = 2
            r10 = -1
            goto L_0x00fe
        L_0x0178:
            androidx.slice.widget.p r1 = r0.f13378a
            if (r1 != 0) goto L_0x0190
            java.util.ArrayList r1 = r0.f13380c
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0190
            java.util.ArrayList r1 = r0.f13380c
            java.lang.Object r1 = r1.get(r7)
            androidx.slice.widget.p r1 = (androidx.slice.widget.C4160p) r1
            r0.f13378a = r1
            r1.f13396h = r8
        L_0x0190:
            java.util.ArrayList r1 = r0.f13380c
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x01b7
            java.util.ArrayList r1 = r0.f13380c
            int r2 = r1.size()
            r3 = -1
            int r2 = r2 + r3
            java.lang.Object r1 = r1.get(r2)
            boolean r1 = r1 instanceof androidx.slice.widget.C4149e
            if (r1 == 0) goto L_0x01b7
            java.util.ArrayList r1 = r0.f13380c
            int r2 = r1.size()
            int r2 = r2 + r3
            java.lang.Object r1 = r1.get(r2)
            androidx.slice.widget.e r1 = (androidx.slice.widget.C4149e) r1
            r1.f13362g = r8
        L_0x01b7:
            androidx.slice.widget.p r1 = r0.f13378a
            if (r1 == 0) goto L_0x01be
            androidx.slice.SliceItem r1 = r1.f13389a
            goto L_0x01bf
        L_0x01be:
            r1 = 0
        L_0x01bf:
            if (r1 != 0) goto L_0x01d2
            r2 = 2
            java.lang.String[] r1 = new java.lang.String[r2]
            r1[r7] = r9
            java.lang.String r2 = "title"
            r1[r8] = r2
            androidx.slice.SliceItem r2 = r0.f13268m
            r3 = 0
            androidx.slice.SliceItem r1 = androidx.slice.p194a.C4101h.m11749b(r2, r15, r1, r3)
            goto L_0x01d3
        L_0x01d2:
            r3 = 0
        L_0x01d3:
            if (r1 != 0) goto L_0x01db
            androidx.slice.SliceItem r1 = r0.f13268m
            androidx.slice.SliceItem r1 = androidx.slice.p194a.C4101h.m11759l(r1, r15, r3)
        L_0x01db:
            if (r1 == 0) goto L_0x01e3
            androidx.slice.a.a r10 = new androidx.slice.a.a
            r10.<init>(r1)
            goto L_0x01e4
        L_0x01e3:
            r10 = r3
        L_0x01e4:
            r0.f13382e = r10
        L_0x01e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.widget.C4154j.<init>(androidx.slice.Slice):void");
    }

    /* renamed from: b */
    public static int m11914b(C4130ah ahVar, boolean z, List list) {
        if (ahVar != null) {
            if (ahVar instanceof C4149e) {
                return 1;
            }
            C4160p pVar = (C4160p) ahVar;
            SliceItem sliceItem = pVar.f13389a;
            C4094a aVar = sliceItem != null ? new C4094a(sliceItem) : null;
            SliceItem sliceItem2 = pVar.f13394f;
            if (sliceItem2 != null) {
                return "action".equals(sliceItem2.f13092b) ? 4 : 5;
            }
            if (pVar.f13395g != null) {
                return 6;
            }
            if (aVar != null && aVar.mo8607d()) {
                return 3;
            }
            if (z && list != null) {
                for (int i = 0; i < list.size(); i++) {
                    if (((C4094a) list.get(i)).mo8607d()) {
                        return 3;
                    }
                }
                return 0;
            } else if (pVar.f13393e.size() > 0) {
                return 3;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo8710a(C4137ao aoVar, C4143au auVar) {
        return aoVar.mo8716b(this, auVar);
    }

    /* renamed from: c */
    public final C4094a mo8744c(Context context) {
        SliceItem sliceItem;
        SliceItem sliceItem2;
        C4094a aVar;
        Intent launchIntentForPackage;
        IconCompat iconCompat;
        C4094a aVar2 = this.f13382e;
        if (aVar2 != null) {
            return aVar2;
        }
        SliceItem sliceItem3 = this.f13268m;
        if (sliceItem3 != null) {
            int i = 2;
            SliceItem b = C4101h.m11749b(sliceItem3, "action", new String[]{"title", "shortcut"}, (String[]) null);
            if (b != null) {
                sliceItem2 = C4101h.m11759l(b, "image", "title");
                sliceItem = C4101h.m11759l(b, "text", (String) null);
            } else {
                sliceItem2 = null;
                sliceItem = null;
            }
            if (b == null) {
                b = C4101h.m11759l(this.f13268m, "action", (String) null);
            }
            if (sliceItem2 == null) {
                sliceItem2 = C4101h.m11759l(this.f13268m, "image", "title");
            }
            if (sliceItem == null) {
                sliceItem = C4101h.m11759l(this.f13268m, "text", "title");
            }
            if (sliceItem2 == null) {
                sliceItem2 = C4101h.m11759l(this.f13268m, "image", (String) null);
            }
            if (sliceItem == null) {
                sliceItem = C4101h.m11759l(this.f13268m, "text", (String) null);
            }
            int a = sliceItem2 != null ? C4094a.m11738a(sliceItem2) : 5;
            if (context != null) {
                SliceItem l = C4101h.m11759l(this.f13268m, "slice", (String) null);
                if (l != null) {
                    Uri parse = Uri.parse(l.mo8596d().f13090f);
                    IconCompat iconCompat2 = sliceItem2 != null ? (IconCompat) sliceItem2.f13094d : null;
                    CharSequence charSequence = sliceItem != null ? (CharSequence) sliceItem.f13094d : null;
                    PackageManager packageManager = context.getPackageManager();
                    ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(parse.getAuthority(), 0);
                    ApplicationInfo applicationInfo = resolveContentProvider != null ? resolveContentProvider.applicationInfo : null;
                    if (applicationInfo != null) {
                        if (iconCompat2 == null) {
                            Drawable applicationIcon = packageManager.getApplicationIcon(applicationInfo);
                            if (applicationIcon instanceof BitmapDrawable) {
                                iconCompat = IconCompat.m5204g(((BitmapDrawable) applicationIcon).getBitmap());
                            } else {
                                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(createBitmap);
                                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                                applicationIcon.draw(canvas);
                                iconCompat = IconCompat.m5204g(createBitmap);
                            }
                            iconCompat2 = iconCompat;
                        } else {
                            i = a;
                        }
                        if (charSequence == null) {
                            charSequence = packageManager.getApplicationLabel(applicationInfo);
                        }
                        if (b == null && (launchIntentForPackage = packageManager.getLaunchIntentForPackage(applicationInfo.packageName)) != null) {
                            b = new SliceItem(PendingIntent.getActivity(context, 0, launchIntentForPackage, 67108864), C4106e.m11766a(parse, new ArrayList(), new ArrayList(), (SliceSpec) null), (String) null, new String[0]);
                        }
                        a = i;
                    }
                    if (b == null) {
                        b = new SliceItem(PendingIntent.getActivity(context, 0, new Intent(), 67108864), (Slice) null, (String) null, (String[]) null);
                    }
                    if (!(charSequence == null || iconCompat2 == null)) {
                        aVar = new C4094a(b.mo8595c(), iconCompat2, a, charSequence);
                    }
                }
            } else if (!(sliceItem2 == null || b == null || sliceItem == null)) {
                aVar = new C4094a(b.mo8595c(), (IconCompat) sliceItem2.f13094d, a, (CharSequence) sliceItem.f13094d);
            }
            return aVar;
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo8711d() {
        return super.mo8711d() && this.f13380c.size() > 0;
    }
}
