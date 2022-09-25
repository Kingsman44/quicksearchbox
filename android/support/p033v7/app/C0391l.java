package android.support.p033v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;

/* renamed from: android.support.v7.app.l */
/* compiled from: PG */
public class C0391l {

    /* renamed from: a */
    public final C0388i f1347a;

    /* renamed from: b */
    private final int f1348b;

    public C0391l(Context context) {
        this(context, C0392m.m1300a(context, 0));
    }

    /* renamed from: a */
    public final void mo1294a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        C0388i iVar = this.f1347a;
        iVar.f1337r = charSequenceArr;
        iVar.f1339t = onClickListener;
    }

    /* renamed from: b */
    public final void mo1295b(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        C0388i iVar = this.f1347a;
        iVar.f1337r = charSequenceArr;
        iVar.f1339t = onClickListener;
        iVar.f1345z = i;
        iVar.f1344y = true;
    }

    /* renamed from: c */
    public void mo1296c(int i) {
        C0388i iVar = this.f1347a;
        iVar.f1341v = null;
        iVar.f1340u = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: android.support.v7.app.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.widget.ListAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.support.v7.app.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: android.support.v7.app.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.support.v7.app.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: android.support.v7.app.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.p033v7.app.C0392m create() {
        /*
            r14 = this;
            android.support.v7.app.m r0 = new android.support.v7.app.m
            android.support.v7.app.i r1 = r14.f1347a
            android.content.Context r1 = r1.f1320a
            int r2 = r14.f1348b
            r0.<init>(r1, r2)
            android.support.v7.app.i r1 = r14.f1347a
            android.support.v7.app.AlertController r2 = r0.f1349a
            android.view.View r3 = r1.f1325f
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x0018
            r2.f1125y = r3
            goto L_0x0049
        L_0x0018:
            java.lang.CharSequence r3 = r1.f1324e
            if (r3 == 0) goto L_0x001f
            r2.mo1108c(r3)
        L_0x001f:
            android.graphics.drawable.Drawable r3 = r1.f1323d
            if (r3 == 0) goto L_0x0033
            r2.f1121u = r3
            r2.f1120t = r10
            android.widget.ImageView r4 = r2.f1122v
            if (r4 == 0) goto L_0x0033
            r4.setVisibility(r10)
            android.widget.ImageView r4 = r2.f1122v
            r4.setImageDrawable(r3)
        L_0x0033:
            int r3 = r1.f1322c
            if (r3 == 0) goto L_0x0049
            r2.f1121u = r9
            r2.f1120t = r3
            android.widget.ImageView r3 = r2.f1122v
            if (r3 == 0) goto L_0x0049
            r3.setVisibility(r10)
            android.widget.ImageView r3 = r2.f1122v
            int r4 = r2.f1120t
            r3.setImageResource(r4)
        L_0x0049:
            java.lang.CharSequence r3 = r1.f1326g
            if (r3 == 0) goto L_0x0050
            r2.mo1107b(r3)
        L_0x0050:
            java.lang.CharSequence r3 = r1.f1327h
            if (r3 == 0) goto L_0x005a
            r4 = -1
            android.content.DialogInterface$OnClickListener r5 = r1.f1328i
            r2.mo1110h(r4, r3, r5)
        L_0x005a:
            java.lang.CharSequence r3 = r1.f1329j
            if (r3 == 0) goto L_0x0064
            r4 = -2
            android.content.DialogInterface$OnClickListener r5 = r1.f1330k
            r2.mo1110h(r4, r3, r5)
        L_0x0064:
            java.lang.CharSequence r3 = r1.f1331l
            if (r3 == 0) goto L_0x006e
            r4 = -3
            android.content.DialogInterface$OnClickListener r5 = r1.f1332m
            r2.mo1110h(r4, r3, r5)
        L_0x006e:
            java.lang.CharSequence[] r3 = r1.f1337r
            r11 = 1
            if (r3 != 0) goto L_0x0077
            android.widget.ListAdapter r3 = r1.f1338s
            if (r3 == 0) goto L_0x00dd
        L_0x0077:
            android.view.LayoutInflater r3 = r1.f1321b
            int r4 = r2.f1094D
            android.view.View r3 = r3.inflate(r4, r9)
            r12 = r3
            android.support.v7.app.AlertController$RecycleListView r12 = (android.support.p033v7.app.AlertController.RecycleListView) r12
            boolean r3 = r1.f1343x
            if (r3 == 0) goto L_0x0095
            android.support.v7.app.f r13 = new android.support.v7.app.f
            android.content.Context r5 = r1.f1320a
            int r6 = r2.f1095E
            java.lang.CharSequence[] r7 = r1.f1337r
            r3 = r13
            r4 = r1
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x00ac
        L_0x0095:
            boolean r3 = r1.f1344y
            if (r3 == 0) goto L_0x009c
            int r3 = r2.f1096F
            goto L_0x009e
        L_0x009c:
            int r3 = r2.f1097G
        L_0x009e:
            android.widget.ListAdapter r13 = r1.f1338s
            if (r13 == 0) goto L_0x00a3
            goto L_0x00ac
        L_0x00a3:
            android.support.v7.app.k r13 = new android.support.v7.app.k
            android.content.Context r4 = r1.f1320a
            java.lang.CharSequence[] r5 = r1.f1337r
            r13.<init>(r4, r3, r5)
        L_0x00ac:
            r2.f1126z = r13
            int r3 = r1.f1345z
            r2.f1091A = r3
            android.content.DialogInterface$OnClickListener r3 = r1.f1339t
            if (r3 == 0) goto L_0x00bf
            android.support.v7.app.g r3 = new android.support.v7.app.g
            r3.<init>(r1, r2)
            r12.setOnItemClickListener(r3)
            goto L_0x00cb
        L_0x00bf:
            android.content.DialogInterface$OnMultiChoiceClickListener r3 = r1.f1319A
            if (r3 == 0) goto L_0x00cb
            android.support.v7.app.h r3 = new android.support.v7.app.h
            r3.<init>(r1, r12, r2)
            r12.setOnItemClickListener(r3)
        L_0x00cb:
            boolean r3 = r1.f1344y
            if (r3 == 0) goto L_0x00d3
            r12.setChoiceMode(r11)
            goto L_0x00db
        L_0x00d3:
            boolean r3 = r1.f1343x
            if (r3 == 0) goto L_0x00db
            r3 = 2
            r12.setChoiceMode(r3)
        L_0x00db:
            r2.f1106f = r12
        L_0x00dd:
            android.view.View r3 = r1.f1341v
            if (r3 == 0) goto L_0x00e5
            r2.mo1109d(r3)
            goto L_0x00ef
        L_0x00e5:
            int r1 = r1.f1340u
            if (r1 == 0) goto L_0x00ef
            r2.f1107g = r9
            r2.f1108h = r1
            r2.f1109i = r10
        L_0x00ef:
            android.support.v7.app.i r1 = r14.f1347a
            boolean r1 = r1.f1333n
            r0.setCancelable(r1)
            android.support.v7.app.i r1 = r14.f1347a
            boolean r1 = r1.f1333n
            if (r1 == 0) goto L_0x00ff
            r0.setCanceledOnTouchOutside(r11)
        L_0x00ff:
            android.support.v7.app.i r1 = r14.f1347a
            android.content.DialogInterface$OnCancelListener r1 = r1.f1334o
            r0.setOnCancelListener(r1)
            android.support.v7.app.i r1 = r14.f1347a
            android.content.DialogInterface$OnDismissListener r1 = r1.f1335p
            r0.setOnDismissListener(r1)
            android.support.v7.app.i r1 = r14.f1347a
            android.content.DialogInterface$OnKeyListener r1 = r1.f1336q
            if (r1 == 0) goto L_0x0116
            r0.setOnKeyListener(r1)
        L_0x0116:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0391l.create():android.support.v7.app.m");
    }

    /* renamed from: d */
    public void mo1298d() {
        this.f1347a.f1333n = false;
    }

    /* renamed from: e */
    public void mo1299e(int i) {
        this.f1347a.f1322c = i;
    }

    /* renamed from: f */
    public final void mo1300f(int i) {
        C0388i iVar = this.f1347a;
        iVar.f1326g = iVar.f1320a.getText(i);
    }

    /* renamed from: g */
    public void mo1301g(CharSequence charSequence) {
        this.f1347a.f1326g = charSequence;
    }

    public Context getContext() {
        return this.f1347a.f1320a;
    }

    /* renamed from: h */
    public final void mo1303h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C0388i iVar = this.f1347a;
        iVar.f1329j = charSequence;
        iVar.f1330k = onClickListener;
    }

    /* renamed from: i */
    public void mo1304i(int i, DialogInterface.OnClickListener onClickListener) {
        C0388i iVar = this.f1347a;
        iVar.f1331l = iVar.f1320a.getText(i);
        this.f1347a.f1332m = onClickListener;
    }

    /* renamed from: j */
    public void mo1305j(DialogInterface.OnDismissListener onDismissListener) {
        this.f1347a.f1335p = onDismissListener;
    }

    /* renamed from: k */
    public final void mo1306k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C0388i iVar = this.f1347a;
        iVar.f1327h = charSequence;
        iVar.f1328i = onClickListener;
    }

    /* renamed from: l */
    public final void mo1307l(int i) {
        C0388i iVar = this.f1347a;
        iVar.f1324e = iVar.f1320a.getText(i);
    }

    public C0391l setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C0388i iVar = this.f1347a;
        iVar.f1329j = iVar.f1320a.getText(i);
        this.f1347a.f1330k = onClickListener;
        return this;
    }

    public C0391l setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C0388i iVar = this.f1347a;
        iVar.f1327h = iVar.f1320a.getText(i);
        this.f1347a.f1328i = onClickListener;
        return this;
    }

    public C0391l setTitle(CharSequence charSequence) {
        this.f1347a.f1324e = charSequence;
        return this;
    }

    public C0391l setView(View view) {
        C0388i iVar = this.f1347a;
        iVar.f1341v = view;
        iVar.f1340u = 0;
        return this;
    }

    public C0391l(Context context, int i) {
        this.f1347a = new C0388i(new ContextThemeWrapper(context, C0392m.m1300a(context, i)));
        this.f1348b = i;
    }
}
