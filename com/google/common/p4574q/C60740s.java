package com.google.common.p4574q;

import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58687og;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.common.q.s */
/* compiled from: PG */
public final class C60740s implements Comparable, Serializable {

    /* renamed from: a */
    static final Pattern f164761a = Pattern.compile("^(([^:/\\\\?#]+):)?(//([^/\\\\?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?", 32);
    private static final long serialVersionUID = -1105194233979842380L;

    /* renamed from: b */
    public final String f164762b;

    /* renamed from: c */
    public final String f164763c;

    /* renamed from: d */
    public final String f164764d;

    /* renamed from: e */
    public final String f164765e;

    /* renamed from: f */
    public final String f164766f;

    /* renamed from: g */
    public transient Charset f164767g;

    /* renamed from: h */
    private volatile transient C60743v f164768h;

    /* renamed from: i */
    private volatile transient String f164769i;

    public C60740s(String str, String str2, String str3, String str4, String str5, Charset charset) {
        this.f164762b = str == null ? null : C60739r.m92699d(str);
        this.f164763c = str2;
        this.f164764d = str3;
        this.f164765e = str4;
        this.f164766f = str5;
        this.f164767g = charset;
    }

    private C60740s(String str, String str2, String str3, String str4, String str5, Charset charset, String str6) {
        this.f164762b = str;
        this.f164763c = str2;
        this.f164764d = str3;
        this.f164765e = str4;
        this.f164766f = str5;
        this.f164767g = charset;
        this.f164769i = str6;
    }

    /* renamed from: a */
    public static C60740s m92701a(String str) {
        return C60739r.m92696a(str);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f164767g = Charset.forName((String) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f164767g.name());
    }

    /* renamed from: c */
    public final C60743v mo57131c() {
        C60743v vVar;
        if (this.f164768h == null) {
            String str = this.f164765e;
            if (str == null) {
                vVar = C60743v.f164780a;
            } else {
                vVar = new C60743v(new C58687og(C60739r.m92698c(this, str).f164782b));
            }
            this.f164768h = vVar;
        }
        return this.f164768h;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C60740s sVar = (C60740s) obj;
        sVar.getClass();
        return toString().compareTo(sVar.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C60740s)) {
            return false;
        }
        return toString().equals(obj.toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        if (this.f164769i == null) {
            String str = this.f164762b;
            int length = str != null ? str.length() + 1 : 0;
            String str2 = this.f164763c;
            if (str2 != null) {
                length += str2.length() + 2;
            }
            String str3 = this.f164764d;
            if (str3 != null) {
                length += str3.length();
            }
            String str4 = this.f164765e;
            if (str4 != null) {
                length += str4.length() + 1;
            }
            String str5 = this.f164766f;
            if (str5 != null) {
                length += str5.length() + 1;
            }
            StringBuilder sb = new StringBuilder(length);
            String str6 = this.f164762b;
            if (str6 != null) {
                sb.append(str6);
                sb.append(':');
            }
            if (this.f164763c != null) {
                sb.append("//");
                sb.append(this.f164763c);
            }
            String str7 = this.f164764d;
            if (str7 != null) {
                sb.append(str7);
            }
            if (this.f164765e != null) {
                sb.append('?');
                sb.append(this.f164765e);
            }
            if (this.f164766f != null) {
                sb.append('#');
                sb.append(this.f164766f);
            }
            this.f164769i = sb.toString();
        }
        return this.f164769i;
    }

    /* renamed from: b */
    public static C60740s m92702b(String str, Charset charset) {
        str.getClass();
        charset.getClass();
        Matcher matcher = f164761a.matcher(str);
        C58838bb.m90887v(matcher.matches(), "Internal error for URI: %s", str);
        String group = matcher.group(2);
        String group2 = matcher.group(4);
        String e = C58837ba.m90856e(matcher.group(5));
        String group3 = matcher.group(7);
        String group4 = matcher.group(9);
        if ((group == null || group.equals(C60739r.m92699d(group))) && C60742u.f164776a.equals(charset)) {
            return new C60740s(group, group2, e, group3, group4, charset, str);
        }
        return new C60740s(group, group2, e, group3, group4, charset);
    }
}
