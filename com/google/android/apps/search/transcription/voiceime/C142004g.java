package com.google.android.apps.search.transcription.voiceime;

import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.search.transcription.voiceime.g */
/* compiled from: PG */
public final class C142004g {

    /* renamed from: a */
    private static final Pattern f385313a = Pattern.compile("([a-zA-Z'\"()\\[\\],;]*)(\\p{L}?)([\\w'\"()\\[\\],;]*)");

    /* renamed from: b */
    private static final Pattern f385314b = Pattern.compile("([a-zA-Z'\"()\\[\\],;]*)(\\p{L}?)([\\w'\"()\\[\\],;]*\\s*)");

    /* renamed from: c */
    private static final Pattern f385315c = Pattern.compile("(\\p{L}+?)([a-zA-Z]*)");

    /* renamed from: d */
    private static final Pattern f385316d = Pattern.compile("\\p{Punct}*");

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        r4 = r7.group(2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m230530a(java.lang.CharSequence r9, boolean r10, int r11) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 != 0) goto L_0x008c
            if (r11 != 0) goto L_0x0019
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.StringBuilder r9 = r0.reverse()
            java.lang.String r9 = r9.toString()
        L_0x0019:
            java.util.regex.Pattern r0 = f385313a
            java.util.regex.Matcher r2 = r0.matcher(r9)
            boolean r3 = r2.find()
            if (r3 == 0) goto L_0x008c
            java.lang.String r3 = r2.group()
            r4 = 2
            java.lang.String r5 = r2.group(r4)
            r6 = 1
            r2.group(r6)
            r7 = 3
            r2.group(r7)
            if (r5 != 0) goto L_0x0039
            return r1
        L_0x0039:
            java.util.regex.Pattern r7 = f385315c
            java.util.regex.Matcher r7 = r7.matcher(r3)
            boolean r8 = r7.find()
            if (r8 == 0) goto L_0x0053
            java.lang.String r4 = r7.group(r4)
            if (r4 == 0) goto L_0x0053
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0053
            r4 = 1
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            java.lang.String r2 = r2.group(r6)
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0067
            if (r4 != 0) goto L_0x0067
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r6 = 0
        L_0x0068:
            if (r2 != 0) goto L_0x0075
            if (r6 != 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            if (r11 != 0) goto L_0x0070
            return r1
        L_0x0070:
            int r9 = r5.length()
            return r9
        L_0x0075:
            if (r10 == 0) goto L_0x0079
            java.util.regex.Pattern r0 = f385314b
        L_0x0079:
            java.util.regex.Matcher r9 = r0.matcher(r9)
            boolean r10 = r9.find()
            if (r10 == 0) goto L_0x008c
            java.lang.String r9 = r9.group()
            int r9 = r9.length()
            return r9
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.transcription.voiceime.C142004g.m230530a(java.lang.CharSequence, boolean, int):int");
    }

    /* renamed from: b */
    static String m230531b(String str, CharSequence charSequence, int i) {
        String str2;
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            str2 = str;
        } else {
            str2 = String.valueOf(String.valueOf(charSequence)).concat(String.valueOf(str));
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (TextUtils.getCapsMode(str2, i2 + length, i & 28672) != 0) {
                sb.append(Character.toUpperCase(str.charAt(i2)));
            } else {
                sb.append(str.charAt(i2));
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m230532c(String str) {
        return !TextUtils.isEmpty(str) && f385316d.matcher(str).matches();
    }

    /* renamed from: d */
    public static boolean m230533d(EditorInfo editorInfo) {
        int i = editorInfo.inputType & 4095;
        if (i == 129 || i == 225 || i == 18) {
            return false;
        }
        if (editorInfo.privateImeOptions == null) {
            return true;
        }
        for (String str : editorInfo.privateImeOptions.split(",", -1)) {
            if (str.equals("noMicrophoneKey") || str.equals("nm")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    static boolean m230534e(int i, int i2, int i3) {
        return i >= 0 && i <= i3 && i2 >= 0 && i2 <= i3;
    }

    /* renamed from: f */
    static int m230535f(CharSequence charSequence) {
        return m230530a(charSequence, false, 1);
    }
}
