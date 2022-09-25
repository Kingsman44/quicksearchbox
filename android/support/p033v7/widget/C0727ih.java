package android.support.p033v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1877c;
import androidx.p106e.p107a.C2189f;
import com.google.android.googlequicksearchbox.R;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.ih */
/* compiled from: PG */
final class C0727ih extends C2189f implements View.OnClickListener {

    /* renamed from: a */
    public int f2571a = 1;

    /* renamed from: j */
    private final SearchView f2572j;

    /* renamed from: k */
    private final SearchableInfo f2573k;

    /* renamed from: l */
    private final Context f2574l;

    /* renamed from: m */
    private final WeakHashMap f2575m;

    /* renamed from: n */
    private final int f2576n;

    /* renamed from: o */
    private ColorStateList f2577o;

    /* renamed from: p */
    private int f2578p = -1;

    /* renamed from: q */
    private int f2579q = -1;

    /* renamed from: r */
    private int f2580r = -1;

    /* renamed from: s */
    private int f2581s = -1;

    /* renamed from: t */
    private int f2582t = -1;

    /* renamed from: u */
    private int f2583u = -1;

    public C0727ih(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f2572j = searchView;
        this.f2573k = searchableInfo;
        this.f2576n = searchView.getSuggestionCommitIconResId();
        this.f2574l = context;
        this.f2575m = weakHashMap;
    }

    /* renamed from: c */
    public static String m2449c(Cursor cursor, String str) {
        return m2453l(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: i */
    private final Drawable m2450i(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f2575m.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        new java.lang.StringBuilder("Single path segment is not a resource ID: ").append(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        throw new java.io.FileNotFoundException("Single path segment is not a resource ID: ".concat(java.lang.String.valueOf(r14)));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00ec */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.drawable.Drawable m2451j(android.net.Uri r14) {
        /*
            r13 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "No resource found for: "
            java.lang.String r2 = "Single path segment is not a resource ID: "
            java.lang.String r3 = "More than two path segments: "
            java.lang.String r4 = "No path: "
            java.lang.String r5 = "Error closing icon stream for "
            java.lang.String r6 = "No package found for authority: "
            java.lang.String r7 = "Failed to open "
            java.lang.String r8 = "No authority: "
            java.lang.String r9 = "Resource does not exist: "
            r10 = 0
            java.lang.String r11 = "android.resource"
            java.lang.String r12 = r14.getScheme()     // Catch:{ FileNotFoundException -> 0x014b }
            boolean r11 = r11.equals(r12)     // Catch:{ FileNotFoundException -> 0x014b }
            if (r11 == 0) goto L_0x00fe
            java.lang.String r5 = r14.getAuthority()     // Catch:{ NotFoundException -> 0x00ec }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ NotFoundException -> 0x00ec }
            if (r7 != 0) goto L_0x00d6
            android.content.Context r7 = r13.f2574l     // Catch:{ NameNotFoundException -> 0x00c0 }
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00c0 }
            android.content.res.Resources r6 = r7.getResourcesForApplication(r5)     // Catch:{ NameNotFoundException -> 0x00c0 }
            java.util.List r7 = r14.getPathSegments()     // Catch:{ NotFoundException -> 0x00ec }
            if (r7 == 0) goto L_0x00aa
            int r4 = r7.size()     // Catch:{ NotFoundException -> 0x00ec }
            r8 = 0
            r11 = 1
            if (r4 != r11) goto L_0x0064
            java.lang.Object r3 = r7.get(r8)     // Catch:{ NumberFormatException -> 0x004e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NumberFormatException -> 0x004e }
            int r2 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x004e }
            goto L_0x0077
        L_0x004e:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NotFoundException -> 0x00ec }
            r3.<init>(r2)     // Catch:{ NotFoundException -> 0x00ec }
            r3.append(r14)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r3 = java.lang.String.valueOf(r14)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ NotFoundException -> 0x00ec }
            r1.<init>(r2)     // Catch:{ NotFoundException -> 0x00ec }
            throw r1     // Catch:{ NotFoundException -> 0x00ec }
        L_0x0064:
            r2 = 2
            if (r4 != r2) goto L_0x0094
            java.lang.Object r2 = r7.get(r11)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.Object r3 = r7.get(r8)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NotFoundException -> 0x00ec }
            int r2 = r6.getIdentifier(r2, r3, r5)     // Catch:{ NotFoundException -> 0x00ec }
        L_0x0077:
            if (r2 == 0) goto L_0x007e
            android.graphics.drawable.Drawable r14 = r6.getDrawable(r2)     // Catch:{ NotFoundException -> 0x00ec }
            return r14
        L_0x007e:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NotFoundException -> 0x00ec }
            r3.<init>(r1)     // Catch:{ NotFoundException -> 0x00ec }
            r3.append(r14)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r3 = java.lang.String.valueOf(r14)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r1 = r1.concat(r3)     // Catch:{ NotFoundException -> 0x00ec }
            r2.<init>(r1)     // Catch:{ NotFoundException -> 0x00ec }
            throw r2     // Catch:{ NotFoundException -> 0x00ec }
        L_0x0094:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NotFoundException -> 0x00ec }
            r2.<init>(r3)     // Catch:{ NotFoundException -> 0x00ec }
            r2.append(r14)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r2 = java.lang.String.valueOf(r14)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r2 = r3.concat(r2)     // Catch:{ NotFoundException -> 0x00ec }
            r1.<init>(r2)     // Catch:{ NotFoundException -> 0x00ec }
            throw r1     // Catch:{ NotFoundException -> 0x00ec }
        L_0x00aa:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NotFoundException -> 0x00ec }
            r2.<init>(r4)     // Catch:{ NotFoundException -> 0x00ec }
            r2.append(r14)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r2 = java.lang.String.valueOf(r14)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r2 = r4.concat(r2)     // Catch:{ NotFoundException -> 0x00ec }
            r1.<init>(r2)     // Catch:{ NotFoundException -> 0x00ec }
            throw r1     // Catch:{ NotFoundException -> 0x00ec }
        L_0x00c0:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NotFoundException -> 0x00ec }
            r2.<init>(r6)     // Catch:{ NotFoundException -> 0x00ec }
            r2.append(r14)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r2 = java.lang.String.valueOf(r14)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r2 = r6.concat(r2)     // Catch:{ NotFoundException -> 0x00ec }
            r1.<init>(r2)     // Catch:{ NotFoundException -> 0x00ec }
            throw r1     // Catch:{ NotFoundException -> 0x00ec }
        L_0x00d6:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NotFoundException -> 0x00ec }
            r2.<init>(r8)     // Catch:{ NotFoundException -> 0x00ec }
            r2.append(r14)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r2 = java.lang.String.valueOf(r14)     // Catch:{ NotFoundException -> 0x00ec }
            java.lang.String r2 = r8.concat(r2)     // Catch:{ NotFoundException -> 0x00ec }
            r1.<init>(r2)     // Catch:{ NotFoundException -> 0x00ec }
            throw r1     // Catch:{ NotFoundException -> 0x00ec }
        L_0x00ec:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x014b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x014b }
            r2.<init>(r9)     // Catch:{ FileNotFoundException -> 0x014b }
            r2.append(r14)     // Catch:{ FileNotFoundException -> 0x014b }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x014b }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x014b }
            throw r1     // Catch:{ FileNotFoundException -> 0x014b }
        L_0x00fe:
            android.content.Context r1 = r13.f2574l     // Catch:{ FileNotFoundException -> 0x014b }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x014b }
            java.io.InputStream r1 = r1.openInputStream(r14)     // Catch:{ FileNotFoundException -> 0x014b }
            if (r1 == 0) goto L_0x0139
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r1, r10)     // Catch:{ all -> 0x0123 }
            r1.close()     // Catch:{ IOException -> 0x0112 }
            goto L_0x0122
        L_0x0112:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x014b }
            r3.<init>(r5)     // Catch:{ FileNotFoundException -> 0x014b }
            r3.append(r14)     // Catch:{ FileNotFoundException -> 0x014b }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x014b }
            android.util.Log.e(r0, r3, r1)     // Catch:{ FileNotFoundException -> 0x014b }
        L_0x0122:
            return r2
        L_0x0123:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0128 }
            goto L_0x0138
        L_0x0128:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x014b }
            r3.<init>(r5)     // Catch:{ FileNotFoundException -> 0x014b }
            r3.append(r14)     // Catch:{ FileNotFoundException -> 0x014b }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x014b }
            android.util.Log.e(r0, r3, r1)     // Catch:{ FileNotFoundException -> 0x014b }
        L_0x0138:
            throw r2     // Catch:{ FileNotFoundException -> 0x014b }
        L_0x0139:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x014b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x014b }
            r2.<init>(r7)     // Catch:{ FileNotFoundException -> 0x014b }
            r2.append(r14)     // Catch:{ FileNotFoundException -> 0x014b }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x014b }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x014b }
            throw r1     // Catch:{ FileNotFoundException -> 0x014b }
        L_0x014b:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Icon not found: "
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r14 = ", "
            r2.append(r14)
            java.lang.String r14 = r1.getMessage()
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            android.util.Log.w(r0, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0727ih.m2451j(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: k */
    private final Drawable m2452k(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f2574l.getPackageName() + "/" + parseInt;
            Drawable i = m2450i(str2);
            if (i != null) {
                return i;
            }
            Drawable a = C1877c.m5125a(this.f2574l, parseInt);
            m2454m(str2, a);
            return a;
        } catch (NumberFormatException unused) {
            Drawable i2 = m2450i(str);
            if (i2 != null) {
                return i2;
            }
            Drawable j = m2451j(Uri.parse(str));
            m2454m(str, j);
            return j;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
            return null;
        }
    }

    /* renamed from: l */
    private static String m2453l(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: m */
    private final void m2454m(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2575m.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: n */
    private static final void m2455n(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: o */
    private static final void m2456o(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: p */
    private static final void m2457p(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079 A[Catch:{ RuntimeException -> 0x007d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor mo3226a(java.lang.CharSequence r12) {
        /*
            r11 = this;
            java.lang.String r0 = "50"
            java.lang.String r1 = ""
            if (r12 != 0) goto L_0x0008
            r12 = r1
            goto L_0x000c
        L_0x0008:
            java.lang.String r12 = r12.toString()
        L_0x000c:
            android.support.v7.widget.SearchView r2 = r11.f2572j
            int r2 = r2.getVisibility()
            r3 = 0
            if (r2 != 0) goto L_0x0085
            android.support.v7.widget.SearchView r2 = r11.f2572j
            int r2 = r2.getWindowVisibility()
            if (r2 == 0) goto L_0x001e
            goto L_0x0085
        L_0x001e:
            android.app.SearchableInfo r2 = r11.f2573k     // Catch:{ RuntimeException -> 0x007d }
            if (r2 != 0) goto L_0x0024
        L_0x0022:
            r12 = r3
            goto L_0x0077
        L_0x0024:
            java.lang.String r4 = r2.getSuggestAuthority()     // Catch:{ RuntimeException -> 0x007d }
            if (r4 != 0) goto L_0x002b
            goto L_0x0022
        L_0x002b:
            android.net.Uri$Builder r5 = new android.net.Uri$Builder     // Catch:{ RuntimeException -> 0x007d }
            r5.<init>()     // Catch:{ RuntimeException -> 0x007d }
            java.lang.String r6 = "content"
            android.net.Uri$Builder r5 = r5.scheme(r6)     // Catch:{ RuntimeException -> 0x007d }
            android.net.Uri$Builder r4 = r5.authority(r4)     // Catch:{ RuntimeException -> 0x007d }
            android.net.Uri$Builder r4 = r4.query(r1)     // Catch:{ RuntimeException -> 0x007d }
            android.net.Uri$Builder r1 = r4.fragment(r1)     // Catch:{ RuntimeException -> 0x007d }
            java.lang.String r4 = r2.getSuggestPath()     // Catch:{ RuntimeException -> 0x007d }
            if (r4 == 0) goto L_0x004b
            r1.appendEncodedPath(r4)     // Catch:{ RuntimeException -> 0x007d }
        L_0x004b:
            java.lang.String r4 = "search_suggest_query"
            r1.appendPath(r4)     // Catch:{ RuntimeException -> 0x007d }
            java.lang.String r8 = r2.getSuggestSelection()     // Catch:{ RuntimeException -> 0x007d }
            if (r8 == 0) goto L_0x005e
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ RuntimeException -> 0x007d }
            r4 = 0
            r2[r4] = r12     // Catch:{ RuntimeException -> 0x007d }
            r9 = r2
            goto L_0x0062
        L_0x005e:
            r1.appendPath(r12)     // Catch:{ RuntimeException -> 0x007d }
            r9 = r3
        L_0x0062:
            java.lang.String r12 = "limit"
            r1.appendQueryParameter(r12, r0)     // Catch:{ RuntimeException -> 0x007d }
            android.net.Uri r6 = r1.build()     // Catch:{ RuntimeException -> 0x007d }
            android.content.Context r12 = r11.f2574l     // Catch:{ RuntimeException -> 0x007d }
            android.content.ContentResolver r5 = r12.getContentResolver()     // Catch:{ RuntimeException -> 0x007d }
            r7 = 0
            r10 = 0
            android.database.Cursor r12 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ RuntimeException -> 0x007d }
        L_0x0077:
            if (r12 == 0) goto L_0x0085
            r12.getCount()     // Catch:{ RuntimeException -> 0x007d }
            return r12
        L_0x007d:
            r12 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r12)
        L_0x0085:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0727ih.mo3226a(java.lang.CharSequence):android.database.Cursor");
    }

    /* renamed from: b */
    public final CharSequence mo3227b(Cursor cursor) {
        String c;
        String c2;
        if (cursor == null) {
            return null;
        }
        String c3 = m2449c(cursor, "suggest_intent_query");
        if (c3 != null) {
            return c3;
        }
        if (this.f2573k.shouldRewriteQueryFromData() && (c2 = m2449c(cursor, "suggest_intent_data")) != null) {
            return c2;
        }
        if (!this.f2573k.shouldRewriteQueryFromText() || (c = m2449c(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0130  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3229e(android.view.View r19, android.database.Cursor r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.Object r0 = r19.getTag()
            r4 = r0
            android.support.v7.widget.ig r4 = (android.support.p033v7.widget.C0726ig) r4
            int r0 = r1.f2583u
            r5 = 0
            r6 = -1
            if (r0 == r6) goto L_0x0019
            int r0 = r2.getInt(r0)
            r7 = r0
            goto L_0x001a
        L_0x0019:
            r7 = 0
        L_0x001a:
            android.widget.TextView r0 = r4.f2566a
            if (r0 == 0) goto L_0x0029
            int r0 = r1.f2578p
            java.lang.String r0 = m2453l(r2, r0)
            android.widget.TextView r8 = r4.f2566a
            m2456o(r8, r0)
        L_0x0029:
            android.widget.TextView r0 = r4.f2567b
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x00a5
            int r0 = r1.f2580r
            java.lang.String r0 = m2453l(r2, r0)
            if (r0 == 0) goto L_0x007b
            android.content.res.ColorStateList r10 = r1.f2577o
            if (r10 != 0) goto L_0x005a
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.Context r11 = r1.f2574l
            android.content.res.Resources$Theme r11 = r11.getTheme()
            r12 = 2130971381(0x7f040af5, float:1.7551499E38)
            r11.resolveAttribute(r12, r10, r9)
            android.content.Context r11 = r1.f2574l
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r10.resourceId
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r1.f2577o = r10
        L_0x005a:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r12 = 0
            r13 = 0
            r14 = 0
            android.content.res.ColorStateList r11 = r1.f2577o
            r16 = 0
            r17 = r11
            r11 = r15
            r6 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            int r0 = r0.length()
            r11 = 33
            r10.setSpan(r6, r5, r0, r11)
            goto L_0x0081
        L_0x007b:
            int r0 = r1.f2579q
            java.lang.String r10 = m2453l(r2, r0)
        L_0x0081:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x0094
            android.widget.TextView r0 = r4.f2566a
            if (r0 == 0) goto L_0x00a0
            r0.setSingleLine(r5)
            android.widget.TextView r0 = r4.f2566a
            r0.setMaxLines(r8)
            goto L_0x00a0
        L_0x0094:
            android.widget.TextView r0 = r4.f2566a
            if (r0 == 0) goto L_0x00a0
            r0.setSingleLine(r9)
            android.widget.TextView r0 = r4.f2566a
            r0.setMaxLines(r9)
        L_0x00a0:
            android.widget.TextView r0 = r4.f2567b
            m2456o(r0, r10)
        L_0x00a5:
            android.widget.ImageView r6 = r4.f2568c
            r10 = 0
            if (r6 == 0) goto L_0x014a
            int r0 = r1.f2581s
            r11 = -1
            if (r0 != r11) goto L_0x00b2
            r0 = r10
            goto L_0x0146
        L_0x00b2:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.m2452k(r0)
            if (r0 != 0) goto L_0x0146
            android.app.SearchableInfo r0 = r1.f2573k
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r11 = r0.flattenToShortString()
            java.util.WeakHashMap r12 = r1.f2575m
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x00e5
            java.util.WeakHashMap r0 = r1.f2575m
            java.lang.Object r0 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00da
            r0 = r10
            goto L_0x013a
        L_0x00da:
            android.content.Context r3 = r1.f2574l
            android.content.res.Resources r3 = r3.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r3)
            goto L_0x013a
        L_0x00e5:
            android.content.Context r12 = r1.f2574l
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            r13 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r13 = r12.getActivityInfo(r0, r13)     // Catch:{ NameNotFoundException -> 0x0122 }
            int r14 = r13.getIconResource()
            if (r14 != 0) goto L_0x00f8
            goto L_0x012b
        L_0x00f8:
            java.lang.String r15 = r0.getPackageName()
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r15, r14, r13)
            if (r12 != 0) goto L_0x012c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Invalid icon resource "
            r12.<init>(r13)
            r12.append(r14)
            java.lang.String r13 = " for "
            r12.append(r13)
            java.lang.String r0 = r0.flattenToShortString()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            android.util.Log.w(r3, r0)
            goto L_0x012b
        L_0x0122:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = r12.toString()
            android.util.Log.w(r3, r0)
        L_0x012b:
            r12 = r10
        L_0x012c:
            if (r12 != 0) goto L_0x0130
            r0 = r10
            goto L_0x0134
        L_0x0130:
            android.graphics.drawable.Drawable$ConstantState r0 = r12.getConstantState()
        L_0x0134:
            java.util.WeakHashMap r3 = r1.f2575m
            r3.put(r11, r0)
            r0 = r12
        L_0x013a:
            if (r0 != 0) goto L_0x0146
            android.content.Context r0 = r1.f2574l
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0146:
            r3 = 4
            m2455n(r6, r0, r3)
        L_0x014a:
            android.widget.ImageView r0 = r4.f2569d
            r3 = 8
            if (r0 == 0) goto L_0x0161
            int r6 = r1.f2582t
            r11 = -1
            if (r6 != r11) goto L_0x0156
            goto L_0x015e
        L_0x0156:
            java.lang.String r2 = r2.getString(r6)
            android.graphics.drawable.Drawable r10 = r1.m2452k(r2)
        L_0x015e:
            m2455n(r0, r10, r3)
        L_0x0161:
            int r0 = r1.f2571a
            if (r0 == r8) goto L_0x0172
            if (r0 != r9) goto L_0x016c
            r0 = r7 & 1
            if (r0 == 0) goto L_0x016c
            goto L_0x0172
        L_0x016c:
            android.widget.ImageView r0 = r4.f2570e
            r0.setVisibility(r3)
            return
        L_0x0172:
            android.widget.ImageView r0 = r4.f2570e
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r4.f2570e
            android.widget.TextView r2 = r4.f2566a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r4.f2570e
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0727ih.mo3229e(android.view.View, android.database.Cursor):void");
    }

    /* renamed from: f */
    public final View mo3230f(ViewGroup viewGroup) {
        View inflate = this.f6210i.inflate(this.f6209h, viewGroup, false);
        inflate.setTag(new C0726ig(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f2576n);
        return inflate;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        Cursor cursor;
        try {
            if (!this.f6201b || (cursor = this.f6203d) == null) {
                return null;
            }
            cursor.moveToPosition(i);
            if (view == null) {
                view = mo5506h(viewGroup);
            }
            mo3229e(view, this.f6203d);
            return view;
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View h = mo5506h(viewGroup);
            if (h != null) {
                ((C0726ig) h.getTag()).f2566a.setText(e.toString());
            }
            return h;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            if (this.f6201b) {
                Cursor cursor = this.f6203d;
                if (cursor == null) {
                    throw new IllegalStateException("this should only be called when the cursor is non-null");
                } else if (cursor.moveToPosition(i)) {
                    if (view == null) {
                        view = mo3230f(viewGroup);
                    }
                    mo3229e(view, this.f6203d);
                    return view;
                } else {
                    throw new IllegalStateException("couldn't move cursor to position " + i);
                }
            } else {
                throw new IllegalStateException("this should only be called when the cursor is valid");
            }
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View f = mo3230f(viewGroup);
            if (f != null) {
                ((C0726ig) f.getTag()).f2566a.setText(e.toString());
            }
            return f;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2457p(this.f6203d);
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2457p(this.f6203d);
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2572j.onQueryRefine((CharSequence) tag);
        }
    }

    /* renamed from: d */
    public final void mo3228d(Cursor cursor) {
        try {
            Cursor cursor2 = this.f6203d;
            if (cursor == cursor2) {
                cursor2 = null;
            } else {
                if (cursor2 != null) {
                    C2184a aVar = this.f6205f;
                    if (aVar != null) {
                        cursor2.unregisterContentObserver(aVar);
                    }
                    DataSetObserver dataSetObserver = this.f6206g;
                    if (dataSetObserver != null) {
                        cursor2.unregisterDataSetObserver(dataSetObserver);
                    }
                }
                this.f6203d = cursor;
                if (cursor != null) {
                    C2184a aVar2 = this.f6205f;
                    if (aVar2 != null) {
                        cursor.registerContentObserver(aVar2);
                    }
                    DataSetObserver dataSetObserver2 = this.f6206g;
                    if (dataSetObserver2 != null) {
                        cursor.registerDataSetObserver(dataSetObserver2);
                    }
                    this.f6204e = cursor.getColumnIndexOrThrow("_id");
                    this.f6201b = true;
                    notifyDataSetChanged();
                } else {
                    this.f6204e = -1;
                    this.f6201b = false;
                    notifyDataSetInvalidated();
                }
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            if (cursor != null) {
                this.f2578p = cursor.getColumnIndex("suggest_text_1");
                this.f2579q = cursor.getColumnIndex("suggest_text_2");
                this.f2580r = cursor.getColumnIndex("suggest_text_2_url");
                this.f2581s = cursor.getColumnIndex("suggest_icon_1");
                this.f2582t = cursor.getColumnIndex("suggest_icon_2");
                this.f2583u = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }
}
